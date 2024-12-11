package Homework14;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Problem number to print:");
        int input = scanner.nextInt();
        if (input == 1) {
            try {
                int n = scanner.nextInt();
                int sum = 0;
                int[] arr = new int[n];
                for (int i = 0; i < n; i++) {
                    arr[i] = scanner.nextInt();
                }
                for (int i = 0; i < n+1; i++) {
                    sum += arr[i];
                }
            } catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Problem occurred. Index incorrectly assigned");
            }

        }
        if (input == 2) {
            try{
                int[] arr={10,20,30,40,50};
                int[] arr1={1,2,3,4,0};
                for(int i=0;i<arr.length;i++){
                    int result=arr[i]/arr1[i];
                    System.out.println(result);
                }
            } catch(ArithmeticException e){
                System.out.println("A division with zero occurred.");
            }

        }
        if (input == 3) {
            //--------(amoyebulia)
        }
        if (input == 4) {
            String name=scanner.next();
            String surname=scanner.next();
            String SSN=scanner.next();
            String username=scanner.next();
            String password=scanner.next();
            int yearOfBirth=scanner.nextInt();
            int monthOfBirth=scanner.nextInt();
            int dayOfBirth=scanner.nextInt();
            Account object=new Account(name,surname,SSN,username,password,yearOfBirth,monthOfBirth,dayOfBirth);
            Account.IncorrectNameException object1=object.new IncorrectNameException();
            object1.checkName(name);
            Account.IncorrectSurnameException object2=object.new IncorrectSurnameException();
            object2.checkSurname(surname);
            Account.IncorrectSSNException object3=object.new IncorrectSSNException();
            object3.checkSSN(SSN);
            Account.IncorrectUsernameException object4=object.new IncorrectUsernameException();
            object4.checkUsername(username);
            Account.IncorrectPasswordException object5=object.new IncorrectPasswordException();
            object5.checkPassword(password);
            Account.IncorrectYearOfBirthException object6=object.new IncorrectYearOfBirthException();
            object6.checkYearOfBirth(yearOfBirth);
            Account.IncorrectMonthOfBirthException object7=object.new IncorrectMonthOfBirthException();
            object7.checkMonthOfBirth(monthOfBirth);
            Account.IncorrectDayOfBirthException object8=object.new IncorrectDayOfBirthException();
            object8.checkDayOfBirth(dayOfBirth);

        }



    }






}