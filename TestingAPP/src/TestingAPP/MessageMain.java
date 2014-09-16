

package TestingAPP;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


public class MessageMain 
    {
        public Message decodeMessage(String pMessage) throws Exception 
            {
                GsonBuilder _GSONBuilder = new GsonBuilder();
                _GSONBuilder.registerTypeAdapter(Message.class,new MessageDeserializer());
                Gson _GSON = _GSONBuilder.create();
                Message _Message = _GSON.fromJson(pMessage, Message.class);
                return _Message;
            }  
        public String codeMessage(String pTypeFunction,String pFunction, String[] pParameters)
            {
                final GsonBuilder _GSONBuilder = new GsonBuilder();
                _GSONBuilder.registerTypeAdapter(Message.class, new MessageSerializer());
                _GSONBuilder.setPrettyPrinting();
                final Gson _GSON = _GSONBuilder.create();
                final Message _Message = new Message();
                _Message.setTypeFunction(pTypeFunction);
                _Message.setFunction(pFunction);
                _Message.setParameters(pParameters);
                final String _JSON = _GSON.toJson(_Message);
                return _JSON;
            }
    }
