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
import Logic.Area;
import CommonClasses.Message;


public class DistributeActionArea
    {
        // This class distribute the message with the respective function or method
        public static void Distribute ( int pIDInstrucction, String[] pContent , Message _MessageReturn) 
            {
                Area _LogicArea = new Area();
                int _FunctionID = pIDInstrucction;
                switch(_FunctionID) 
                    {
                        case 1: _LogicArea.ReadArea(pContent[0], _MessageReturn);
                            break; 
                        case 2: _LogicArea.CreateArea(pContent[0],  _MessageReturn);
                            break;
                        case 3: _LogicArea.UpdateAreaUsers(pContent[0], pContent, _MessageReturn);
                            break;
                        case 4: _LogicArea.UpdateAreaRanking(pContent[0],pContent,  _MessageReturn);
                            break;                            
                        default: System.out.println("Error... Distribute Action Area");
                            break;
                    }
            }
    }