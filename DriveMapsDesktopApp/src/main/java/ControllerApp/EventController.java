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
import CommonClassesApp.Message;
import CommonClassesApp.MessageMain;

import ViewApp.StartScreen;
import ViewApp.MainScreen;
import java.io.IOException;
import java.util.Arrays;
import LogicApp.LogicAccess;



public class EventController {

    private MessageMain _DecodeJson = new MessageMain();
    
    public void StartScreenController(java.awt.event.ActionEvent pEvent, StartScreen pGUI)
    {
        String _user = pGUI.getTextUserNAme().getText();
        String _password = Arrays.toString(pGUI.getTextUserPassword().getPassword());
        LogicAccess _Content = new LogicAccess();
        _Content.SendMessageStart("1","1", new String[]{_user,_password});
    }
    public void AddAreaController(java.awt.event.ActionEvent pEvent, MainScreen pGUI)
    {
        String _area = pGUI.getAreaName().getText();
        LogicAccess _Content = new LogicAccess();        
        _Content.SendMessageStart("2","2", new String[]{_area});
    } 
    public void AddItemController(java.awt.event.ActionEvent pEvent, MainScreen pGUI)
    {
        String _item = pGUI.getItemName().getText();
        String _point = pGUI.getItemPoints().getText();
        LogicAccess _Content = new LogicAccess();
        _Content.SendMessageStart("4","2", new String[]{_item,_point});
    }     
    public void GetMessage(String pMessage)
    {
        try
        {
        Message _MessageReturn = this._DecodeJson.decodeMessage(pMessage);
        int _TypeFunctionIdentication = Integer.parseInt(_MessageReturn.getTypeFunction());
        int _FunctionIdentication = Integer.parseInt(_MessageReturn.getFunction());
        String[] _Parameters = _MessageReturn.getParameters();
        Distribute(_TypeFunctionIdentication,_FunctionIdentication ,_Parameters);
        }
        catch (Exception ex) 
        {
            ex.printStackTrace();
        }
    }
    public void Distribute ( int pIDTypeInstrucction, int pIDInstrucction, String[] pContent) 
    {   
        int _TypeFunctionID = pIDTypeInstrucction;



        switch(_TypeFunctionID) 
            { 
                case 1: 
                    ActionAdministrator _Administrator = new ActionAdministrator();
                    _Administrator.Distribute(pIDInstrucction, pContent);
                    break; 
                case 2:
                    ActionArea _Area = new ActionArea();
                    _Area.Distribute(pIDInstrucction, pContent);
                    break;  
                case 4:
                    ActionItem _Item = new ActionItem();
                    _Item.Distribute(pIDInstrucction, pContent);
                    break;
                default: System.out.println("Error... Distribute Action");//
                    break;
            }
    }
}
