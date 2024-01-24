package com.graphqldemo.bookdetails;
import java.util.*;

public class Book {
    
    private String name; 

    private int pageCount;

    private String authorId;
  
    private String id;
  
    public Book(String id, String name, int pageCount, String authorId) {
        this.id = id;
        this.name = name;
        this.pageCount = pageCount;
        this.authorId = authorId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getId(String id) {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getAuthorId() {
        return authorId;
    }
    public void setAuthorId(String authorId) {
        this.authorId = authorId;
    }
    public int getPageCount() {
        return pageCount;
    }
    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }
    private static List<Book> books = Arrays.asList(
        new Book("book-1", "Harry Potter ",223, "author-1") ,
        new Book("book-2", "Moby Dick ",620, "author-2") ,
        new Book("book-3", "the women in cabin 10 ",384 , "author-3")



    );
    public static Book  getById(String id) {
        return books.stream().filter(book -> book.getId("").equals(id)).findFirst().orElse(null);
    }

    
}
