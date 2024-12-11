package Homework13;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Problem number to print:");
        int input = scanner.nextInt();
        if (input == 1) {
            String inputS=scanner.next();
            int output=0;
            for(int i=0;i<inputS.length();i++){
                if(inputS.charAt(i) >'0' && inputS.charAt(i)< '9'){
                    output++;
                }

            }
            System.out.println(output);

        }
        if (input == 2){
            int output=0;
            String inputS=scanner.next();
            for(int i=0;i<inputS.length();i++){
                if((inputS.charAt(i) =='?' || inputS.charAt(i) =='!' || inputS.charAt(i) =='.' || inputS.charAt(i) ==';') &&
                        (inputS.charAt(i-1) !='?' && inputS.charAt(i-1) !='!'&& inputS.charAt(i-1) !='.' && inputS.charAt(i-1) !=';'))
                    output++;
            }

            System.out.println(output);

        }
        if (input == 3){
            String inputS=scanner.next();
            boolean a=true;

            for(int i=0;i<inputS.length()/2;i++){
                if (inputS.charAt(i) != inputS.charAt(inputS.length() - i - 1)) {
                    a = false;
                    break;
                }
            }
            if(a) System.out.println("String is a palindrome");
            else System.out.println("String is not a palindrome");


        }
        if (input == 4){
            String inputS1=scanner.next();
            String inputS2=scanner.next();
            boolean a=inputS1.contains(inputS2);
            System.out.println("Substring detection:"+a);

        }
        if (input == 5){
            String inputS=scanner.next();
            String vowels="aeiou";
            char a=inputS.charAt(inputS.length()-1);
            String s="";
            s+=a;
            if(vowels.contains(s)) System.out.println("Ends with a vowel");
            else System.out.println("Ends with a consonant");

        }
        if (input == 6){
            String inputS=scanner.next();
            StringBuilder s= new StringBuilder(inputS);
            for(int i=0;i<inputS.length()-1;i++){
                if(s.charAt(i) == s.charAt(i+1)){
                    s.deleteCharAt(i);
                    i--;
                }

            }
            System.out.println(s);
        }
        if (input == 7){
            String inputS=scanner.next();
            if(inputS.length()<10) System.out.println(inputS);
            else {
                String s="";
                s+=inputS.charAt(0);
                int a=inputS.length()-2;
                s+=String.valueOf(a);
                s+=inputS.charAt(inputS.length()-1);

                System.out.println(s);

            }

        }


    }

}
