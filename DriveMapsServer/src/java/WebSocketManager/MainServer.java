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
import javax.websocket.Endpoint;
import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint("/DriveMapsServer/{client-id}")
public class MainServer 
{

        private static Set<Session> _Players = Collections.synchronizedSet(new HashSet<Session>());
        private Session _MySession;
        private static JsonDecodificator _DecodeJson = new JsonDecodificator();
        @OnMessage
        public void onMessage(String pMessage) 
            {
                try 
                    {
                        System.out.println(pMessage);
            _MySession.getBasicRemote().sendText("Yo soy el server todo poderoso: " + pMessage + pMessage + "LOL");
                        _DecodeJson.DecodeMessage(pMessage);
                        String _DecodeTheMessage[] = new String[_DecodeJson.getParameters().length];
                        _DecodeTheMessage = _DecodeJson.getParameters();
                        int _TypeFunctionIdentication = _DecodeJson.getIDFunction();
                        int _FunctionIdentication = _DecodeJson.getIDFunction();
                        DistributeAction.Distribute(_TypeFunctionIdentication,_FunctionIdentication ,_DecodeTheMessage);
                        _MySession.getBasicRemote().sendText(pMessage);
                    } 
        catch (Exception ex) 
        {
            ex.printStackTrace();
        }
    }

    @OnOpen
    public void onOpen(Session peer) {
        _Players.add(peer);
        _MySession = peer;
    }

    @OnClose
    public void onClose(Session peer) {
        _Players.remove(peer);
    }  
}
