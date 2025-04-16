package Test3;

import java.io.Serializable;

public class Patient implements Serializable {
    private final String name;
    private final String surname;
    private final int age;
    private final String condition;
    Patient(String name, String surname, int age, String condition){
        this.name=name;
        this.surname=surname;
        this.age=age;
        this.condition=condition;
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
    String getCondition(){
        return condition;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", condition='" + condition + '\'' +
                '}';
    }
}
