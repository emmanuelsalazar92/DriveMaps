// Instituto Tecnologico de Costa Rica
// Escuela de Ingenieria en Computacion 
// Componenetes en Comunicaciones en Internet
// Profesor Rodrigo Nuñez Nuñez
// Alumnos:
//      Cesar Peralta
//      Emmanuel Salazar
// BackEnd Primer Proyecto.

package MongoDataAccess;

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
public class UserDataAccess extends MongoDataAccess {
    
    private DBCollection _Collection = getDataBase().getCollection("User");
    public void setCollectionDB(DBCollection pCollection)
    {
        this._Collection = pCollection;
    }
    public DBCollection getCollectionDB()
    {
        return this._Collection;
    }
    public ObjectId insertUser (User pUser)
    {
        BasicDBList _ListDB = new BasicDBList();	
	BasicDBObject _MDoc = new BasicDBObject(
                "UserName",pUser.getUserName())
        .append("UserAccount", pUser.getUserAccount())
        .append("Password",pUser.getPassword())
        .append("IMEI",pUser.getIMEI())
        .append("TotalPoints", 0)
        .append("Missions", _ListDB)
	.append("UnfinishedMissions", _ListDB)
	.append("GainedItems", _ListDB)
	.append("TimePlayed", 0)
	.append("Area", pUser.getArea())
	.append("FBFriends", _ListDB)
	.append("UserCar", 0)
	.append("Active", "true");
	getCollectionDB().insert(_MDoc);
	ObjectId _Ident = (ObjectId)_MDoc.get( "_id" );
	return _Ident;
    }
	
	//agregar en cualquier lista de usuario: Missions, unfinishedMissions, gainedItems, FBFriends
    public void insertInListUser(User pUser, String pList, ObjectId pID)
    {  
	BulkWriteOperation _Builder = getCollectionDB().initializeOrderedBulkOperation();
        _Builder.find(new BasicDBObject("_id", pUser.getId())).updateOne(new BasicDBObject("$push", new BasicDBObject(pList, pID)));
        BulkWriteResult _Result = _Builder.execute();
    }
	
	//eliminar de cualquier lista de usuario
    public void deleteFromListUser(User pUser, String pList, ObjectId pID)
    {  
	BulkWriteOperation _Builder = getCollectionDB().initializeOrderedBulkOperation();
        _Builder.find(new BasicDBObject("_id", pUser.getId())).updateOne(new BasicDBObject("$pull", new BasicDBObject(pList, pID)));
        BulkWriteResult _Result = _Builder.execute();
    }
	
	//set UserName, Account, Password, Imei, active
    public void setNAPI(User pUser, String pType, String pValue)
    {
    	BulkWriteOperation _Builder = getCollectionDB().initializeOrderedBulkOperation();
        _Builder.find(new BasicDBObject("_id", pUser.getId())).updateOne(new BasicDBObject("$set", new BasicDBObject(pType, pValue)));
        BulkWriteResult _Result = _Builder.execute();
    }
	
	// set TotalPoints, timeplayed: los valores se incrementan automaticamente
    public void setPointsTotal(User pUser, String pType, int pValue){
	BulkWriteOperation _Builder = getCollectionDB().initializeOrderedBulkOperation();
        _Builder.find(new BasicDBObject("_id", pUser.getId())).updateOne(new BasicDBObject("$inc", new BasicDBObject(pType, pValue)));
        BulkWriteResult _Result = _Builder.execute();
    }

    public ObjectId insertUser(String pUserName, String pUserAccount, String pPassword, String pIMEI, String pArea) {
        BasicDBList _List = new BasicDBList();	
	BasicDBObject _Mdoc = new BasicDBObject("UserName",pUserName)
        .append("UserAccount", pUserAccount)
        .append("Password",pPassword)
        .append("IMEI",pIMEI)
        .append("TotalPoints", 0)
        .append("Missions", _List)
	.append("UnfinishedMissions", _List)
	.append("GainedItems", _List)
	.append("TimePlayed", 0)
	.append("Area", pArea)
	.append("FBFriends", _List)
	.append("UserCar", 0)
	.append("Active", "true");
	
	getCollectionDB().insert(_Mdoc);
	ObjectId _Ident = (ObjectId)_Mdoc.get( "_id" );
	return _Ident;        
    }

    public boolean VerifyAccount(String pUserAccount) 
    {
        BasicDBObject _Test = new BasicDBObject();
        BasicDBObject _Query = new BasicDBObject("UserAccount",pUserAccount);
        DBObject mdoc = getCollectionDB().findOne(_Query);
        BasicDBObject _Compare = (BasicDBObject)mdoc;
        return _Compare.equals(_Test);
    }

}
