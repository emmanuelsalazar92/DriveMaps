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
package CommonClasses;

import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;


public class MessageDeserializer implements JsonDeserializer<Message> 
{
    @Override
    public Message deserialize(final JsonElement pJSON, final Type pType, final JsonDeserializationContext pContext) throws JsonParseException 
        {
            final JsonObject _JSONObject = pJSON.getAsJsonObject();
            final String _TypeFunction = _JSONObject.get("TypeFunction").getAsString();
            final String _Function = _JSONObject.get("Function").getAsString();
            final JsonArray _ParametersArray = _JSONObject.get("Parameters").getAsJsonArray();
            final String[] _Parameters = new String[_ParametersArray.size()];
            for (int i = 0; i < _Parameters.length; i++) 
                {
                    final JsonElement _jsonParameters = _ParametersArray.get(i);
                    _Parameters[i] = _jsonParameters.getAsString();
                }
            final Message  _message = new Message();
            _message.setTypeFunction(_TypeFunction);
            _message.setFunction(_Function);
            _message.setParameters(_Parameters);
            return _message;
        }
}