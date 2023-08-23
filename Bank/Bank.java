package Bank;
public abstract class Bank {
    abstract int getRateOfInterest();
}
class SBI extends Bank{
    int getRateOfInterest(){
        return 8;
    }
}
class PNB extends Bank{
    int getRateOfInterest(){
        return 7;
    }
}
