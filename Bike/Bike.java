package Bike;
public abstract class Bike {
    abstract void run();
}
class Honda extends Bike{
    void run(){
        System.out.println("running safe!!");
    }
}