/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TestingAPP;

/**
 *
 * @author Emmanuel
 */

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.InputStreamReader;
import java.io.Reader;

public class Main2 {
  public static void main(String[] args) throws Exception {
   // Configure Gson
    GsonBuilder gsonBuilder = new GsonBuilder();
    gsonBuilder.registerTypeAdapter(Book.class, new BookDeserialiser());
    Gson gson = gsonBuilder.create();

   // The JSON data
    //try(Reader reader = new InputStreamReader(Main.class.getResourceAsStream("/part1/sample.json"), "UTF-8")){

     // Parse JSON to Java
      Book book = gson.fromJson("{\n" +
"  \"title\": \"Java Puzzlersss: Traps, Pitfalls, and Corner Cases\",\n" +
"  \"isbn-10\": \"032133678X\",\n" +
"  \"isbn-13\": \"978-0321336781\",\n" +
"  \"authors\": [\n" +
"    \"Joshua Bloch\",\n" +
"    \"Neal Gafter\"\n" +
"  ]\n" +
"}", Book.class);
      System.out.println("Mete y saca: "+book.getTitle());
      
    //}
  }
}