package ch10;

public class Duck {
    private int size;
    private static int duckCount = 0;
    private static String name = "KKKK";
    static int num = 99;
    static final int PP ;

    static {
        PP = 99;
    }

    public  Duck() {
        duckCount ++;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public static int getDuckCount() {
        return duckCount;
    }

    public static String getName() {
        return name;
    }
}
