package Homework23Lesson39;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        if (input == 1) {
            int n=scanner.nextInt();
            List<Worker> arrayList= new ArrayList<>();
            for(int i=0;i<n;i++){
                String name=scanner.next();
                String department=scanner.next();
                int wage=scanner.nextInt();
                arrayList.add(new Worker(name,department,wage));
            }
            List<String> changedList= arrayList.stream()
                    .filter( Worker -> Worker.getWage()>500)
                    .sorted(Comparator.comparingInt(Worker::getWage).reversed())
                    .map(Worker::getName)
                    .limit(5)
                    .toList();

            changedList.forEach(System.out::println);

        }

        if (input == 2) {
            int n=scanner.nextInt();
            List<Integer> arrayList=new ArrayList<>();
            for(int i=0;i<n;i++){
                int number=scanner.nextInt();
                arrayList.add(number);
            }
            List<Integer> changedList= arrayList.stream()
                    .filter(Integer -> Integer%2==0)
                    .map(element1->3*element1)
                    .skip(2)
                    .sorted(Comparator.naturalOrder())
                    .toList();

                    System.out.println("Maximum element: "+ changedList.getLast());

        }
        if (input == 3) {
            int n=scanner.nextInt();
            List<Product> arrayList= new ArrayList<>();
            for(int i=0;i<n;i++){
                String name=scanner.next();
                int price=scanner.nextInt();
                arrayList.add(new Product(name,price));
            }
            Integer priceSum= arrayList.stream()
                    .map(Product::getPrice)
                    .filter(price -> price >20)
                    .reduce(0, Integer::sum);

            System.out.println("Price sum: "+ priceSum);

        }




    }


}
