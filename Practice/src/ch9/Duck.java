package ch9;

public class Duck {
    int size;

    public void setSize(int size) {
        this.size = size;
    }

    public Duck (int s) {
        size = s;
        System.out.println("I love you, Miley!");
        System.out.println("Size is: " + s);

    }
    public void Duck(String str) {
        System.out.println("I love you: " + str);
    }
    public void Duck(String str,int in) {
        System.out.println("I love you: " + str + in);
    }

}
