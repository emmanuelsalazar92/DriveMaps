// Instituto Tecnologico de Costa Rica
// Escuela de Ingenieria en Computacion 
// Componenetes en Comunicaciones en Internet
// Profesor Rodrigo Nuñez Nuñez
// Alumnos:
//      Cesar Peralta
//      Emmanuel Salazar
// BackEnd Primer Proyecto.
package MongoDataAccess;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import org.bson.types.ObjectId;

/**
 *
 * @author cesar
 */
public class ItemDataAccess extends MongoDataAccess{
    
    DBCollection collection = getDataBase().getCollection("Item");
		//insertar Item
    public ObjectId InsertItem (String pName, int pPoints){
	BasicDBObject _Mdoc = new BasicDBObject("Name",pName)
        .append("Points",pPoints);
		
	collection.insert(_Mdoc);
	ObjectId _Ident = (ObjectId)_Mdoc.get( "_id" );
	return _Ident;
    }
    
    //get Points Item
    public String getPointsItem (ObjectId pID){
	BasicDBObject _Query = new BasicDBObject("_id",pID);
        DBObject _Mdoc = collection.findOne(_Query);
        String _Points = _Mdoc.get( "Points" ).toString();
        return _Points;
    }
}
