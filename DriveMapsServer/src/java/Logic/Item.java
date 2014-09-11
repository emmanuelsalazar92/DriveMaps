// Instituto Tecnologico de Costa Rica
// Escuela de Ingenieria en Computacion 
// Componenetes en Comunicaciones en Internet
// Profesor Rodrigo Nuñez Nuñez
// Alumnos:
//      Cesar Peralta
//      Emmanuel Salazar
// BackEnd Primer Proyecto.

package Logic;
import java.util.*;
import java.io.*;
import java.util.ArrayList;
import org.bson.types.ObjectId;
import MongoDataAccess.ItemDataAccess;

//Item
//{
//ItemID: <ItemID>,
//Name: <Name>,
//Points: <Points>					//diferentes items tienen diferentes valores
//}
public class Item {
    private ObjectId Id;
    private String Name;
    private int Points;

    public ObjectId getId() {
            return Id;
    }
    public void setId(ObjectId id) {
            Id = id;
    }
    public String getName() {
            return Name;
    }
    public void setName(String name) {
            Name = name;
    }
    public int getPoints() {
            return Points;
    }
    public void setPoints(int points) {
            Points = points;
    }
    
    
    public static void createItem(String pItemName, String pItemPoints)
    {
        ItemDataAccess _Item = new ItemDataAccess();
        int _ItemPoint = Integer.parseInt(pItemPoints);
        ObjectId _Insert = _Item.InsertItem(pItemName, _ItemPoint);
        if (_Insert.equals(null)){
            System.out.println("Error al ingresar el Item");
        }else{
            System.out.println("Item ID: " + _Insert);
        }
    }
    public static void updateItem(String pItemID, String pItemName, String pItemPoints)
    {
        int _ItemID = Integer.parseInt(pItemID);
        int _ItemPoint = Integer.parseInt(pItemName);
        // Call the Mongo Data Access 
    }
    public static int deleteItem(String pItemID)
    {
        //int _ItemID = Integer.parseInt(pItemID);
        // Call the Mongo Data Access
        int _OKValue = 0;
        return _OKValue;
    }
    public static ArrayList<String> getItemList()
    {
        ArrayList<String> _ItemsList = new ArrayList<String>();
        // Call the Mongo Data Access
        return _ItemsList;        
    }
    public static int getPointsItem(String pItemID)
    {
        ItemDataAccess _Item = new ItemDataAccess();
        ObjectId _ItemID = new ObjectId(pItemID);
        int _ItemPoints = 0;        
        _ItemPoints = Integer.parseInt(_Item.getPointsItem(_ItemID));
        return _ItemPoints;
    }
}
