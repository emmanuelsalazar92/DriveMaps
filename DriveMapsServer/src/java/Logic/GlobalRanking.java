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

public class GlobalRanking {
    private ObjectId Id;
    private ObjectId[] UserId;


    public ObjectId getId() {
            return Id;
    }
    public void setId(ObjectId id) {
            Id = id;
    }
    public ObjectId[] getUserId() {
            return UserId;
    }
    public void setUserId(ObjectId[] userId) {
            UserId = userId;
    }
    
    public static ArrayList<String> getRanking()
    {
        ArrayList<String> _GlobalRanking = new ArrayList<String>();
        // Call the Mongo Data Access
        return _GlobalRanking;
    }
}
