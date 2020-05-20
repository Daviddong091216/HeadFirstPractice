package ch8;

public abstract class Animal {
    private String name;

    public String getName() {
        return name;
    }

    public Animal(String aName) {
        name = aName;
        System.out.println("I am a animal. name is: " + aName);
    }
    public abstract void eat();
    public void sleep() {
        System.out.println("sleeping....");
    };
    public void play(){
        System.out.println("Let's play together.");
    };

}
