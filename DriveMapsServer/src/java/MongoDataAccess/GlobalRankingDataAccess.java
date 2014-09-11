/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MongoDataAccess;

import Logic.User;
import com.mongodb.BasicDBList;
import com.mongodb.BasicDBObject;
import com.mongodb.BulkWriteOperation;
import com.mongodb.BulkWriteResult;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
//import javafx.scene.Cursor.cursor;
import org.bson.types.ObjectId;

/**
 *
 * @author cesar
 */
public class GlobalRankingDataAccess extends MongoDataAccess{
 
    DBCollection collection = getDataBase().getCollection("GlobalRanking");

    //insertar Ranking
    public ObjectId InsertRanking (String pUserId, String pPoints){
	BasicDBList _List = new BasicDBList();
	BasicDBObject _Mdoc = new BasicDBObject("Ranking",_List);
		
	collection.insert(_Mdoc);
	ObjectId _Ident = (ObjectId)_Mdoc.get( "_id" );
	return _Ident;
    }
	

    //actualizar rankihg
    public void ActualizeRanking(String pRankingId,String pUserId, String pUserPoints)
    { 

        BasicDBObject query = new BasicDBObject("Ranking",new BasicDBObject("UserId",pUserId));
        DBObject _Mdoc = collection.findOne(query);
        ObjectId _Ident = (ObjectId)_Mdoc.get( "UserId" );
	BulkWriteOperation _Builder = collection.initializeOrderedBulkOperation();
        _Builder.find(new BasicDBObject("_id", pRankingId)).updateOne(new BasicDBObject("$set",new BasicDBObject("Points", pUserPoints)));
        BulkWriteResult result = _Builder.execute();    
    }
	
    
}
