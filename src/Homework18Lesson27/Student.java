package Homework18Lesson27;

public class Student {
    private final String name;
    private final String surname;
    private final String SSN;
    private final int averageScore;
    Student(String name,String surname,String SSN,int averageScore){
        this.name=name;
        this.surname=surname;
        this.SSN=SSN;
        this.averageScore=averageScore;
    }
    String getName(){
        return name;
    }
    String getSurname(){
        return surname;
    }
    String getSSN(){
        return SSN;
    }
    int getAverageScore(){
        return averageScore;
    }

}
