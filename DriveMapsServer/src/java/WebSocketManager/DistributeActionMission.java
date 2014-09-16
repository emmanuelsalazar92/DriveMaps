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
import java.util.Set;
import Logic.Administrator;
import CommonClasses.Message;


public class DistributeActionMission
    {
        // This class distribute the message with the respective function or method
        public static void Distribute ( int pIDInstrucction, String[] pContent , Message _MessageReturn) 
            {
                Administrator _LogicAdministrator = new Administrator();
                int _FunctionID = pIDInstrucction;
                switch(_FunctionID) 
                    {
                        case 1: _LogicAdministrator.ReadAdministrator(pContent[0], pContent[1], _MessageReturn);
                            break; 
                        case 2: _LogicAdministrator.CreateAdministrator(pContent[0], pContent[1], _MessageReturn);
                            break;
                        default: System.out.println("Error... Distribute Action Mission");
                            break;
                    }
            }
    }