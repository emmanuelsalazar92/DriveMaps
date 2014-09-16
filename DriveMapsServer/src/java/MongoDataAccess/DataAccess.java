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

package MongoDataAccess;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;

public final class DataAccess 
{

    private   MongoClient _MongoClient;
    private   DB _DataBase;
    private   DBCollection _Collection;
   
    public   void setMongoClient(MongoClient pMongoClient)
    {
        this._MongoClient = pMongoClient;
    }
    public   MongoClient getMongoClient()
    {
        return this._MongoClient;
    }
    public   void setDB(DB pDB)
    {
        this._DataBase = pDB;
    }
    public   DB getDB()
    {
        return this._DataBase;
    }
    public   void setDBCollection(DBCollection pDBCollection)
    {
        this._Collection = pDBCollection;
    }
    public   DBCollection getDBCollection()
    {
        return this._Collection;
    }    
    public DataAccess(String pCollection) 
    {
        try{
        this.setMongoClient(new MongoClient());
        this.setDB(this.getMongoClient().getDB("DriveMapsTest"));
        this.setDBCollection(this.getDB().getCollection(pCollection));
        }
        catch (Exception pknownHostException )
        {
            System.out.println(pknownHostException.toString());
        }
    }
    
}
