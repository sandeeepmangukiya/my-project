package FirstInterface;
interface FirstInterface {
    public void myMethod();
}

interface SecondInterface {
    public void myOtherMethod();
}

class DemoClass implements FirstInterface, SecondInterface {
    public void myMethod(){
        System.out.println("This is my first method.....");
    }

    public void myOtherMethod(){
        System.out.println("This is my other method.....");
    }
}