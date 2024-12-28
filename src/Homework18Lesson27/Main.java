package Homework18Lesson27;

import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner scanner = new Scanner(System.in);
        Random random=new Random();
        System.out.println("Input problem number:");
        int input = scanner.nextInt();
        if (input == 1) {
            ArrayList<Integer> arrayList=new ArrayList<>();
            while(true){
                int number= random.nextInt(0,50);
                arrayList.add(number);
                if(number==40) break;
            }
            int n=arrayList.size();
            System.out.println("ArrayList size: "+n);
            System.out.println("ArrayList elements: ");
            for(int k=0;k<n;k++){
                System.out.println(arrayList.get(k));
            }
            System.out.println("Even ArrayList elements: ");
            for(int k=0;k<n;k++) {
                if (arrayList.get(k) % 2 == 0) System.out.println(arrayList.get(k));
            }

        }
        if (input == 2) {
            int []arr=new int [5];
            for(int i=0;i<5;i++){
                arr[i]=random.nextInt(0,50);
            }
            int max=0;
            int index=0;
            for(int i=0;i<5;i++){
                if(arr[i]>max) max=arr[i];
            }
            for(int i=0;i<5;i++){
                if(arr[i]==max) index=i;
            }
            System.out.println("Maximum element: "+max);
            System.out.println("Maximum element index: "+index);
            ArrayList<Integer> arrayList=new ArrayList<>();
            for (int i : arr){
                arrayList.add(arr[i]);
            }
            for (int i=0;i<5;i++){
                if(arrayList.get(i)==max) index=i;
            }
            System.out.println("Maximum element index: "+index);

        }
        if (input == 3) {
            ArrayList<Student> arrayList=new ArrayList <>();
            for(int i=0;i<5;i++){
                String name=scanner.next();
                String surname=scanner.next();
                String SSN=scanner.next();
                int averageScore=scanner.nextInt();
                Student object= new Student(name,surname,SSN,averageScore);
                arrayList.add(object);
            }
            arrayList.sort(Comparator.comparing(Student :: getAverageScore));
            for (Student student : arrayList) {
                System.out.println(student);
            }
        }
        if (input == 4) {
            int n1=scanner.nextInt(),n2=scanner.nextInt(),n3=scanner.nextInt();
            if( n1>100000 || n2>100000 || n3>100000) {
                System.out.println("Size input too long");
                System.exit(0);
            }
            int [] arr1=new int[n1];
            ArrayList<Integer> arrayList1=new ArrayList<>();
            int [] arr2=new int[n2];
            ArrayList<Integer> arrayList2=new ArrayList<>();
            int [] arr3=new int[n3];
            ArrayList<Integer> arrayList3=new ArrayList<>();
            for(int i : arr1){
                arr1[i]=scanner.nextInt();
                arrayList1.add(arr1[i]);
            }
            for(int i : arr2){
                arr2[i]=scanner.nextInt();
                arrayList2.add(arr2[i]);
            }
            for(int i : arr3){
                arr3[i]=scanner.nextInt();
                arrayList3.add(arr3[i]);
            }

            System.out.println("Printing all repeated numbers (In all three arrays)");
            for(int i=0;i<arr1.length;i++){
                int a=arr1[i];
                if(arrayList1.contains(a) && arrayList2.contains(a) && arrayList3.contains(a)){
                    System.out.println(arr1[i]);
                }
            }
        }
        if (input == 5) {
            int n=scanner.nextInt();
            String [] arr=new String[n];
            if( n>1000000) {
                System.out.println("Size input too long");
                System.exit(0);
            }
            int sum=0;
            for(int i=0;i<n;i++){
                for(int k=i;k<n;i++){
                    if(arr[i]==arr[k]) sum++;
                }
                System.out.println(arr[i]+" name is called "+sum+" times");
            }

        }
        if (input == 6) {
            //Main not needed
        }

    }
}
