package ch8;

public class Cat extends Animal implements Pet , Pp{

    public Cat(String aName) {
        super(aName);
    }
    @Override
    public void eat() {

    }

    @Override
    public void play() {
        super.play();
        System.out.println("Play with cats.");

    }

    @Override
    public void beFriendly() {
        System.out.println("Hi, we are good friends.");
    }
}
