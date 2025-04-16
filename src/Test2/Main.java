package Test2;

import java.util.Scanner;

public class Main {
    //Finding a power of a number.
    static int number7(int a,int n){
        if(n==0) return 1;
        return a*number7(a,n-1);

    }
    static void selectionSort(int [] arr){
        int [] arr1=new int [arr.length];
        for(int k=0;k<arr.length-1;k++) {
            int minIndex=k;
            for (int i = 0; i < arr.length; i++) {
                if (arr[minIndex] > arr[i]) minIndex=i;
            }
            int a=arr[k];
            arr[k]=arr[minIndex];
            arr[minIndex]= a;

        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //ტესტურები
        //1. ა
        //2. ა
        //3. ა
        //4. Method signature- გულისხმობს მეთოდის სახელსა და პარამეტრების სიას.
        //5. გ
        //6. Recursion- რეკურსია არის ის სიტუაცია, როდესაც მეთოდი თავის თავს იძახებს.
        //7.

        //Recursion based on finding a power of a number given the two integers.
        /*
        int a=scanner.nextInt();
        int n=scanner.nextInt();
        System.out.println("Power of "+a+" by "+n+"is "+number7(a,n));
         */
        //8.
        //ა.მემკვიდრეობა
        //მემკვიდრეობა ეს არის კლასის ის თვისება, რომ იყოს დაკავშირებული ეგრედწოდებულ "მშობელ" კლასთან, რასთანაც მას
        //ინფორმაციული წვდობა ექნება. (მისი ველების და მეთოდების გამოყენება).

        //ბ.პოლიმორფიზმი
        //პოლიმორფიზმი არის კლასის თვისება, რომელიც გვაძლევს საშუალებას რომ რამდენიმე სხვადასხვა კლასმა გამოიყენოს
        //ერთიდაიგივე ინტერფეისი.

        //გ.ინკაფსულაცია
        //ინკაფსულაცია არის როცა კლასის მეთოდები და ველები არის დაცულ მდგომარეობაში და მათზე წვდომა რთულდება,
        //რაც რათქმაუნდა პროგრამას იცავს გარე ჩარევისგან და უცნობი პირისგან კლასის გამოყენებას.

        //დ.აბსტრაქცია
        //აბსტრაქცია არის როცა მომხმარებელს ვაჩვენებთ მარტო საჭირო ინფორმაციას.
        //აბსტრაქტულ მეთოდს მაგალითად, არააქვს იმპლემენტაცია, რაც აბსტრაქტულ კლასში იწერება.
        //მისი იმპლემენტაცია ხდება სხვა კლასში.

        //9. გ
        //10. ბ
        //11. method  overload-ეს არის როცა ორ მეთოდს ააქვს ერთნაირი სახელი, მაგრამ სხვადასხვა პარამეტრები.
        // method override-ეს არის როცა ხდება მეთოდების გადაფარვა, რაც ამ მეთოდის იმპლემენტაციის შეცვლას გულისხმობს.

        //12.
        //აბტრაქტულ კლასს შეუძლია რომ ჰქონდეს აბტრაქტული მეთოდებიც და არა-აბსტრაქტული მეთოდებიც.
        //როცა ინტერფეისს, აუცილებლად აბსტრაქტული მეთოდები აქვს, რითი ფუნქციაც სხვა კლასში გამოყენებაა.

        //13.
        /*
        Human object=new Human();
        System.out.println(object.sayHello());
        System.out.println(object.sayBye());
        System.out.println(object.run());
        System.out.println(object.jump());
         */

        //14. ა

        //15.
        /*


        double b=scanner.nextInt();
        double c=scanner.nextInt();
        String string=scanner.next();
        char s=string.charAt(0);
        switch(s){
            case '+': System.out.println(c+b);
            break;
            case '-': System.out.println(c-b);
            break;
            case '*': System.out.println(c*b);
            break;
            case '%': System.out.println(c/b);
        }

         */
        //16.
        /*
        String s1=scanner.next();
        for(int i=0;i<s1.length()/2;i++) {
            char d = s1.charAt(i);
            char e= s1.charAt(s1.length() -i- 1);
            //s1.charAt(i) = e;
            //s1.charAt(s1.length()- 1-i) =d;

}
         */

        //17.
        /*int n3=scanner.nextInt();
        int [] arr=new int[n3];
        for(int i=0;i<n3;i++){
            arr[i]=scanner.nextInt();
        }
        selectionSort(arr);

         */

        //18.
        /*int n2=scanner.nextInt();
        int target=scanner.nextInt();
        int [] arr=new int[n2];
        for(int i=0;i<n2;i++){
            int n1=scanner.nextInt();
            arr[i]=n1;
        }
        int count=0;
        for(int i=0;i<n2-1;i++){
            for(int k=i+1;k<n2;k++){
                if(arr[i]+arr[k]==target){
                    System.out.println("Index 1 and 2:"+ i +" and "+ k);
                    count++;
                    break;
                }
            }
        }
        if(count==0) System.out.println("Couldn't find definite indexes");
        
         */









    }
}
