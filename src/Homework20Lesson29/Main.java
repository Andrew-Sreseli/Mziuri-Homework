package Homework20Lesson29;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>();
        int n=scanner.nextInt();

        for (int i=0;i<n;i++) {
            String name=scanner.next();
            int salary=scanner.nextInt();
            employees.add(new Employee(name, salary));
        }

        Collections.sort(employees);
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        employees.sort(new DescendingNames());
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        Employee maxSalary=Collections.max(employees,Comparator.comparingDouble(Employee::getSalary));
        Employee minSalary=Collections.min(employees,Comparator.comparingDouble(Employee::getSalary));
        System.out.println("Maximum salary: "+maxSalary);
        System.out.println("Minimum salary: "+minSalary);

        Collections.reverse(employees);
        for (Employee employee : employees) {
            System.out.println(employee);
        }

    }
}











