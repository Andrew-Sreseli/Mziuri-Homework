package Homework19Lesson28;

import java.util.Arrays;

public class BasketballPlayer{
    private final String name;
    private final String surname;
    private final int [] ballSituations= new int[5];
    BasketballPlayer(String name,String surname,int [] arr){
        this.name=name;
        this.surname=surname;
        System.arraycopy(arr, 0, this.ballSituations, 0, 5);
    }
    String getName(){
        return name;
    }
    String getSurname(){
        return surname;
    }
    Double getAllBallSituationSum(){
        return ballSituations[0] +ballSituations[1]*(-1)+ballSituations[2]*1.5+ballSituations[3]*2+ballSituations[4]*(-2);
    }

    @Override
    public String toString() {
        return "BasketballPlayer{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", ballSituations=" + Arrays.toString(ballSituations) +
                '}';
    }
}

