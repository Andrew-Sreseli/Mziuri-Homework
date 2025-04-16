package Test2;

public interface Speak {
    String sayHello();
    String sayBye();

}
 interface Move extends Speak  {
    String jump();
    String run();
}
  class Human implements Move  {
    public String sayHello(){
        return "Hello!";
    }
    public String sayBye(){
        return "Bye";
    }
    public String jump(){
        return "Started Jumping";
    }
    public String run(){
        return "Started running";
    }



}
