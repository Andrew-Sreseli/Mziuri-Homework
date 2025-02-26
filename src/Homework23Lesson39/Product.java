package Homework23Lesson39;

public class Product {
    String name;
    int price;
    Product(String name,int price){
        this.name=name;
        this.price=price;
    }

    int getPrice(){
        return price;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
