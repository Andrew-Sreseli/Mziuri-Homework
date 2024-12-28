package Homework17Lesson26;

import java.io.Serializable;

public class Book implements Serializable {
    private final String name;
    private final String author;
    private final String idenCode;
    private boolean taken;
    Book(String name,String author,String idenCode,Boolean taken){
        this.name=name;
        this.author=author;
        this.idenCode=idenCode;
        this.taken=taken;
    }
    String getName(){
        return name;
    }
    String getAuthor(){
        return author;
    }
    String getIdenCode(){
        return idenCode;
    }
    Boolean getTaken(){
        return taken;
    }
}
