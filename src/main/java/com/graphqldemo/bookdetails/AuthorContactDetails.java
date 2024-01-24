package com.graphqldemo.bookdetails;
import java.util.Arrays ;
import java.util.List;
public class AuthorContactDetails {
private String id;
private String email ;
private String mobile;
public AuthorContactDetails(String id, String email , String mobile ) {
this.id= id;
this.email=email ;
this.mobile= mobile;
}
//getters and setters for the fields are omitted here
private static List<AuthorContactDetails> contacts = Arrays.asList(
    new AuthorContactDetails( "contact-l", "joanne@gmail.com" , "8888888888") ,
    new AuthorContactDetails( "contact-2", "herman@yahoo.com" , "8888888888") ,
    new AuthorContactDetails( "contact-3", "anne@hotmail.com" , "8888888888") 
) ;


public String getId() {
    return id;
}
public void setId(String id) {
    this.id = id;
}
public String getEmail() {
    return email;
}
public void setEmail(String email) {
    this.email = email;
}
public String getMobile() {
    return mobile;
}
public void setMobile(String mobile) {
    this.mobile = mobile;
}
public static List<AuthorContactDetails> getContacts() {
    return contacts;
}
public static void setContacts(List<AuthorContactDetails> contacts) {
    AuthorContactDetails.contacts = contacts;
}
public static AuthorContactDetails getById(String id) {
    return contacts.stream().filter(author -> author.getId().equals(id)).findFirst().orElse(null) ;
}
}

