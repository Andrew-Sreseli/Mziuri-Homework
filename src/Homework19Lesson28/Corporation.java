package Homework19Lesson28;

import java.util.ArrayList;
import java.util.HashMap;

class Address {
    private final String country;
    private final String city;
    private final String street;
    private final String building;

    public Address(String country, String city, String street, String building) {
        this.country=country;
        this.city=city;
        this.street=street;
        this.building=building;
    }

    @Override
    public String toString() {
        return street+", "+building+", "+city+", "+country;
    }
}

class Employee {
    private final String name;
    private final String surname;
    private final String id;
    private final int salary;

    public Employee(String name, String surname, String id, int salary) throws Exception{
        if (!(id.length()==11)) {
            throw new Exception("ID must be 11 digits and must contain only numbers.");
        }
        this.name=name;
        this.surname=surname;
        this.id=id;
        this.salary=salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return " Name: "+name+" "+" Surname: "+surname+" ID: "+id+", Salary:"+salary;
    }
}


public class Corporation {
    private final String name;
    private final Address address;
    private final HashMap<String, String> contactInfo;
    private final ArrayList<Employee> employees;

    public Corporation(String name, Address address) {
        this.name=name;
        this.address=address;
        this.contactInfo=new HashMap<>();
        this.employees=new ArrayList<>();
    }

    String getName(){
        return name;
    }
    public void addContactInfo(String infoType, String phoneNumber) {
        contactInfo.put(infoType,phoneNumber);
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void aboutUs() {
        System.out.println("Company: " + name + "Address: " + address + "Contact Numbers:\n");
        System.out.println(contactInfo);
    }
    public String getContactNumber(String type) {
        return contactInfo.getOrDefault(type,"Contact couldn't be found.");
    }

    public double totalSalary() {
        double sum=0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }


}
