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

package LogicApp;

import CommonClassesApp.MessageMain;
import CommonClassesApp.Message;
import SocketApp.WebSocket;
import java.io.IOException;
import ControllerApp.EventController;


public class LogicAccess {
    public WebSocket _Client = new WebSocket();
    private MessageMain _DecodeJson = new MessageMain();
    
    public LogicAccess()
    {
        _Client.start();
    }
    public void SendMessageStart(String pType, String pFunction, String[] pParameters)
    { 
        try 
        {
            MessageMain _Message = new MessageMain();
            String _JSONMessage = _Message.codeMessage(pType, pFunction, pParameters);
            System.out.println(_JSONMessage);
            _Client._StartScren.getBasicRemote().sendText(_JSONMessage);
           

        } catch (IOException e) 
        {
          
            e.printStackTrace();
        }
    }
    public void SendMessageMain(String pType, String pFunction, String[] pParameters)
    { 
        try 
        {
            MessageMain _Message = new MessageMain();
            String _JSONMessage = _Message.codeMessage(pType, pFunction, pParameters);
            System.out.println(_JSONMessage);
            _Client._MainScrenSesion.getBasicRemote().sendText(_JSONMessage);
           

        } catch (IOException e) 
        {
          
            e.printStackTrace();
        }
    }
}
