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

public class ActionArea {
    public void Distribute ( int pIDInstrucction, String[] pContent) 
        {
            int _FunctionID = pIDInstrucction;
            switch(_FunctionID) 
                {
                    case 1: 
                        ReceivedReadArea(pContent[0]);
                        break;                 
                    case 2: 
                        ReceivedCreateArea(pContent[0]);
                        break; 
                    default: System.out.println("Error... Distribute Action Area");
                        break;
                }
        }
   public void ReceivedReadArea(String pStatus)
   {
        if(pStatus.equals("GOOD"))
        {
            MainScreen _Main = new MainScreen();
            _Main.setAlertNewArea(true);
            _Main.setVisible(true);
        }
        else
        {
            MainScreen _Main = new MainScreen();
            _Main.setVisible(true);
        }
   }    
   public void ReceivedCreateArea(String pStatus)
   {
        if(pStatus.equals("GOOD"))
        {
            MainScreen _Main = new MainScreen();
            _Main.setAlertNewArea(true);
            _Main.setVisible(true);
        }
        else
        {
            MainScreen _Main = new MainScreen();
            _Main.setVisible(true);
        }
   }
   
}
