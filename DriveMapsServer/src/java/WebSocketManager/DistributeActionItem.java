
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

public class DistributeActionItem 
    {
        // This class distribute the message with the respective function or method
        public static void DistributeItem ( int pIDInstrucction, String[] pContent ) 
            {
                int _FunctionID = pIDInstrucction;
                switch(_FunctionID) 
                    {
                        case 1: Item.createItem(pContent[0], pContent[1]);//
                            break;
                        case 2: Item.deleteItem(pContent[0]);//
                            break;
                        case 3: Item.getItemList();//
                            break;
                        case 4: Item.updateItem(pContent[0], pContent[1], pContent[2]);//
                            break;
                        case 5: Item.getPointsItem(pContent[0]);
                            break;                            
                        default: System.out.println("Error... Distribute Action Item");//
                            break;
                    }
            }
    }
