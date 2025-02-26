package Homework23Lesson39;

public class Worker {
    String name;
    String department;
    int wage;
    Worker(String name,String department,int wage){
        this.name=name;
        this.department=department;
        this.wage=wage;
    }

    String getName(){
        return name;
    }
    int getWage(){
        return wage;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
