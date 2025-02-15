package Homework19Lesson31;



public class Car {
    private final String company;
    private final String model;
    private final int releaseDate;
    private final int mileage;
    Car(String company, String model, int releaseDate, int mileage){
        this.company=company;
        this.model=model;
        this.releaseDate=releaseDate;
        this.mileage=mileage;
    }
    String getCompany(){
        return company;
    }
    String getModel(){
        return model;
    }
    int getReleaseDate(){
        return releaseDate;
    }
    int getMileage(){
        return mileage;
    }

    class Engine{
        String gasType;
        int cylinderSum;
        int volume;
        Engine(String gasType,int cylinderSum,int volume){
            this.gasType=gasType;
            this.cylinderSum=cylinderSum;
            this.volume=volume;
        }

        int getReleaseDate(){
            return releaseDate;
        }
        int getMileage(){
            return mileage;
        }
        int getVolume(){
            return volume;
        }

        @Override
        public String toString() {
            return "Engine{" +
                    "gasType='" + gasType + '\'' +
                    ", cylinderSum=" + cylinderSum +
                    ", volume=" + volume +
                    '}';
        }

        public String PrintAll() {
            return "Car{" +
                    "company='" + company + '\'' +
                    ", model='" + model + '\'' +
                    ", releaseDate=" + releaseDate +
                    ", horsePower=" + mileage +
                    '}';
        }

    }

}
