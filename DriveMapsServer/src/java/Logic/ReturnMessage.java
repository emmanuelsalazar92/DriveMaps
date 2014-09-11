/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logic;

/**
 *
 * @author cesar
 */
public class ReturnMessage {
    
    private static String _AnswerRequest;
    public static void setAnswer(String pAnswerMessage)
    {
       _AnswerRequest = pAnswerMessage; 
    }
    public static String getAnswet()
    {
        return _AnswerRequest;
    }
}
