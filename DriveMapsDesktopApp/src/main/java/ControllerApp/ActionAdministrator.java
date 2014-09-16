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
    public void Distribute ( int pIDInstrucction, String[] pContent) 
        {
            int _FunctionID = pIDInstrucction;
            switch(_FunctionID) 
                {
                    case 1: 
                        ReceivedReadAdministrator(pContent[0]);
                        break; 
                    case 2: 
                        ReceivedCreateAdministrator(pContent[0]);
                        break;
                    default: System.out.println("Error... Distribute Action Area");
                        break;
                }
        }
   public void ReceivedReadAdministrator(String pStatus)
   {
        if(pStatus.equals("GOOD"))
        {
            MainScreen _Main = new MainScreen();
            _Main.setVisible(true);
        }
        else
        {
            StartScreen _Start  = new StartScreen();
            _Start.setLblError(true);
            _Start.setVisible(true);
        }
   }
   public void ReceivedCreateAdministrator(String pStatus)
   {
       
   }   
}
