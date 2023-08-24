package Bike;
abstract class MotorBike {
    abstract void brake();
}

class SportBike extends MotorBike {
    public void brake(){
        System.out.println("Sportbike Brake!!!!");
    }
}

class MountainBike extends MotorBike {
    public void brake(){
        System.out.println("Mountainbike Brake!!!!");
    }
}