package Homework12;

public class City {
    private String name;
    private int populace;
    private int area;
    City(String name,int populace,int area){
        this.name=name;
        this.populace=populace;
        this.area=area;
    }
    void setName(String name){
        this.name=name;
    }
    void setPopulace(int populace){
        this.populace=populace;
    }
    void setArea(int area){
        this.area=area;
    }
    String getName(){
        return name;
    }
    int getPopulace(){
        return populace;
    }
    int getArea(){
        return area;
    }
}
class Country extends City{
    String name1;
    City cityInfo;
    City []arr=new City [5];
    Country(String name, int populace, int area, String name1, City cityInfo, City []arr){
        super(name,populace,area);
        this.cityInfo= new City(name,populace,area);
        this.name1=name1;
        for(int i=0;i<5;i++){
            this.arr[i]= arr[i];
        }
    }

    void countArea(){
        int area=0;
        for(int i=0;i<5;i++){
            area+=arr[i].getArea();
        }
        area+=cityInfo.getArea();
        System.out.println("Country Area:"+area);
    }
    void countPopulace(){
        int population=0;
        for(int i=0;i<5;i++){
            population+=arr[i].getPopulace();
        }
        population+=cityInfo.getPopulace();
        System.out.println("Country Population:"+population);
    }

}







