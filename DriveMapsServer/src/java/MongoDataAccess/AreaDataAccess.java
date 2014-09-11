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
import com.mongodb.BasicDBList;
import com.mongodb.BasicDBObject;
import com.mongodb.BulkWriteOperation;
import com.mongodb.BulkWriteResult;
import com.mongodb.DBCollection;
import org.bson.types.ObjectId;

/**
 *
 * @author cesar
 */
public class AreaDataAccess extends MongoDataAccess{
   DBCollection collection = getDataBase().getCollection("Area");

    //insertar Area
    public ObjectId InsertArea (String pName){
	BasicDBList _List = new BasicDBList();
	BasicDBObject _Mdoc = new BasicDBObject("Name",pName)
        .append("UserId", _List)
	.append("Ranking", _List);
			
	collection.insert(_Mdoc);
	ObjectId _Ident = (ObjectId)_Mdoc.get( "_id" );
	return _Ident;
    }	

	//agregar en cualquier lista de area: userIds , ranking
    public void insertInListArea(Area pArea, String pList, ObjectId pID){  
	BulkWriteOperation _Builder = collection.initializeOrderedBulkOperation();
        _Builder.find(new BasicDBObject("_id", pArea.getId())).updateOne(new BasicDBObject("$push", new BasicDBObject(pList, pID)));
        BulkWriteResult result = _Builder.execute();
    }
	
	//eliminar de cualquier lista de area
    public void deleteFromListArea(Area pArea, String pList, ObjectId pID){  
     	BulkWriteOperation _Builder = collection.initializeOrderedBulkOperation();
        _Builder.find(new BasicDBObject("_id", pArea.getId())).updateOne(new BasicDBObject("$pull", new BasicDBObject(pList, pID)));
        BulkWriteResult _Result = _Builder.execute();
    }    

    
}
