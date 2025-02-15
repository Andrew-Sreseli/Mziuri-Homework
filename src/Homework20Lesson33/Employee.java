package Homework20Lesson33;

import java.util.Comparator;

public class Employee implements Comparable<Employee> {
    private final String name;
    private final int salary;
    Employee(String name,int salary){
        this.name=name;
        this.salary=salary;
    }
    String getName(){
        return name;
    }
    int getSalary(){
        return salary;
    }

    @Override
    public int compareTo(Employee employee) {
        return Double.compare(this.salary,employee.salary);
    }
    @Override
    public String toString() {
        return "Employee: name= " + name + " , salary=" + salary;
    }
}

class DescendingNames implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return e2.getName().compareTo(e1.getName());
    }
}


