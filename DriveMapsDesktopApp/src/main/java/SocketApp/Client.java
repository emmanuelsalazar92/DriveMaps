/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SocketApp;

import java.util.Date;
import java.util.GregorianCalendar;
import javax.websocket.ClientEndpoint;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import ViewApp.*;
import ControllerApp.EventController;

/**
 *
 * @author Emmanuel
 */
@ClientEndpoint
public class Client {
    
    public static StartScreen _Start = new StartScreen();
    public static MainScreen _Main = new MainScreen();
    public static void main(String[] args) throws Exception {
        _Start.setVisible(true);
        _Main.setVisible(false);
    }
    
    
    
    @OnOpen
    public void onOpen(Session pSession) 
    {
        System.out.println("Connected to endpoint: " + pSession.getBasicRemote() );
    }
 
    @OnMessage
    public void onMessage(String pMessage) 
    {
        GregorianCalendar _calendar = new GregorianCalendar();
        Date _now = _calendar.getTime();
        System.out.println(_now);
        System.out.println(pMessage);
        EventController _getMessage = new EventController();
        _getMessage.GetMessage(pMessage, _Start,_Main);
        
    }

    @OnError
    public void onError(Throwable pTrace) 
    {
        pTrace.printStackTrace();
    } 

}
