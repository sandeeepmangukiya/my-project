package Bike;

public class Main {
    public static void main(String[] args) {   
        Bike activa = new Honda();
        MotorBike obj1 = new SportBike();
        MotorBike obj2 = new MountainBike();
        obj1.brake();
        obj2.brake();
        activa.run();
    }

}
