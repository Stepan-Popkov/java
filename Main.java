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
}




//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        List<LifeForm> Forms=new ArrayList<>();
        Forms.add(new Cat("Tigr", 9));


        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}