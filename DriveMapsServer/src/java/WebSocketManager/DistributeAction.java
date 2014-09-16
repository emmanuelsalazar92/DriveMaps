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

package WebSocketManager;
import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.io.IOException;
import java.util.Set;
import java.net.UnknownHostException;
import CommonClasses.Message;

public class DistributeAction 
    {
        // This class distribute the message with the respective function or method
        public static void Distribute ( int pIDTypeInstrucction, int pIDInstrucction, String[] pContent, Message _MessageReturn ) 
            {   
                int _TypeFunctionID = pIDTypeInstrucction;
                switch(_TypeFunctionID) 
                    { 
                        case 1: 
                            DistributeActionAdministrator.Distribute(pIDInstrucction, pContent,_MessageReturn);//
                            break; 
                        case 2: 
                            DistributeActionArea.Distribute(pIDInstrucction, pContent,_MessageReturn);//
                            break; 
                        case 3: 
                            DistributeActionGlobalRanking.Distribute(pIDInstrucction, pContent,_MessageReturn);//
                            break; 
                        case 4: 
                            DistributeActionItem.Distribute(pIDInstrucction, pContent,_MessageReturn);//
                            break; 
                        case 5: 
                            DistributeActionMission.Distribute(pIDInstrucction, pContent,_MessageReturn);//
                            break; 
                        case 6: 
                            DistributeActionPlace.Distribute(pIDInstrucction, pContent,_MessageReturn);//
                            break; 
                        case 7: 
                            DistributeActionUser.Distribute(pIDInstrucction, pContent,_MessageReturn);//
                            break;                             
                        default: System.out.println("Error... Distribute Action");//
                            break;
                    }
            }
    }
