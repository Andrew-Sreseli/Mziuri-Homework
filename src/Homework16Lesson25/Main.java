package Homework16Lesson25;

import java.io.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input problem number:");
        int input = scanner.nextInt();
        if (input == 1) {
            Student [] sampleData =new Student[5];
            for(int i=0;i<5;i++){
                String id=scanner.next(),name=scanner.next();
                int grade=scanner.nextInt();
                sampleData[i]= new Student(id,name,grade);
            }
            FileOutputStream fileOutputStream= new FileOutputStream("C:\\Users\\Andrew\\Desktop\\Java homeworks\\Random.txt");
            ObjectOutputStream objectOutputStream= new ObjectOutputStream(fileOutputStream);
            for(int i=0;i<5;i++){
                objectOutputStream.writeObject(sampleData[i]);
            }
            objectOutputStream.close();
            fileOutputStream.close();
        }
        if( input == 2) {
            FileInputStream fileInputStream=new FileInputStream("C:\\Users\\Andrew\\Desktop\\Java homeworks\\Random.txt");
            ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
            for(int i=0;i<5;i++) {
                Student object = (Student) objectInputStream.readObject();
                System.out.println(object.getId());
                System.out.println(object.getName());
                System.out.println(object.getGrade());

            }



        }

    }


}
