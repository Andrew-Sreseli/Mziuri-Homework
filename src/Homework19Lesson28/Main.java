package Homework19Lesson28;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void sort1Increasing(ArrayList<BasketballPlayer>arrayList){
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


    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which problem do you want to open?");
        int input=scanner.nextInt();
        //
        if(input==1) {
            int n = scanner.nextInt();
            ArrayList<BasketballPlayer> arrayList = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                String name = scanner.next();
                String surname = scanner.next();
                int[] arr = new int[5];
                for (int k = 0; k < 5; k++) {
                    arr[k] = scanner.nextInt();
                }
                BasketballPlayer object = new BasketballPlayer(name, surname, arr);
                arrayList.add(object);
            }
            SortSystem.sort1Increasing(arrayList);
            System.out.println("Sorting in increasing score order: ");
            for(int i=0;i<n;i++){
                System.out.println(arrayList.get(i).toString());
                System.out.println("Score sum: "+arrayList.get(i).getAllBallSituationSum());
            }
            SortSystem.sort1Decreasing(arrayList);
            System.out.println("Sorting in decreasing score order: ");
            for(int i=0;i<n;i++){
                System.out.println(arrayList.get(i).toString());
                System.out.println("Score sum: "+arrayList.get(i).getAllBallSituationSum());
            }

           //arrayList.sort(Comparator.comparing(BasketballPlayer::getAllBallSituationSum));

        }
        //
        if(input==2) {
            int n = scanner.nextInt();
            ArrayList<Student> arrayList= new ArrayList<>();
            for(int i=0;i<n;i++){
                String name = scanner.next();
                String surname = scanner.next();
                double date = scanner.nextDouble();
                ArrayList<Integer> grades=new ArrayList<>();
                int n1 = scanner.nextInt();
                for(int k=0;k<n1;k++){
                    int grade=scanner.nextInt();
                    grades.add(grade);
                }
                Student object = new Student(name, surname, date, grades);
                arrayList.add(object);
            }
            for(int i=0;i<n;i++){
                System.out.println(arrayList.get(i).toString());
            }
            SortSystem.sort2(arrayList,"averageGrade");
            System.out.println("Sorting by average grade:");
            for(int i=0;i<n;i++){
                System.out.println(arrayList.get(i).toString());
            }
            SortSystem.sort2(arrayList,"date");
            System.out.println("Sorting by birth-date:");
            for(int i=0;i<n;i++){
                System.out.println(arrayList.get(i).toString());
            }
            SortSystem.sort2alphabetically(arrayList);
            System.out.println("Sorting lexicographically:");
            for(int i=0;i<n;i++){
                System.out.println(arrayList.get(i).toString());
            }

        }
        //
        if(input==3){
            int n = scanner.nextInt();
            ArrayList<Car.Engine> arrayList= new ArrayList<>();
            for(int i=0;i<n;i++) {
                String company = scanner.next();
                String model = scanner.next();
                int releaseDate = scanner.nextInt();
                int horsePower = scanner.nextInt();
                String gasType = scanner.next();
                int cylinderSum = scanner.nextInt();
                int volume = scanner.nextInt();
                Car object = new Car(company, model, releaseDate, horsePower);
                Car.Engine object1 = object.new Engine(gasType, cylinderSum, volume);
                arrayList.add(object1);
            }

            for(int i=0;i<n;i++){
                System.out.println(arrayList.get(i).PrintAll());
                System.out.println(arrayList.get(i).toString());
            }
            SortSystem.sort3(arrayList,"date");
            System.out.println("Sorting by release date:");
            for(int i=0;i<n;i++){
                System.out.println(arrayList.get(i).toString());
            }
            SortSystem.sort3(arrayList,"mileage");
            System.out.println("Sorting by mileage:");
            for(int i=0;i<n;i++){
                System.out.println(arrayList.get(i).toString());
            }
            SortSystem.sort3(arrayList,"Engine volume");
            System.out.println("Sorting by engine volume:");
            for(int i=0;i<n;i++){
                System.out.println(arrayList.get(i).toString());
            }

        }
        if(input==4){

            String companyName=scanner.nextLine();
            String country=scanner.nextLine();
            String city=scanner.nextLine();
            String street=scanner.nextLine();
            String building=scanner.nextLine();
            Address object = new Address(country, city, street, building);
            Corporation object1= new Corporation(companyName, object);

            int contacts=scanner.nextInt();
            for (int i=0;i<contacts;i++) {
                String type=scanner.nextLine();
                String number=scanner.nextLine();
                object1.addContactInfo(type, number);
            }

            int employees=scanner.nextInt();
            for (int i=0;i<employees;i++) {
                String name=scanner.nextLine();
                String surname=scanner.nextLine();
                String id=scanner.nextLine();
                int salary=scanner.nextInt();

                Employee employee = new Employee(name,surname, id, salary);
                object1.addEmployee(employee);
            }

            object1.aboutUs();

            System.out.print("Enter contact type to retrieve number: ");
            String contactType = scanner.nextLine();
            System.out.println("Contact (" + contactType + "): " + object1.getContactNumber(contactType));

            System.out.println("Total Salary: " + object1.totalSalary());


        }




    }
}




