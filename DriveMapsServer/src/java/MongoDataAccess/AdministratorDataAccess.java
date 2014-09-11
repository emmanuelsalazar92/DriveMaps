// Instituto Tecnologico de Costa Rica
// Escuela de Ingenieria en Computacion 
// Componenetes en Comunicaciones en Internet
// Profesor Rodrigo Nuñez Nuñez
// Alumnos:
//      Cesar Peralta
//      Emmanuel Salazar
// BackEnd Primer Proyecto.

package MongoDataAccess;

import Logic.Administrator;
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
public class AdministratorDataAccess extends MongoDataAccess{
    DBCollection collection = getDataBase().getCollection("Administrator");
    
    public ObjectId InsertAdministrator (String pUserName, String pUserAccount, String pPassword){
        BasicDBList _List = new BasicDBList();	
	BasicDBObject _Mdoc = new BasicDBObject("UserName",pUserName)
        .append("UserAccount",pUserAccount )
        .append("Password",pPassword)
	.append("Area", _List);
	
	collection.insert(_Mdoc);
	ObjectId _Ident = (ObjectId)_Mdoc.get( "_id" );
	return _Ident;
    }
	//agregar en Area
    public void InsertInListAdmi(Administrator pAdmi, String pList, ObjectId pID){  
	BulkWriteOperation _Builder = collection.initializeOrderedBulkOperation();
        _Builder.find(new BasicDBObject("_id", pAdmi.getId())).updateOne(new BasicDBObject("$push", new BasicDBObject(pList, pID)));
        BulkWriteResult _Result = _Builder.execute();
    }
   
    	//set UserName, Account, Password
    public void setNAPI(Administrator pAdmi, String pType, String pValue){
    	BulkWriteOperation _Builder = collection.initializeOrderedBulkOperation();
        _Builder.find(new BasicDBObject("_id", pAdmi.getId())).updateOne(new BasicDBObject("$set", new BasicDBObject(pType, pValue)));
        BulkWriteResult _Result = _Builder.execute();
    }

    public boolean VerifyAccount(String pUserAccount) {
        BasicDBObject _Test = new BasicDBObject();
        BasicDBObject _Query = new BasicDBObject("UserAccount",pUserAccount);
        DBObject _Mdoc = collection.findOne(_Query);
        BasicDBObject _Compare = (BasicDBObject)_Mdoc;
        return _Compare.equals(_Test);}
}
