package Homework16Lesson25;
import java.io.Serializable;

public class Student implements Serializable{
    private final String id;
    private final String name;
    private final int grade;

    Student(String id,String name,int grade){
        this.id=id;
        this.name=name;
        this.grade=grade;
    }

    String getId(){
        return id;
    }
    String getName(){
        return name;
    }
    int getGrade(){
        return grade;
    }

}
