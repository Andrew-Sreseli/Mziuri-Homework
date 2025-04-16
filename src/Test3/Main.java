package Test3;


import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static class MyException extends Exception{
        public MyException(String s){
            super(s);
        }

    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();


        //Tests
        //1. a)
        //2. g)
        //3. a)
        //4. d)
        //5. g)
        //6. a)
        //7. g)
        //8. OOP- შედგება 4 მთავარი ნაწილისგან:
        //ა. მემკვიდრეობა- მემკვიდრეობა არის კლასის თვისება, რომ დაკავშირებული იყოს ეგრედწოდებულ "მშობელ" კლასთან,
        //რასთანაც მას ინფორმაციული წვდომა გააჩნია, ესეიგი ის გამოიყენებს მის ველებსა და მეთოდებს.
        //ბ. პოლიმორფიზმი- პოლიმორფიზმი არის კლასის თვისება, რომ ის სხვადასხვა კლასმა გამოიყენოს, რისი კარგი მაგალითიც
        // ინტერფეისია. ამასთან არის ასევე დაკავშირებული overloading and overriding.
        //გ. ინკაფსულაცია- ინკაფსულაცია არის კლასის თვისება, რომ მისი მეთოდები და ველები სხვადასხვაგვარად დაცულ
        //მდგომარეობაში იყოს, და მათთან წვდომა გართულდეს. ამითი ის დაცულია ადვილი ხელმისაწვდომობისგან.
        //დ. აბსტრაქცია- აბსტრაქციის დროს მომხმარებელი მარტო ხედავს საჭირო ინფორმაციას. აბსტრაქციას მოზდევს აბსტრაქტული
        //კლასებისა და მეთოდების ინიციალიზაცია. აბსტრაქტული მეთოდის იმპლემენტაცია ხდება ერთ კლასში, რის მერეც ის სხვა
        //კლასებში გამოიყენება.
        //9. d)
        //10. d)
        //11. ინტერფეისს აუცილებლად აბსტრაქტული მეთოდები აქვს, რითი ფუნქციაც სხვა კლასში გამოყენებაა,
        // აბსტრაქტულ კლასს კი შეუძლია ჰქონდეს აბსტრაქტულიც და არა-აბსტრაქტულიც მეთოდები.
        //12. b)
        //13. error შეიძლება მოხდეს კომპილირებისას ან პროგრამის გაშვებისას, და მათ გამო პროგრამა ითიშება,
        // exception ხდება მარტო პროგრამის მიმდინარეობისას და არარის აუცილებელი რომ ამდროს პროგრამა გაითიშოს.
        //14.
        try{
            throw new MyException("Custom Exception");
        }
        catch (MyException e) {
            System.out.println("Caught Custom Exception");
        }
        //15. g)
        //16. Comparable ინტერფეისის შვილი და მის მიერ გადაფარვადი compareTo მეთოდი აუცილებელია იმისთვის, რომ
        // TreeSet-ში მონაცემები შეინახოს დალაგებულად მოცემულმა კლასის ობიექტმა. TreeSet ზუსტად ისეთი სიმრავლეა
        // რომლის გამოყენებისას მონაცემები დალაგებულად შეინახება.
        //17. Map სტრუქტურა გვაძლევს საშუალებას რომ მონაცემების ინდექსი არა მხოლოდ რიცხვი იყოს, როგორც არის მასივებში,
        // არამედ იყოს ნებისმიერი ობიექტი. ამის გამო, მისი მონაცემები შეგვიძლია სხვადასხვაგვარად შევინახოთ და გამოვიყენოთ key-ები
        // რათა რომელიმე მონაცემს მივწვდეთ. მასივში შეიძლება მარტო ინდექსით მიწვდობა რაიმე წევრზე.
        //18. a)
        //19. g)
        //20. d)

        //Problems
        //21
        if (input == 1) {

            List<String> arrayList=new ArrayList<>();
            int n=scanner.nextInt();
            for(int i=0;i<n;i++){
                String s=scanner.next();
                arrayList.add(s);
            }

            List<String> changedArrayList= arrayList.stream()
                    .map(String::toUpperCase)
                    .filter(string -> string.length()>5)
                    .sorted()
                    .toList();

            for (String s : changedArrayList) {
                System.out.println(s);
            }

        }

        //22
        if (input == 2) {

            //Synchronized გამოიყენება იმისთვის რომ რაიმე პროგრამის ნაწილისთვის რამდენიმე ნაკადს შევუზღუდოთ
            //ერთბაშად მოქმედება ამ პროგრამის ნაწილზე. რადგან პირველი ნაკადი ეგრედზოდებულ "ლოქს" უკეთებს
            // პირველ ობიექტს, მეორე ნაკადი მას 0.1 წამის შემდეგ-აც ვერ მისწვდება
            // იგივენაირად, მეორე ობიექტს მეორე ნაკადი "ლოქს" უკეთებს
            // ამის გამო, პროგრამის გაშვებისას არაფერი დაიწერება
            // იმითსვის რომ ორივე ნაკადმა შეასრულოს თავისი დავალება ადეკვატურად, სინქრონიზირება უნდა დავაშოროთ
            // ერთმანეთს და ისე ვამუშავოთ რომ ერთმანეთს ხელი არ შეუძალონ

            class Example {
                private static final Object lock1 = new Object();
                private static final Object lock2 = new Object();
                public static void main1(String[] args) {
                    Thread thread1 = new Thread(() -> {
                        synchronized (lock1) {   // დალოქავს
                            System.out.println("Thread 1: Locked lock1");
                            try {
                                Thread.sleep(100);
                            } catch (InterruptedException e) {
                            }
                            synchronized (lock2) {
                                System.out.println("Thread 1: Locked lock2");
                            }
                        }
                    });
                    Thread thread2 = new Thread(() -> {
                        synchronized (lock2) {  //დალოქავს
                            System.out.println("Thread 2: Locked lock2");
                            try {
                                Thread.sleep(100);
                            } catch (InterruptedException e) {
                            }
                            synchronized (lock1) {
                                System.out.println("Thread 2: Locked lock1");
                            }
                        }
                    });
                    thread1.start();
                    thread2.start();
                }
            }

        }
        //23
        if (input == 3) {
            //Node class
        }
        //24
        if (input == 4) {

            int n=scanner.nextInt();
            FileOutputStream fileOutputStream=new FileOutputStream("Random.txt");
            ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
            for(int i=0;i<n;i++){
                String name=scanner.next();
                String surname=scanner.next();
                int age=scanner.nextInt();
                String condition=scanner.next();
                Patient object=new Patient(name,surname,age,condition);
                objectOutputStream.writeObject(object);
            }
            objectOutputStream.close();
            fileOutputStream.close();
            FileInputStream fileInputStream=new FileInputStream("C:\\Random.txt");
            ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
            for(int i=0;i<n;i++){

                Patient object=(Patient)objectInputStream.readObject();
                System.out.println(object.getName());
                System.out.println(object.getSurname());
                System.out.println(object.getAge());
                System.out.println(object.getCondition());

            }


        }
    }

}
