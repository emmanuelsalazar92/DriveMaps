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

import com.mongodb.BasicDBObject;
import com.mongodb.DBCursor;
import MongoDataAccess.DataAccess;
import CommonClasses.Message;

public class Item {

    public DataAccess _MongoData = new DataAccess("Item");
    public void CreateItem(String pName, String pPoints, Message pRespuesta)
    {
        try
        {
        BasicDBObject _DBObject = new BasicDBObject();
        _DBObject.put("ItemName",pName);
        _DBObject.put("ItemPoints",pPoints);
        _MongoData.getDBCollection().insert(_DBObject);
        pRespuesta.setParameters(new String[] {"GOOD"});
        }
        catch (Exception pInsertException) 
        {
            pInsertException.printStackTrace();
            pRespuesta.setParameters(new String[] {"ERROR"});
        } 
    }  
    
    public void ReadItem(String pUser, String pPassword,Message pRespuesta)
    {
        int _NumberOfEquals = 0;
        try
        {
        BasicDBObject _DBObject = new BasicDBObject();       
        _DBObject.put("User", new BasicDBObject("AdministratorUser", pUser).append("Password", pPassword));      
        DBCursor _Cursor = _MongoData.getDBCollection().find(_DBObject); 
        while (_Cursor.hasNext()) 
            { 
                _NumberOfEquals++;
                _Cursor.next();
            }
        if(_NumberOfEquals == 1)
            {
                pRespuesta.setParameters(new String[] {"GOOD"});
            }
        else
            {
                pRespuesta.setParameters(new String[] {"ERROR"});
            }
        }
        catch (Exception pInsertException) 
        {
            pInsertException.printStackTrace();
            pRespuesta.setParameters(new String[] {"ERROR"});
        }
        
    } 
}
