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
import CommonClasses.MessageMain;
import CommonClasses.Message;
import java.io.IOException;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
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
        private MessageMain _DecodeJson = new MessageMain();
        @OnMessage
        public void onMessage(String pMessage) 
            {
                try 
                    {
                        GregorianCalendar _calendar = new GregorianCalendar();
                        Date _now = _calendar.getTime();
                        System.out.println("RECEIVED MESSAGE AT: " + _now);
                        System.out.println("-------------RECEIVED MESSAGE-------------");
                        System.out.println("-------------RECEIVED MESSAGE-------------");
                        System.out.println(pMessage);
                        System.out.println("------------END RECEIVED MESSAGE----------");
                        System.out.println("------------END RECEIVED MESSAGE----------");
                        Message _MessageReturn = this._DecodeJson.decodeMessage(pMessage);
                        int _TypeFunctionIdentication = Integer.parseInt(_MessageReturn.getTypeFunction());
                        int _FunctionIdentication = Integer.parseInt(_MessageReturn.getFunction());
                        String[] _Parameters = _MessageReturn.getParameters();
                        DistributeAction.Distribute(_TypeFunctionIdentication,_FunctionIdentication ,_Parameters,_MessageReturn);
                        String _MessageAnswer = this._DecodeJson.codeMessage(_MessageReturn.getTypeFunction(),_MessageReturn.getFunction(), _MessageReturn.getParameters());
                        _now = _calendar.getTime();
                        System.out.println("SEND MESSAGE AT: " + _now);                        
                        System.out.println("-------------SEND MESSAGE-------------");
                        System.out.println("-------------SEND MESSAGE-------------");
                        System.out.println(_MessageAnswer);
                        System.out.println("------------END SEND MESSAGE----------");
                        System.out.println("------------END SEND MESSAGE----------");
                        _MySession.getBasicRemote().sendText(_MessageAnswer);
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
