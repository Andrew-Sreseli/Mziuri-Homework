package Homework22Lesson38;


import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        if (input == 1) {
            List<Integer> numlist= new ArrayList<>();
            int n=scanner.nextInt();
            for(int i=0;i<n;i++){
                int k=scanner.nextInt();
                numlist.add(k);
            }
            int squaredSum= numlist.stream()
                    .reduce(0, (element1,element2) -> element1+element2*element2);
            System.out.println("Sum of all squared elements is: "+ squaredSum);

        }
        if (input == 2) {
            List<String> stringList= new ArrayList<>();
            int n=scanner.nextInt();
            for(int i=0;i<n;i++){
                String k=scanner.next();
                stringList.add(k);
            }
            List<String> changedList= stringList.stream()
                    .filter(string -> string.startsWith("B"))
                    .toList();

            for (String s : changedList) {
                System.out.println(s);
            }

        }

    }

}
