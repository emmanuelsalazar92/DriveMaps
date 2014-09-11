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

public class DistributeAction 
    {
        // This class distribute the message with the respective function or method
        public static void Distribute ( int pIDTypeInstrucction, int pIDInstrucction, String[] pContent ) 
            {
                int _TypeFunctionID = pIDTypeInstrucction;
                switch(_TypeFunctionID) 
                    {
                        case 1: DistributeActionMission.DistributeMission(pIDInstrucction, pContent);//
                            break;
                        case 2: DistributeActionUser.DistributeUser(pIDInstrucction, pContent);
                            break;
                        case 3: DistributeActionItem.DistributeItem(pIDInstrucction, pContent);
                            break;
                        case 4: DistributeActionGlobalRanking.DistributeGlobalRanking(pIDInstrucction, pContent);//
                            break;
                        case 5: DistributeActionArea.DistributeArea(pIDInstrucction, pContent);//
                            break;                           
                        default: System.out.println("Error... Distribute Action");//
                            break;
                    }
            }
    }
