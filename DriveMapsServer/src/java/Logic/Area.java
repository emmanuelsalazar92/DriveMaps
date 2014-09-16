////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////
// Instituto Tecnologico de Costa Rica
// Escuela de Ingenieria en Computacion 
// Componentes en Comunicaciones en Internet
// Profesor Rodrigo Nuñez Nuñez
//
// Alumnos: 
//          Emmanuel Salazar
//          Cesar Peralta
//
////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////
package Logic;

import CommonClasses.Message;
import MongoDataAccess.DataAccess;
import com.mongodb.BasicDBObject;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;

public class Area {

    public DataAccess _MongoData = new DataAccess("Area");
    public void CreateArea(String pArea,  Message pRespuesta)
    {
        try
        {
        BasicDBObject _DBObject = new BasicDBObject();
        _DBObject.put("Name",pArea);
        _DBObject.put("Users",new String[]{});
        _DBObject.put("Ranking",new String[]{});
        _MongoData.getDBCollection().insert(_DBObject);
        pRespuesta.setParameters(new String[] {"GOOD"});
        }
        catch (Exception pInsertException) 
        {
            pInsertException.printStackTrace();
            pRespuesta.setParameters(new String[] {"ERROR"});
        } 
    }  
    
    public void ReadArea(String pArea,Message pRespuesta)
    {
        int _NumberOfEquals = 0;
        try
        {
        BasicDBObject _DBObject = new BasicDBObject();            
        DBCursor _Cursor = _MongoData.getDBCollection().find(); 
        String _Array[] = new String[_Cursor.length()];
        int _Counter = 0;
        while (_Cursor.hasNext()) 
            { 
                _NumberOfEquals++;
                _Array[_Counter] = _Cursor.next().toString();
            }
        pRespuesta.setParameters(_Array);
        }
        catch (Exception pInsertException) 
        {
            pInsertException.printStackTrace();
            pRespuesta.setParameters(new String[] {"ERROR"});
        }
        
    } 
    public void UpdateAreaUsers(String pArea,String[] pUsers,Message pRespuesta)
    {
        try
        {
      
        BasicDBObject _DBObject = new BasicDBObject();       
        _DBObject.put("Name", pArea);      
        DBCursor _Cursor = _MongoData.getDBCollection().find(_DBObject); 
        if(_Cursor.hasNext())
        {
            DBObject _NewUsers = _Cursor.next();
            _NewUsers.put("Users", pUsers);
            _MongoData.getDBCollection().save(_NewUsers);
        }
        pRespuesta.setParameters(new String[] {"GOOD"});
        }
        catch (Exception pInsertException) 
        {
            pInsertException.printStackTrace();
            pRespuesta.setParameters(new String[] {"ERROR"});
        }
        
    }
    public void UpdateAreaRanking(String pArea,String[] pRanking,Message pRespuesta)
    {
        try
        {
      
        BasicDBObject _DBObject = new BasicDBObject();       
        _DBObject.put("Name", pArea);      
        DBCursor _Cursor = _MongoData.getDBCollection().find(_DBObject); 
        if(_Cursor.hasNext())
        {
            DBObject _NewUsers = _Cursor.next();
            _NewUsers.put("Ranking", pRanking);
            _MongoData.getDBCollection().save(_NewUsers);
        }
        pRespuesta.setParameters(new String[] {"GOOD"});
        }
        catch (Exception pInsertException) 
        {
            pInsertException.printStackTrace();
            pRespuesta.setParameters(new String[] {"ERROR"});
        }
        
    }    
   
}
