package Homework15;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input problem number:");
        int input = scanner.nextInt();
        if (input == 1) {
            FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Andrew\\Desktop\\Java homeworks\\Random.txt");
            int byteContent;
            while ((byteContent = fileInputStream.read()) != -1) {
                System.out.print((char) byteContent);
            }
        }

        if (input == 2) {

            FileReader fileReader = new FileReader("C:\\Users\\Andrew\\Desktop\\Java homeworks\\Random.txt");
            FileWriter fileWriter = new FileWriter("C:\\Users\\Andrew\\Desktop\\Java homeworks\\Random#2.txt");
            BufferedReader bufferedReader=new BufferedReader(fileReader);
            int [] arr=new int[10];
            int i=0;
            int sum=0;
            String s;
            while ((s= bufferedReader.readLine()) != null) {
                arr[i]=Integer.parseInt(s);
                sum+=arr[i];
                System.out.println(arr[i]);
                fileWriter.write(String.valueOf(arr[i])+" ");
                i++;
            }
            fileReader.close();
            fileWriter.write(String.valueOf(sum)+" ");
            fileWriter.close();

        }
        if (input == 3) {

            FileReader fileReader = new FileReader("C:\\Users\\Andrew\\Desktop\\Java homeworks\\Random.txt");
            FileWriter fileWriter = new FileWriter("C:\\Users\\Andrew\\Desktop\\Java homeworks\\Random#2.txt");
            BufferedReader bufferedReader=new BufferedReader(fileReader);
            char [] arr=new char[10];
            int i=0;
            int sum=0;
            String s;
            while ((s= bufferedReader.readLine()) != null) {
                arr[i]=s.charAt(0);
                System.out.println(arr[i]);
                fileWriter.write(String.valueOf(arr[i])+" ");
                i++;
            }
            fileReader.close();
            fileWriter.close();

        }
        if (input == 4) {
            FileWriter fileWriter = new FileWriter("C:\\Users\\Andrew\\Desktop\\Java homeworks\\Random#2.txt");
            int n=scanner.nextInt();
            int [] arr=new int[n];
            fileWriter.write(String.valueOf(n)+'\n');
            for(int i=0;i<n;i++){
                arr[i]=scanner.nextInt();
                fileWriter.write(String.valueOf(arr[i])+'\n');
            }
            fileWriter.close();

        }
        if (input == 5) {

            FileReader fileReader = new FileReader("C:\\Users\\Andrew\\Desktop\\Java homeworks\\Random.txt");
            BufferedReader bufferedReader=new BufferedReader(fileReader);
            int [] arr=new int[100000];
            int i=0;
            int size=0,negative=0,positive=0,zero=0;
            String s;
            while ((s= bufferedReader.readLine()) != null) {
                arr[i]=Integer.parseInt(s);
                size++;
                i++;
            }
            int [] arr1= new int [size];
            for(int k=0;k<size;k++){
                arr1[k]=arr[k];
                if(arr1[k]>0) positive++;
                if (arr1[k]<0) negative++;
                if(arr1[k]==0) zero++;

            }
            System.out.println("Number of positive integers in the file : "+positive);
            System.out.println("Number of negative integers in the file : "+negative);
            System.out.println("Number of integers equal to zero in the file : "+zero);

            fileReader.close();

        }
        if (input == 6) {
            FileReader fileReader = new FileReader("C:\\Users\\Andrew\\Desktop\\Java homeworks\\Random.txt");
            BufferedReader bufferedReader=new BufferedReader(fileReader);
            String s;
            while ((s= bufferedReader.readLine()) != null) {
                System.out.println(s);
            }

        }


    }


}

