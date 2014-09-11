
package WebSocketManager;
import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import Logic.*;


// Instituto Tecnologico de Costa Rica
// Escuela de Ingenieria en Computacion 
// Componenetes en Comunicaciones en Internet
// Profesor Rodrigo Nuñez Nuñez
// Alumnos:
//      Cesar Peralta
//      Emmanuel Salazar
// BackEnd Primer Proyecto.




public class DistributeActionMission
    {
        // This class distribute the message with the respective function or method
        public static void DistributeMission ( int pIDInstrucction, String[] pContent ) 
            {
                int _FunctionID = pIDInstrucction;
                switch(_FunctionID) 
                    {
                        case 1: Mission.getNumberPauses(pContent[0]);//
                            break;
                        case 2: Mission.getPauseMission(pContent[0]);//
                            break;
                        case 3: Mission.getDeleteMission(pContent[0]);//
                            break;
                        case 4: Mission.getPointsDrivingOutStreet(pContent[0]);//
                            break;
                        case 5: Mission.getPointsHit(pContent[0]);//
                            break;
                        case 6: Mission.getPointsMissionCancel(pContent[0]);//
                            break;
                        case 7: Mission.createMission(pContent[0], pContent[1], pContent[2], pContent[3],pContent[4]);//
                            break;
                        case 8: Mission.calculateTime(pContent[0], pContent[1]);
                            break;                           
                        default: System.out.println("Error... Distribute Action Mission");//
                            break;
                    }
            }
    }
