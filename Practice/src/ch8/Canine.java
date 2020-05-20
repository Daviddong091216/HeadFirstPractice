package ch8;

public abstract class Canine extends Animal {
    public Canine(String aName) {
        super(aName);
        System.out.println("I am a canine." + aName);
    }
    public abstract void roam();
}
