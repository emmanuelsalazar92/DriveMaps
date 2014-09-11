// Instituto Tecnologico de Costa Rica
// Escuela de Ingenieria en Computacion 
// Componenetes en Comunicaciones en Internet
// Profesor Rodrigo Nuñez Nuñez
// Alumnos:
//      Cesar Peralta
//      Emmanuel Salazar
// BackEnd Primer Proyecto.
package MongoDataAccess;

import Logic.Area;
import Logic.Destiny;
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
public class DestinyDataAccess extends MongoDataAccess {
    		
    DBCollection collection = getDataBase().getCollection("Destiny");

    //insertar Destino
    public ObjectId InsertDestiny (Destiny pDestiny, Area pArea){
	BasicDBObject _Mdoc = new BasicDBObject("Name",pDestiny.getName())
        .append("Location", new BasicDBObject("x", pDestiny.getLocation()[0]).append("y", pDestiny.getLocation()[1]))
        .append("Area", pArea.getId());
		
	collection.insert(_Mdoc);
	ObjectId _Ident = (ObjectId)_Mdoc.get( "_id" );
	return _Ident;
    }
	
	//actualizar posicion en location
    public void InsertLocation(Destiny pDestiny,float pPossitionX, float pPossitionY){  
	BulkWriteOperation builder = collection.initializeOrderedBulkOperation();
        builder.find(new BasicDBObject("_id", pDestiny.getId())).updateOne(new BasicDBObject("$set", new BasicDBObject("Location", new BasicDBObject("x",pPossitionX).append("y", pPossitionY ))));
        BulkWriteResult result = builder.execute();
    }
	
	// set name
    public void setN( Destiny pDestiny, String pType, String pValue){
	BulkWriteOperation _Builder = collection.initializeOrderedBulkOperation();
        _Builder.find(new BasicDBObject("_id", pDestiny.getId())).updateOne(new BasicDBObject("$set", new BasicDBObject(pType, pValue)));
        BulkWriteResult result = _Builder.execute();
    }
    
    public BasicDBList getDestiny(String pDestinyId){
        BasicDBObject _Query = new BasicDBObject("_id",pDestinyId);
        DBObject _Mdoc = collection.findOne(_Query);
        BasicDBList _Destiny = (BasicDBList)_Mdoc.get( "Location" );
        return _Destiny;
	
    }
	
}
