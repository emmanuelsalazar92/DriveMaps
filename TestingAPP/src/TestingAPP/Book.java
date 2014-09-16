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
public class Book {
    private String[] authors;
    private String isbn10;
    private String isbn13;
    private String title;
    
    public void setAuthors(String[] pAuthors)
    {
        this.authors = pAuthors;
    }
    public void setIsbn10(String pIsbn10)
    {
        this.isbn10 = pIsbn10;
    }
    public void setIsbn13(String pIsbn13)
    {
        this.isbn13 = pIsbn13;
    }
    public void setTitle(String pTitle)
    {
        this.title = pTitle;
    } 
    
    
    public String[] getAuthors()
    {
        return this.authors;
    }
    public String getIsbn10()
    {
        return this.isbn10;
    }
    public String getIsbn13()
    {
        return this.isbn13;
    }
    public String getTitle()
    {
        return this.title;
    }    
    
}
