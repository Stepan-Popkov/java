import java.util.ArrayList;
import java.util.List;

abstract class LifeForm{
    String name;
    int age;
    public LifeForm(){
       this.name="Unknown";
       this.age=0;
    }
    abstract void grow();
    public LifeForm (String name, int age){
        this.name=name;
        this.age=age;
    }

}
abstract class Animal extends LifeForm{
    abstract void makeSound();
    void eat(){
        System.out.println("Animal "+ name+ " is eating");
    }
    @Override
    void grow(){
        System.out.println("Animal "+name+ " became older");//я решил что так будет лучше
    }
       public Animal(){
        this.name="Unknown";
        this.age=0;
    }
    public Animal (String name, int age){
        this.name=name;
        this.age=age;
    }
}
abstract class Plant extends LifeForm{
    abstract void performPhotosynthesis();
    void absorbWater(){
        System.out.println("Plant "+ name+ " is absorbing water");
    }
    int height;
    @Override
    void grow(){
        System.out.println("Plant "+ name + " is growing towards the sun and height now is: "+ height);
    }
     public Plant(){
        this.name="Unknown";
        this.age=0;
    }
    public Plant (String name, int age){
        this.name=name;
        this.age=age;
    }

}
interface CanRun {
    void run();
}
interface CanSwim{
    void swim();
}
interface CanFly{
    void fly();
}
interface ProducesFruit{
    void produceFruit();
}
interface HasThorns{
    void poke();
}
class Dog extends Animal implements CanRun{
    @Override
    void makeSound(){
        System.out.println("Bark!");
    }
    @Override
   public void run(){
        System.out.println("Dog "+ name+ " is running");
    }
    public Dog(){
        this.name="Unknown";
        this.age=0;
    }
    public Dog (String name, int age){
        this.name=name;
        this.age=age;
    }

}
class Cat extends Animal implements CanRun{
    @Override
    void makeSound(){
        System.out.println("Meow!");
    }
    @Override
    public void run(){
        System.out.println("Cat "+ name+ " is running");
    }
     public Cat(){
        this.name="Unknown";
        this.age=0;
    }
    public Cat (String name, int age){
        this.name=name;
        this.age=age;
    }

}
class Duck extends Animal implements CanFly, CanSwim{
    @Override
    void makeSound(){
        System.out.println("Quack!");
    }
    @Override
    public void fly(){System.out.println("Duck "+name+" is flying");}
    @Override
    public void swim(){System.out.println("Duck "+name+" is swimming");}
    public Duck(){
        this.name="Unknown";
        this.age=0;
    }
    public Duck (String name, int age){
        this.name=name;
        this.age=age;
    }

}
class Rose extends Plant implements HasThorns {
    @Override
    public void poke() {
        System.out.println("Rose " + name + " is pokes you with its thom");
    }

    @Override
    void performPhotosynthesis() {
        System.out.println("Plant " + name + " is performing photosynthesis");
    }
     public Rose(){
        this.name="Unknown";
        this.age=0;
    }
    public Rose (String name, int age){
        this.name=name;
        this.age=age;
    }
}
class AppleTree extends Plant implements ProducesFruit{
    @Override
    public void performPhotosynthesis(){
        System.out.println("Plant "+name+" is performing photosynthesis");
    }
    @Override
    public void produceFruit(){
        System.out.println("AppleTree "+ name+" produces apples");
    }
    public AppleTree(){
        this.name="Unknown";
        this.age=0;
    }
    public AppleTree(String name, int age){
        this.name=name;
        this.age=age;
    }

}



//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        List<LifeForm> Forms=new ArrayList<>();
        Forms.add(new Cat("Tigr", 9));
          Forms.add(new AppleTree("Red Apples", 7));
        Forms.add(new Duck("Donald", 14));
        Forms.add(new Dog("Moly",2));
        Forms.add(new Rose("White", 4));
        

        for (int i = 0; i < Forms.size(); i++) {
            Forms.get(i).grow();
        }
          for (int k=0; k< Forms.size();k++){
              if(Forms.get(k) instanceof Animal){
                  ((Animal) Forms.get(k)).makeSound();
                  ((Animal) Forms.get(k)).eat();
              }


              else if(Forms.get(k) instanceof Plant) {
                  Forms.get(k).absorbWater();
              }
          }


        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}
