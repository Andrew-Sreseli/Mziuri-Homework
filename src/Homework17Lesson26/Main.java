package Homework17Lesson26;

import Homework16Lesson25.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input problem number:");
        int input = scanner.nextInt();
        if (input == 1) {
            //saklaso #1
            boolean a=true;
            int input1=scanner.nextInt();
            String s=String.valueOf(input1);
            if(s.charAt(0)=='-') System.out.println("Number isn't a palindrome");
            else{
                for(int i=0;i<s.length()/2;i++){
                    if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                        a = false;
                        break;
                    }
                }
            }
            if(a) System.out.println("Number is a palindrome");
            else System.out.println("Number isn't a palindrome");


        }
        if (input == 2) {
            //saklaso #2
            int n = scanner.nextInt();
            int[] arr = new int[n];
            int k=0;
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            int i=0;
            while(i<n){
                System.out.println(arr[i]);
                if(i<n-1) {
                    while (k >= 0) {
                        if (arr[i] == arr[i + 1]) {
                            i++;
                        } else break;


                        k++;
                    }
                }

                i++;
            }


        }
        if(input == 3){
            //serialization
            FileInputStream fileInputStream=new FileInputStream("C:\\Users\\Andrew\\Desktop\\Java homeworks\\Library.txt");
            ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
            int n=0;
            ArrayList<Book> arrayList=new ArrayList<>();
            Book object;
            while( (object = (Book) objectInputStream.readObject()) !=null ){
                n++;
            }
            System.out.println(n);
            objectInputStream.close();
            fileInputStream.close();
            FileInputStream fileInputStream1=new FileInputStream("C:\\Users\\Andrew\\Desktop\\Java homeworks\\Library.txt");
            ObjectInputStream objectInputStream1=new ObjectInputStream(fileInputStream);
            for(int i=0;i<n;i++){
                Book object0 = (Book) objectInputStream.readObject();
                arrayList.add(object0);
            }

            System.out.println("Library Management System"+"\n");
            System.out.println("----------------------------------------");
            System.out.println("Process open options: ");
            System.out.println("1.Extract Book");
            System.out.println("2.Add book");
            System.out.print("Write Input for choosing an option -> :  ");
            int input1=scanner.nextInt();
            if(input1==1){
                System.out.println("Write book Name: ");
                String name=scanner.next();
                System.out.println("Write book Author: ");
                String author=scanner.next();
                System.out.println("Write book identification code: ");
                String idenCode=scanner.next();
                Book object1= new Book(name,author,idenCode,false);
                if(arrayList.contains(object1)){
                    arrayList.remove(object1);
                    Book object2= new Book(name,author,idenCode,true);
                    arrayList.add(object2);
                }
                else System.out.println("Incorrect Information given");
            }
            if(input1==2){
                System.out.println("Write book Name: ");
                String name=scanner.next();
                System.out.println("Write book Author: ");
                String author=scanner.next();
                System.out.println("Write book identification code: ");
                String idenCode=scanner.next();
                Book object1= new Book(name,author,idenCode,true);
                arrayList.add(object1);
            }

            FileOutputStream fileOutputStream= new FileOutputStream("C:\\Users\\Andrew\\Desktop\\Java homeworks\\Library Management System.txt");
            ObjectOutputStream objectOutputStream= new ObjectOutputStream(fileOutputStream);
            for(int i=0;i<arrayList.size();i++){
                objectOutputStream.writeObject(arrayList.get(i));
            }
            objectOutputStream.close();
            fileOutputStream.close();

        }










    }
}
