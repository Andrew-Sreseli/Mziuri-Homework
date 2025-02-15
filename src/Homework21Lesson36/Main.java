package Homework21Lesson36;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    static String randomGenerator(int n){
        StringBuilder s = new StringBuilder(n);
        String s1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvxyz0123456789";
        for(int i=0;i<n;i++){
            int index=(int)(s1.length() * Math.random());
            s.append(s1.charAt(index));
        }
        return String.valueOf(s);
    }
    static boolean Prime(int inputNumber)
    {
        boolean a = true;
        if(inputNumber <= 1) return false;
        else {
            for (int i=2; i<=inputNumber/2; i++) {
                if ((inputNumber%i)==0)
                {
                    a=false;
                    break;
                }
            }
        }
            return a;

    }
    static String intToString(int n){
        return String.valueOf(n);
    }
    static boolean isEven(int n){
        return n % 2 == 0;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        if(input == 1){
            System.out.println("Set Password length: ");
            int n=scanner.nextInt();
            Supplier<String> randomSupplier =  () -> randomGenerator(n);
            System.out.println(randomSupplier.get());
        }
        if(input == 2){
            Consumer<String> logMessage = message -> {
                if(message.contains("System crash")){
                    System.out.println("ERROR");
                }else if(message.contains("Low disk space")){
                    System.out.println("WARNING");
                }else if(message.contains("Database connected")){
                    System.out.println("INFO");
                }
            };
            logMessage.accept("Database connected!");
            logMessage.accept("Low disk space");
            logMessage.accept("System crash");
        }

        if(input == 3){
            String str=scanner.next();
            Function<String,String> reverseString= s -> new StringBuilder(s).reverse().toString();
            String output= reverseString.apply(str);
            System.out.println(output);

        }
        if(input == 4){
            int n=scanner.nextInt();
            Predicate<Integer> primeNumber= Main::Prime;
            System.out.println(primeNumber.test(n));

        }
        if(input == 5){

            System.out.println("Your number is: ");
            System.out.println(intToString(12));
            System.out.println(isEven(13));
            System.out.println(isEven(12));

        }



        
    }
}
