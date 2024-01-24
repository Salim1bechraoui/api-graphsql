package com.graphqldemo.bookdetails;

import java.util.* ;

public class Author {
    
    private String id;
    private String firstName ;
    private String lastName ;
    private String contactId ;
    private int age ;

   private Author( String id ,String firstName ,String lastName , String contactId ) {
    this.id = id ;
    this.firstName = firstName ;
    this.lastName = lastName ;
    this.contactId = contactId;
   }
    private static List<Author> authors = Arrays.asList(
        new Author( "author-l",  "stone",  "Rowling", "contact-l"),  
        new Author( "author-2", "cold",  "azza", "contact-2"),
        new Author( "author-3", "austin",  "rami","contact-3")
          );
    public static Author getById(String id) {

        return authors.stream().filter(a -> a.getId().equals(id)).findFirst().orElse(null) ;
    }
    public String  getId() {
        return id;

    }
    public String getContactId() {
        return contactId ;
    }




// Getter for lastName


     

}