package Project02;

import java.io.Serializable;

public class PhoneContact implements Serializable {
    private String name;
    private String surname;
    private int phoneNumber;
    private String email;
    PhoneContact(String name,String surname,int phoneNumber,String email){
        this.name=name;
        this.surname=surname;
        this.phoneNumber=phoneNumber;
        this.email=email;
    }
    String getName(){
        return name;
    }
    String getSurname(){
        return surname;
    }
    int getPhoneNumber(){
        return phoneNumber;
    }
    String getEmail(){
        return email;
    }
    void setName(String name){
        this.name=name;
    }
    void setSurname(String surname){
        this.surname=surname;
    }
    void setPhoneNumber(int phoneNumber){
        this.phoneNumber=phoneNumber;
    }
    void setEmail(String email){
        this.email=email;
    }

}
