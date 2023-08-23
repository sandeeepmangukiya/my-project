package Bank;

public class Main {
    public static void main(String[] args) {
        Bank obj1 = new SBI();
        Bank obj2 = new PNB();
        System.out.println("the rate of interest at SBI is " + obj1.getRateOfInterest());
        System.out.println("the rate of interest at PNB is " + obj2.getRateOfInterest());
    }
}
