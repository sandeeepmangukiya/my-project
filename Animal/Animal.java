package Animal;
interface Animal {
    void animalSound();
    void sleep();
}

class Pig implements Animal {
    public void animalSound(){
        System.out.println("The Pig says: wee wee....");
    }
    public void sleep(){
        System.out.println("zzz...");
    }
}