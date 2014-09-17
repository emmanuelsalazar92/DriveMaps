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
package SocketApp;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import javax.websocket.ContainerProvider;
import javax.websocket.DeploymentException;
import javax.websocket.Session;
import javax.websocket.WebSocketContainer;
//import ViewApp.*; 
import SocketApp.Client;
public class WebSocket 
{
 
    //public Session _StartScren;
    public Session _MainScreenSesion;
 
    public void start()
             {
 
            WebSocketContainer container = ContainerProvider.getWebSocketContainer();
 
            String uri = "ws://localhost:8080/DriveMapsServer/DriveMapsServer/desktop-client";
            System.out.println("Connecting to " + uri);
            try {
                
                //_StartScren = container.connectToServer(StartScreen.class, URI.create(uri));

                _MainScreenSesion  = container.connectToServer(Client.class, URI.create(uri));
                //_MainScrenSesion = container.connectToServer(, URI.create(uri));
            } catch (DeploymentException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }             
 
    }

}