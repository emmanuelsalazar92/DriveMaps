/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TestingAPP;

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