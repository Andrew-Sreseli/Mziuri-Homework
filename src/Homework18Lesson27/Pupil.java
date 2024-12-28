package Homework18Lesson27;

import java.util.ArrayList;

public class Pupil {
    String ID;
    String name;
    String surname;
    ArrayList<Integer> gradeList;
    Pupil(String ID,String name,String surname,ArrayList<Integer> gradeList){
        this.ID=ID;
        this.name=name;
        this.surname=surname;
        this.gradeList.addAll(gradeList);
    }
    void averageScore(ArrayList<Integer> gradeList){
        int sum=0;
        for (Integer integer : gradeList) {
            sum += integer;
        }
        System.out.println((double)sum/gradeList.size());
    }
}
