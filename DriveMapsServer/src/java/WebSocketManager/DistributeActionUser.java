
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

public class DistributeActionUser
    {
        // This class distribute the message with the respective function or method
        public static void DistributeUser ( int pIDInstrucction, String[] pContent ) 
            {
                int _FunctionID = pIDInstrucction;
                switch(_FunctionID) 
                    {
                        case 1: User.getDeleteAccount(pContent[0]);//
                            break;
                        case 2: User.saveRanking(pContent[0], pContent[0]);//
                            break;                             
                        default: System.out.println("Error... Distribute Action User");//
                            break;
                    }
            }
    }
