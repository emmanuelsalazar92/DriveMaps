/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TestingAPP;

import java.lang.reflect.Type;

import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

public class BookDeserialiser implements JsonDeserializer<Book> {

  @Override
  public Book deserialize(final JsonElement json, final Type typeOfT, final JsonDeserializationContext context)
      throws JsonParseException {
    final JsonObject jsonObject = json.getAsJsonObject();

    
    final String title = jsonObject.get("title").getAsString();

    final String isbn10 = jsonObject.get("isbn-10").getAsString();
    final String isbn13 = jsonObject.get("isbn-13").getAsString();

    final JsonArray jsonAuthorsArray = jsonObject.get("authors").getAsJsonArray();
    final String[] authors = new String[jsonAuthorsArray.size()];
    for (int i = 0; i < authors.length; i++) {
      final JsonElement jsonAuthor = jsonAuthorsArray.get(i);
      authors[i] = jsonAuthor.getAsString();
    }

    final Book book = new Book();
    book.setTitle(title);
    book.setIsbn10(isbn10);
    book.setIsbn13(isbn13);
    book.setAuthors(authors);
    return book;
  }
}