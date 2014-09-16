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
import Logic.Item;
import CommonClasses.Message;


public class DistributeActionItem
    {
        // This class distribute the message with the respective function or method
        public static void Distribute ( int pIDInstrucction, String[] pContent , Message _MessageReturn) 
            {
                Item _LogicItem = new Item();
                int _FunctionID = pIDInstrucction;
                switch(_FunctionID) 
                    {
                        case 1: _LogicItem.ReadItem(pContent[0], pContent[1], _MessageReturn);
                            break; 
                        case 2: _LogicItem.CreateItem(pContent[0], pContent[1], _MessageReturn);
                            break;
                        default: System.out.println("Error... Distribute Action Item");
                            break;
                    }
            }
    }