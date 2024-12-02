package Homework12;

public interface Insurance {
    String name="";
    public void packageInfo();
    public void bill();
}

class AutoInsurance implements Insurance{
    String name="Bank Of Georgia";
    int carAge;
    int carPrice;
    AutoInsurance(int carAge,int carPrice){
        this.carAge=carAge;
        this.carPrice=carPrice;
    }
    public void bill(){
        System.out.println("Insurance Bill: 125 GEL per month");
    }
    public void packageInfo(){
        System.out.println("AutoInsurance Info: ");
        System.out.println("Name: "+name);
        System.out.println("Car Age: "+carAge);
        System.out.println("Car Price: "+carPrice);
    }

}

class Healthcare implements Insurance{
    String name="Tibisi";
    int salary;
    int age;
    boolean foreignInsurance;
    Healthcare(int salary,int age,boolean foreignInsurance){
        this.salary=salary;
        this.age=age;
        this.foreignInsurance=foreignInsurance;
    }
    public void bill(){
        System.out.println("Insurance Bill: 1500 GEL per month");
    }

    public void packageInfo(){
        System.out.println("Healthcare Insurance Info: ");
        System.out.println("Name: "+name);
        System.out.println("Recorded Salary : "+salary);
        System.out.println("Recorded Age: "+age);
        if(foreignInsurance) System.out.println("Bill: "+1500*1.2+"GEL");
        else System.out.println("Bill: 1500 GEL");
    }

}

class TravelInsurance implements Insurance {
    String name = "EKTA traveling";
    int days;
    int personSum;
    boolean baggageInsurance;
    TravelInsurance(int days, int personSum, boolean baggageInsurance) {
        this.days = days;
        this.personSum = personSum;
        this.baggageInsurance = baggageInsurance;
    }

    public void bill(){
        System.out.println("Insurance Bill: 50 GEL per person, 100 GEL per day");
    }

    public void packageInfo() {
        System.out.println("Travel Insurance Info: ");
        System.out.println("Name: " + name);
        System.out.println("Travel Days : " + days);
        System.out.println("Traveling People Amount: " + personSum);
        if (baggageInsurance) System.out.println("Bill: "+(50*days+100*personSum)*1.1+"GEL");
        else System.out.println("Bill: "+50*days+100*personSum+"GEL");
    }

}
class Customer{
    String name;
    String surname;
    String SSN;
    int age;
    Customer(String name,String surname,String SSN,int age){
        this.name=name;
        this.surname=surname;
        this.SSN=SSN;
        this.age=age;
    }

}
