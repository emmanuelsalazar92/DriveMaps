// Instituto Tecnologico de Costa Rica
// Escuela de Ingenieria en Computacion 
// Componenetes en Comunicaciones en Internet
// Profesor Rodrigo Nuñez Nuñez
// Alumnos:
//      Cesar Peralta
//      Emmanuel Salazar
// BackEnd Primer Proyecto.

package Logic;
import MongoDataAccess.AreaDataAccess;
import MongoDataAccess.ItemDataAccess;
import java.io.*;
import java.util.*;
import java.util.ArrayList;
import org.bson.types.ObjectId;

//Area							// area puede ser San Jose, Cartago, Costa Rica... etc
//{
//AreaID: <AreaID>,
//Name: <Name>,
//Users: 
//	[ {
//		User: <UserID>
//	} ],
//Ranking:						 
//	[ {
// 		User: <UserID>,
//		Points: <Points>
//	} ]
//}
public class Area {
    
    	private ObjectId _Id;
	private static String _Name;
	private ObjectId[] _UserId;
	private ObjectId[] _Ranking;
	
	public ObjectId getId() {
		return _Id;
	}
	public void setId(ObjectId id) {
		_Id = id;
	}
	public String getName() {
		return _Name;
	}
	public void setName(String name) {
		_Name = name;
	}
	public ObjectId[] getUserId() {
		return _UserId;
	}
	public void setUserId(ObjectId[] userId) {
		_UserId = userId;
	}
	public ObjectId[] getRanking() {
		return _Ranking;
	}
	public void setRanking(ObjectId[] ranking) {
		_Ranking = ranking;
	}

   public static void createArea(String pName)
   {
        AreaDataAccess _Item = new AreaDataAccess();
        ObjectId _Insert = _Item.InsertArea(pName);
        if (_Insert.equals(null)){
            System.out.println("Error al ingresar el Area");
        }else{
            System.out.println("Area ID: " + _Insert);
        }
       
   }
   public static ArrayList<String> getNearbyPlayers(String pUserID)
   {
        int _UserID = Integer.parseInt(pUserID);
        ArrayList<String> _NearbyPlayers = new ArrayList<String>();
        // Call the Mongo Data Access
        return _NearbyPlayers;       
   }
   public static void deleteArea(String pAreaID)
   {
        //int _AreaID = Integer.parseInt(pAreaID);
       // Call de Mongo Data Access
   }
}
