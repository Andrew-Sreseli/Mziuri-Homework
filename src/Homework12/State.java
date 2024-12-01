package Homework12;

public class State {
    private final String name;
    private final String capitalCity;
    private final int populace;
    private final int area;
    State(String name,String capitalCity,int populace,int area){
        this.name=name;
        this.capitalCity=capitalCity;
        this.populace=populace;
        this.area=area;
    }
    static class River{
        private final String name;
        private final int length;
        River(String name,int length){
            this.name=name;
            this.length=length;
        }
        String getName(){
            return name;
        }
        int getLength(){
            return length;
        }

        @Override
        public String toString() {
            return "River name: "+name+"\n"+"River length: "+length+"\n";
        }
    }

    @Override
    public String toString() {
        return "Name: "+name+"\n"+"Capital city: "+capitalCity+"\n"+"populace: "+populace+"\n"+"Area: "+area+"\n";
    }
}
