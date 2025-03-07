package Homework24Lesson42;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;


public class Main {

    static class MyRunnableThread implements Runnable{
        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hello world!");
                if(i<=3) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
    }
    static class CounterThread extends Thread{
        @Override
        public void run() {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
                try {
                    Thread.sleep(3000);
                }catch (InterruptedException e){
                    throw new RuntimeException(e);
                }
            }
        }
    }

    static class Counter {
        final private AtomicInteger count=new AtomicInteger(0);
        void increment(){
            count.incrementAndGet();
        }
    }

    public static void generateSecretCode(){
        try {
            Thread.sleep(2000);
        }catch (Exception e) {
            throw new RuntimeException(e);
        }

        System.out.println((new Object()).hashCode());
    }

    static class Multithread extends Thread {
        public void run()
        {
            try {
                generateSecretCode();
            }
            catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        if (input == 1) {
            MyRunnableThread thread=new MyRunnableThread();
            thread.run();

        }
        if (input == 2) {
            CounterThread thread=new CounterThread();
            thread.start();

        }
        if (input == 3) {
            Counter counter=new Counter();
            Runnable print=()-> {
                for(int i=0;i<1000;i++){
                    counter.increment();
                }
            };

            Thread thread1=new Thread(print);
            Thread thread2=new Thread(print);

            thread1.start();
            thread2.start();

            try {
                thread1.join();
                thread2.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
        if (input == 4) {
            int n=100;
            for (int i = 0; i < n; i++) {
                Multithread object=new Multithread();
                object.start();
            }
        }
        
    }
}

