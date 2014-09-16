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
package CommonClassesApp;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;

public class MessageSerializer implements JsonSerializer<Message> 
{
    @Override
    public JsonElement serialize(final Message pMessage, final Type pType, final JsonSerializationContext pContext) 
    {
        final JsonObject _JSONObject = new JsonObject();
        _JSONObject.addProperty("TypeFunction", pMessage.getTypeFunction());
        _JSONObject.addProperty("Function", pMessage.getFunction());
        final JsonArray _ParametersArray = new JsonArray();
        for (final String _Parameters : pMessage.getParameters()) 
        {
            final JsonPrimitive jsonAuthor = new JsonPrimitive(_Parameters);
            _ParametersArray.add(jsonAuthor);
        }
        _JSONObject.add("Parameters", _ParametersArray);
        return _JSONObject;
    }
}