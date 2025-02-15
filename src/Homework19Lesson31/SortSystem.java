package Homework19Lesson31;

import java.util.ArrayList;

public class SortSystem {
    public static void sort1Increasing(ArrayList<BasketballPlayer> arrayList){
        int n=arrayList.size();
        boolean a;
        for (int i = 0; i < n; i++) {
            a=false;
            for(int k = 1; k < n-i ; k++) {
                if (arrayList.get(k).getAllBallSituationSum() < arrayList.get(k - 1).getAllBallSituationSum()) {
                    BasketballPlayer object1 = arrayList.get(k);
                    arrayList.set(k, arrayList.get(k - 1));
                    arrayList.set(k - 1, object1);
                    a=true;
                }
                if(!a) break;
            }
        }
    }
    public static void sort1Decreasing(ArrayList<BasketballPlayer>arrayList){
        int n=arrayList.size();
        boolean a;
        for (int i = 0; i < n; i++) {
            a=false;
            for(int k = 1; k < n-i ; k++) {
                if (arrayList.get(k).getAllBallSituationSum() > arrayList.get(k - 1).getAllBallSituationSum()) {
                    BasketballPlayer object1 = arrayList.get(k);
                    arrayList.set(k, arrayList.get(k - 1));
                    arrayList.set(k - 1, object1);
                    a=true;
                }
                if(!a) break;
            }
        }
    }

    public static double returnStatement(Student object,String a){
        if(a.equals("averageGrade")) return object.getGradesAverage();
        if(a.equals("date")) return object.getDate();
        else return 0;
    }

    public static void sort2(ArrayList<Student>arrayList,String b){
        int n=arrayList.size();
        boolean a;
        for (int i = 0; i < n; i++) {
            a=false;
            for(int k = 1; k < n-i ; k++) {
                if (returnStatement(arrayList.get(k),b) < returnStatement(arrayList.get(k-1),b)) {
                    Student object1 = arrayList.get(k);
                    arrayList.set(k, arrayList.get(k - 1));
                    arrayList.set(k - 1, object1);
                    a=true;
                }
                if(!a) break;
            }
        }
    }

    public static void sort2alphabetically(ArrayList<Student>arrayList){
        int n=arrayList.size();
        boolean a;
        for (int i = 0; i < n; i++) {
            a=false;
            for(int k = 1; k < n-i ; k++) {
                if (arrayList.get(k).getName().compareTo(arrayList.get(k-1).getName()) < 0) {
                    Student object1 = arrayList.get(k);
                    arrayList.set(k, arrayList.get(k - 1));
                    arrayList.set(k - 1, object1);
                    a=true;
                }
                if(!a) break;
            }
        }
    }

    public static double returnStatementThird(Car.Engine object,String a){
        if(a.equals("date")) return object.getReleaseDate();
        if(a.equals("mileage")) return object.getMileage();
        if(a.equals("Engine volume")) return object.getVolume();
        else return 0;
    }

    public static void sort3(ArrayList<Car.Engine>arrayList,String b){
        int n=arrayList.size();
        boolean a;
        for (int i = 0; i < n; i++) {
            a=false;
            for(int k = 1; k < n-i ; k++) {
                if (returnStatementThird(arrayList.get(k),b) < returnStatementThird(arrayList.get(k-1),b)) {
                    Car.Engine object1 = arrayList.get(k);
                    arrayList.set(k, arrayList.get(k - 1));
                    arrayList.set(k - 1, object1);
                    a=true;
                }
                if(!a) break;
            }
        }
    }


}
