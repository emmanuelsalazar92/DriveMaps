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
import Logic.Area;
import Logic.Destiny;
import Logic.GlobalRanking;
import Logic.Mission;
import Logic.User;
import Logic.Administrator;
import com.mongodb.BasicDBList;
import com.mongodb.BasicDBObject;
import com.mongodb.BulkWriteOperation;
import com.mongodb.BulkWriteResult;
import com.mongodb.Cursor;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.ParallelScanOptions;
import java.net.UnknownHostException;
import org.bson.types.ObjectId;

public class MongoDataAccess
{
	private DB _DataBase;
        public void setDataBase(DB pDataBase)
        {
            this._DataBase = pDataBase;
        }
        public DB getDataBase()
        {
            return this._DataBase;
        }
	public MongoDataAccess(String pDatabase)throws UnknownHostException
        {
		MongoClient _MongoClient = new MongoClient( "localhost" , 27017 );
		setDataBase(_MongoClient.getDB( pDatabase ));
	}       
	public MongoDataAccess(){
	}
	//
/*	// single query example
	public ObjectId singleQuery(User user){
		DBCollection collection = db.getCollection("User");
		BasicDBObject query = new BasicDBObject("_id",user.getId());
        DBObject mdoc = collection.findOne(query);
        ObjectId ident = (ObjectId)mdoc.get( "_id" );
        return ident;
	}
*/	
}
