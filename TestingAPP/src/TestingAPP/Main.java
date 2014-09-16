/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TestingAPP;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {

  public static void main(final String[] args) throws IOException {
    // Configure GSON
      Main prueba = new Main();
      String imprimir = prueba.CrearMensaje("Java Puzzlers: Traps, Pitfalls, and Corner Cases","032133678X","978-0321336781",new String[] { "Joshua Bloch", "Neal Gafter" });
    System.out.println(imprimir);
  }
  public String CrearMensaje(String ptitle,String pisbn10, String pisbn13, String[] pauthors)
  {
    final GsonBuilder gsonBuilder = new GsonBuilder();
    gsonBuilder.registerTypeAdapter(Book.class, new BookSerialiser());
    gsonBuilder.setPrettyPrinting();
    final Gson gson = gsonBuilder.create();

    final Book javaPuzzlers = new Book();
    javaPuzzlers.setTitle(ptitle);
    javaPuzzlers.setIsbn10(pisbn10);
    javaPuzzlers.setIsbn13(pisbn13);
    javaPuzzlers.setAuthors(pauthors);

    // Format to JSON
    final String json = gson.toJson(javaPuzzlers);
    return json;
  }
}