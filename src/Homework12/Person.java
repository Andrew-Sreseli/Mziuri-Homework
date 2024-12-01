package Homework12;

public class Person {
    private final String name;
    private final String surname;
    private final int age;
    Person(String name,String surname,int age){
        this.name=name;
        this.surname=surname;
        this.age=age;
    }
    String getName(){
        return name;
    }
    String getSurname(){
        return surname;
    }
    int getAge(){
        return age;
    }
}
class Doctor extends Person{
    private final String field;
    private final String rank;
    private final String hospital;
    private final int time;
    Doctor(String name,String surname,int age,String field,String rank,String hospital,int time){
        super(name,surname,age);
        this.rank=rank;
        this.field=field;
        this.hospital=hospital;
        this.time=time;
    }
    int getTime(){
        return time;
    }

    @Override
    public String toString() {
        return "Name='"+getName()+'\n' +"Surname='"+'\n' +getSurname()+"Age='"+getAge()+'\n' +"Doctor{" +
                "field='" + field + '\n' +
                ", rank='" + rank + '\n' +
                ", hospital='" + hospital + '\n' +
                ", time=" + time +
                '}';
    }
}
