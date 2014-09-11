// Instituto Tecnologico de Costa Rica
// Escuela de Ingenieria en Computacion 
// Componenetes en Comunicaciones en Internet
// Profesor Rodrigo Nuñez Nuñez
// Alumnos:
//      Cesar Peralta
//      Emmanuel Salazar
// BackEnd Primer Proyecto.

package WebSocketManager;



import java.io.BufferedReader; 
import java.io.FileInputStream; 
import java.io.FileNotFoundException; 
import java.io.InputStreamReader; 
import com.google.gson.Gson; 
import com.google.gson.JsonArray; 
import com.google.gson.JsonObject; 
import java.util.ArrayList;

public class JsonDecodificator
{
    private static int _IDTypeFunction;
    private static int _IDFunction;
    private static String[] _ParametersFunction;
    
    public static void setIDTypeFunction(int pIDFunction)
    {
       _IDFunction = pIDFunction;
    }
    public static int getIDTypeFunction()
    {
        return _IDFunction;
    }    
    public static void setIDFunction(int pIDFunction)
    {
       _IDFunction = pIDFunction;
    }
    public static int getIDFunction()
    {
        return _IDFunction;
    }
    public static void setParameters(String[] pIDFunction)
    {
        _ParametersFunction = pIDFunction;
    }
    public static String[] getParameters()
    {
        return _ParametersFunction;
    }    
    public static void DecodeMessage(String pMessage) 
    {
        Gson gson = new Gson(); 
        JsonObject _Json = gson.fromJson(pMessage, JsonObject.class); 
        JsonArray _jsonRequest = _Json.getAsJsonArray("jsonRequest"); 
        JsonObject _ContentParameter = _jsonRequest.get(0).getAsJsonObject(); 
        setIDTypeFunction(_ContentParameter.get("IDTypeFunction").getAsInt());
        setIDFunction(_ContentParameter.get("IDFunction").getAsInt());
        JsonArray _Parameters = _ContentParameter.get("Parameters").getAsJsonArray(); 
        String[] _ParametersInput = new String[_Parameters.size()];
        for(int _ArrayParametersTotal = 0; _ArrayParametersTotal < _Parameters.size(); _ArrayParametersTotal++)
        { 
            JsonObject _ParameterContent = _Parameters.get(_ArrayParametersTotal).getAsJsonObject();
            _ParametersInput[_ArrayParametersTotal] = _ParameterContent.get("Parameter").getAsString();
        } 
        setParameters(_ParametersInput);        
    }  
}