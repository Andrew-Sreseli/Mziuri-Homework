package Homework19Lesson31;

import java.util.ArrayList;

public class Student {

    private final String name;
    private final String surname;
    private final double date;
    private final ArrayList<Integer> grades;

    Student(String name, String surname, double date, ArrayList<Integer> grades){
        this.name=name;
        this.surname=surname;
        this.date=date;
        this.grades=grades;
    }
    String getName(){
        return name;
    }
    String getSurname(){
        return surname;
    }
    double getDate(){
        return date;
    }
    double getGradesAverage(){
        int sum=0;
        for (Integer grade : grades) {
            sum+=grade;
        }
        return (double)sum/grades.size();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", date='" + date + '\'' +
                ", grades=" + grades +
                '}';
    }

}
