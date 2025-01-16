package Project02;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner scanner = new Scanner(System.in);
        Data object=new Data();
        object.phoneBookFirstVersion();
        while(true) {
        System.out.println();
        System.out.println("Welcome to a phoneBook program"+"\n");
        System.out.println("--------------------------------------"+"\n");
        System.out.println("Which action do you want to partake in?");
        System.out.println("1. Add a Contact");
        System.out.println("2. Remove a Contact");
        System.out.println("3. Edit a Contact");
        System.out.println("4. Show existing Contacts");
        System.out.println("Enter the associated number linked to an action: ");
            int input=scanner.nextInt();
            if (input == 1) {
                Options object1= new Options();
                object1.optionOne(object);
            }
            if (input == 2) {
                Options object1= new Options();
                object1.optionTwo(object);

            }
            if (input == 3) {
                Options object1= new Options();
                object1.optionThree(object);
            }
            if(input==4){
                Options object1= new Options();
                object1.optionFour(object);
            }

            System.out.println("Continue to another action? (Reply YES or NO)");
            String input2=scanner.next();
            if(input2.equals("NO")){
                System.out.println("Program Terminated");
                break;
            }

        }

    }


}

class Options{
    void optionOne(Data object) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<PhoneContact> newArray=new ArrayList<>();
        object.deserialization(newArray);
        if(newArray.size()>=30){
            System.out.println("Contact amount limit reached-terminating");
            System.exit(0);
        }
        System.out.println("Enter Contact Name:");
        String name = scanner.next();
        System.out.println("Enter Contact Surname:");
        String surname = scanner.next();
        System.out.println("Enter Contact phoneNumber:");
        int phoneNumber = scanner.nextInt();
        System.out.println("Enter Contact Email:");
        String email = scanner.next();
        PhoneContact newContact = new PhoneContact(name, surname, phoneNumber, email);
        newArray.add(newContact);
        object.serialization(newArray);
        newArray.clear();
        System.out.println("Contact Added Successfully!");

    }
    void optionTwo(Data object) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<PhoneContact> newArray=new ArrayList<>();
        object.deserialization(newArray);
        if(newArray.size()>=30){
            System.out.println("Contact amount limit reached-terminating");
            System.exit(0);
        }
        System.out.println("Enter Contact phoneNumber:");
        int phoneNumber = scanner.nextInt();
        System.out.println("Enter Contact Email:");
        String email= scanner.next();
        for (int i=0;i<newArray.size();i++) {
            if (newArray.get(i).getPhoneNumber() == phoneNumber && newArray.get(i).getEmail().equals(email)) {
                newArray.remove(i);
                break;
            }
        }
        object.serialization(newArray);
        newArray.clear();
        System.out.println("Contact Removed Successfully!");
    }
    void optionThree(Data object) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<PhoneContact> newArray=new ArrayList<>();
        object.deserialization(newArray);
        if(newArray.size()>=30){
            System.out.println("Contact amount limit reached-terminating");
            System.exit(0);
        }
        System.out.println("Enter Contact phoneNumber:");
        int phoneNumber = scanner.nextInt();
        System.out.println("Enter Contact Email:");
        String email= scanner.next();
        for (int i=0;i<newArray.size();i++) {
            if (newArray.get(i).getPhoneNumber() == phoneNumber && newArray.get(i).getEmail().equals(email)) {
                System.out.println("Editing a Contact:");
                System.out.println("Which information would you like to edit? (Separate words with lines)");
                String input1=scanner.next();
                if(input1.contains("name")){
                    System.out.println("Enter new name:");
                    String name1=scanner.next();
                    newArray.get(i).setName(name1);
                }
                if(input1.contains("surname")){
                    System.out.println("Enter new surname:");
                    String surname1=scanner.next();
                    newArray.get(i).setSurname(surname1);
                }
                if(input1.contains("phoneNumber")){
                    System.out.println("Enter new phoneNumber:");
                    int phoneNumber1=scanner.nextInt();
                    newArray.get(i).setPhoneNumber(phoneNumber1);
                }
                if(input1.contains("email")){
                    System.out.println("Enter new email:");
                    String email1=scanner.next();
                    newArray.get(i).setEmail(email1);
                }
                object.serialization(newArray);
                newArray.clear();
                System.out.println("Contact Edited Successfully!");
                break;
            }
        }
    }
    void optionFour(Data object) {
        ArrayList<PhoneContact> newArray=new ArrayList<>();
        object.deserialization(newArray);
        for (PhoneContact phoneContact : newArray) {
            System.out.println("Name: " + phoneContact.getName());
            System.out.println("Surname: " + phoneContact.getSurname());
            System.out.println("Phone Number: " + phoneContact.getPhoneNumber());
            System.out.println("Email: " + phoneContact.getEmail()+"\n");

        }
        newArray.clear();
    }
}

