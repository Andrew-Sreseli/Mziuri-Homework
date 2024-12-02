package Homework12;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Problem number to print:");
        int input=scanner.nextInt();
        if(input==1) {
            String name = scanner.next();
            City object = new City("Tbilisi", 1259000, 764);
            City[] Cities = new City[5];
            for (int i = 0; i < 5; i++) {
                String name1 = scanner.next();
                int populace = scanner.nextInt();
                int area = scanner.nextInt();
                Cities[i] = new City(name1, populace, area);
            }
            Country object1 = new Country(object.getName(), object.getPopulace(), object.getArea(), name, object, Cities);
            object1.countArea();
            object1.countPopulace();
        }
        if(input==2){
            int n=scanner.nextInt();
            int ageMax=0;
            int timeMax=0;
            Doctor[] arr=new Doctor[n];
            for(int i=0;i<n;i++){
                String name=scanner.next(),surname=scanner.next();
                int age=scanner.nextInt();
                String field=scanner.next(),rank=scanner.next(),hospital=scanner.next();
                int time=scanner.nextInt();
                if(ageMax<age) ageMax=age;
                if(timeMax<time) timeMax=time;
                Doctor object=new Doctor(name,surname,age,field,rank,hospital,time);
                arr[i]=object;
            }
            for(int i=0;i<n;i++){
                if(ageMax==arr[i].getAge() && timeMax==arr[i].getTime()){
                    System.out.println(arr[i].toString());
                }
            }

        }
        if(input==3){
            System.out.println("Start Registering:");
            System.out.print("Name:");
            String name=scanner.next();
            System.out.print("Surname:");
            String surname=scanner.next();
            System.out.print("Social Security Number:");
            String SSN=scanner.next();
            System.out.print("Age:");
            int age=scanner.nextInt();
            Customer object1=new Customer(name,surname,SSN,age);
            System.out.println("Which Insurance would you like to acquire- ");
            String input1=scanner.next();
            if(input1.equals("Auto Insurance")){
                int carAge=scanner.nextInt();
                int carPrice=scanner.nextInt();
                AutoInsurance object=new AutoInsurance(carAge,carPrice);
                object.bill();
                object.packageInfo();
            }
            if(input1.equals("Healthcare Insurance")){
                int salary=scanner.nextInt();
                int age1=scanner.nextInt();
                boolean foreignInsurance=scanner.nextBoolean();
                Healthcare object=new Healthcare(salary,age1,foreignInsurance);
                object.bill();
                object.packageInfo();
            }
            if(input1.equals("Travel Insurance")){
                int days=scanner.nextInt();;
                int personSum=scanner.nextInt();;
                boolean baggageInsurance=scanner.nextBoolean();;
                TravelInsurance object=new TravelInsurance(days,personSum,baggageInsurance);
                object.bill();
                object.packageInfo();

            }
        }
        if(input==4){
            int n=scanner.nextInt();
            State []arr=new State[n];
            State.River []arr1=new State.River[n];
            State.River []arrCopy=new State.River[n];
            for(int i=0;i<n;i++) {
                String name = scanner.next();
                String capitalCity = scanner.next();
                int populace = scanner.nextInt();
                int area = scanner.nextInt();
                String name1 = scanner.next();
                int length = scanner.nextInt();
                arr[i] = new State(name, capitalCity, populace, area);
                arr1[i] = new State.River(name1, length);
                arrCopy[i] = new State.River(name1, length);
            }
            Arrays.sort(arr1, new Comparator<State.River>() {
                @Override
                public int compare(State.River p1,State.River p2) {
                    return Integer.compare(p1.getLength(), p2.getLength());
                }
            });
            for(int i=0;i<n;i++){
                for(int k=0;k<n;k++){
                    if(arr1[i].getLength()==arrCopy[k].getLength()){
                        System.out.print(arr[k].toString());
                        System.out.print(arrCopy[k].toString());
                    }
                }
            }


        }







    }

}




