package ch8;

public class Dog extends Canine {
    public Dog( String aName) {
        super(aName);
        System.out.println("I am a dog" + aName);

    }
    @Override
    public void roam() {
        System.out.println("good weather...");
    }

    @Override
    public void eat() {
        System.out.println("Eating meat....");
    }

    @Override
    public void sleep() {
        super.sleep();
        System.out.println("sleeping is very good.");
    }
    public void bark() {
        System.out.println("Barkkkkkkk");
    }

    @Override
    public void play() {

    }
}
