package Project02;


import java.io.*;
import java.util.ArrayList;

public class Data {

        void serialization (ArrayList < PhoneContact > arrayList) {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\Andrew\\Desktop\\Java homeworks\\PhoneBook.txt");
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
                for (PhoneContact phoneContact : arrayList) {
                    objectOutputStream.writeObject(phoneContact);
                }
                objectOutputStream.close();
                fileOutputStream.close();
            }catch (IOException e){ //
            }
        }
    void deserialization(ArrayList<PhoneContact> arrayList) {
            try {
                FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Andrew\\Desktop\\Java homeworks\\PhoneBook.txt");
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
                PhoneContact object;
                try {
                    while ((object = (PhoneContact) objectInputStream.readObject()) != null) {
                        arrayList.add(object);
                    }
                } catch (EOFException e) { //
                }
                objectInputStream.close();
                fileInputStream.close();
            } catch (IOException | ClassNotFoundException e){//
            }

    }
    void phoneBookFirstVersion() {
        ArrayList<PhoneContact> firstArray=new ArrayList<>();
        PhoneContact object= new PhoneContact("Nick","Collin",955002023,"nickc0ll@gmail.com");
        firstArray.add(object);
        PhoneContact object1= new PhoneContact("Maria","Steward",955204446,"Maria$$gmail.com");
        firstArray.add(object1);
        PhoneContact object2= new PhoneContact("Viktor","Jayce",955405678,"VikOnArc@gmail.com");
        firstArray.add(object2);
        serialization(firstArray);
    }


}

