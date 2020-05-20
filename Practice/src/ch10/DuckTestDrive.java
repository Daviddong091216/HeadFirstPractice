package ch10;

public class DuckTestDrive {
    public static void main(String[] args) {
        Duck one = new Duck();
        System.out.println(Duck.getDuckCount());
        System.out.println(Duck.num);
        System.out.println(Duck.getName());
        Duck two = new Duck();
        System.out.println(Duck.getDuckCount());
        Duck three = new Duck();
        System.out.println(Duck.getDuckCount());
        System.out.println(Duck.getName());
        System.out.println(Duck.PP);
        Duck.num = 9;
//        Duck.PP = 6;


    }
}
