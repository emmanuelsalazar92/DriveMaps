// Instituto Tecnologico de Costa Rica
// Escuela de Ingenieria en Computacion 
// Componenetes en Comunicaciones en Internet
// Profesor Rodrigo Nuñez Nuñez
// Alumnos:
//      Cesar Peralta
//      Emmanuel Salazar
// BackEnd Primer Proyecto.

package MongoDataAccess;

import Logic.Item;
import Logic.Mission;
import Logic.User;
import com.mongodb.BasicDBList;
import com.mongodb.BasicDBObject;
import com.mongodb.BulkWriteOperation;
import com.mongodb.BulkWriteResult;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import org.bson.types.ObjectId;

/**
 *
 * @author cesar
 */
public class MissionDataAccess extends MongoDataAccess{
    
    DBCollection collection = getDataBase().getCollection("Mission");
	//insertar Mission
    public ObjectId insertMission (String pUserId,String pItemId,String pDestiny, String pLatitudeOrigin, String pLengthOrigin)
    {    
        DestinyDataAccess _Destiny = new DestinyDataAccess();
        BasicDBList _List = _Destiny.getDestiny(pDestiny);
        BasicDBObject _Mdoc = new BasicDBObject("UserId",pUserId)
        .append("ItemId", pItemId)
        .append("Start", new BasicDBObject("x", pLatitudeOrigin).append("y",pLengthOrigin))
        .append("Destiny", _List)
	.append("ActualPosition", new BasicDBObject("x", pLatitudeOrigin).append("y", pLengthOrigin))
	.append("Pauses", 0)
	.append("Points", 0)
	.append("Time", 0)
	.append("Recieved", "false")
	.append("Finished", "false");
	collection.insert(_Mdoc);
	ObjectId _Ident = (ObjectId)_Mdoc.get( "_id" );
	return _Ident;
    }
	
	//actualizar posicion en actualPosition
    public void insertPositionMission(Mission pMission,float pPossitionX, float pPossitionY){  
	BulkWriteOperation _Builder = collection.initializeOrderedBulkOperation();
        _Builder.find(new BasicDBObject("_id", pMission.getId())).updateOne(new BasicDBObject("$set", new BasicDBObject("ActualPosition", new BasicDBObject("x",pPossitionX).append("y", pPossitionY ))));
        BulkWriteResult _Result = _Builder.execute();
    }
	

	//set pauses, points, time   ----------------  se incrementa solo
    public void setPPT(Mission pMission, String pType, int pValue){
	BulkWriteOperation _Builder = collection.initializeOrderedBulkOperation();
	_Builder.find(new BasicDBObject("_id", pMission.getId())).updateOne(new BasicDBObject("$inc", new BasicDBObject(pType, pValue)));
	BulkWriteResult _Result = _Builder.execute();
    }
	
	// set received, finished
    public void setRF( Mission pMission, String pType, String pValue){
	BulkWriteOperation _Builder = collection.initializeOrderedBulkOperation();
        _Builder.find(new BasicDBObject("_id", pMission.getId())).updateOne(new BasicDBObject("$set", new BasicDBObject(pType, pValue)));
        BulkWriteResult _Result = _Builder.execute();
    }
    
    public int getPauses(String pID){
	BasicDBObject _Query = new BasicDBObject("_id",pID);
        DBObject _Mdoc = collection.findOne(_Query);
        int _Pauses = Integer.parseInt(_Mdoc.get( "Pauses" ).toString());
        return _Pauses;
    }
    public int getPoints(String pID){
	BasicDBObject _Query = new BasicDBObject("_id",pID);
        DBObject _Mdoc = collection.findOne(_Query);
        int _Points = Integer.parseInt(_Mdoc.get( "Points" ).toString());
        return _Points;
    }

    
}
