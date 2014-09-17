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
package ControllerApp;
import ViewApp.*;
import java.lang.reflect.Field;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ActionAdministrator {
    public void Distribute ( int pIDInstrucction, String[] pContent,StartScreen pGUIStart,MainScreen pGUIMain) 
        {
            int _FunctionID = pIDInstrucction;
            switch(_FunctionID) 
                {
                    case 1: 
                        ReceivedReadAdministrator(pContent[0],pGUIStart,pGUIMain);
                        break; 
                    case 2: 
                        ReceivedCreateAdministrator(pContent[0],pGUIStart);
                        break;
                    default: System.out.println("Error... Distribute Action Area");
                        break;
                }
        }
   public void ReceivedReadAdministrator(String pStatus,StartScreen pGUIStart,MainScreen pGUIMain)
   {
        if(pStatus.equals("GOOD"))
        {
            pGUIMain.setVisible(true);
            pGUIStart.setVisible(false);
        }
        else
        {
            pGUIStart.setLblError(true);
        } 
   }
   public void ReceivedCreateAdministrator(String pStatus,StartScreen pGUI)
   {
     
   }   
}
