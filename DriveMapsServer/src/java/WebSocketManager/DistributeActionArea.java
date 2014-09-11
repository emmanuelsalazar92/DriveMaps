
// Instituto Tecnologico de Costa Rica
// Escuela de Ingenieria en Computacion 
// Componenetes en Comunicaciones en Internet
// Profesor Rodrigo Nuñez Nuñez
// Alumnos:
//      Cesar Peralta
//      Emmanuel Salazar
// BackEnd Primer Proyecto.

package WebSocketManager;
import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;import Logic.*;

public class DistributeActionArea 
    {
        // This class distribute the message with the respective function or method
        public static void DistributeArea ( int pIDInstrucction, String[] pContent ) 
            {
                int _FunctionID = pIDInstrucction;
                switch(_FunctionID) 
                    {
                        case 1: Area.getNearbyPlayers(pContent[1]);//
                            break;
                        case 2: Area.createArea(pContent[1]);//
                            break;
                        case 3: Area.deleteArea(pContent[1]);//
                            break;                            
                        default: System.out.println("Error... Distribute Action Area");//
                            break;
                    }
            }
    }