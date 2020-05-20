package ch5;

import java.util.ArrayList;

public class ForArray {
    public static void main(String[] args) {
        String[] children1 = {"Nicole","Ethan", "Miley", "Aaron", "Damian"};
//        children[4] = "Damian";
        String[] children3 = new String [5];
        System.out.println(children1);

        for (String child : children1) {
            System.out.println(child);
        }

        for (int i = 0; i < children1.length ; i++) {
            System.out.println(children1[i]);
        }
        System.out.println("==============");
        int j = 0;
        for (int i = 0; i < children1.length ; i++) {
            if (i % 2 == 0) {
                children3[j] = children1[i];
                j ++;
            }
        }

        for (String child : children3) {
            System.out.println(child);
        }

        for (int i = 0; i < j ; i++) {
            System.out.println(children3[i]);
        }

        System.out.println("=========");

        ArrayList<String> children2 = new ArrayList<>();
        ArrayList<String> children4 = new ArrayList<>();
        children2.add("NiCole");
        children2.add("Ethan");
        children2.add("Miley");
        children2.add("Aaron");
        children2.add("Damian");
        children2.add("D");
        children2.add(5,"AA");
        children2.add(5,"BB");


        System.out.println(children2);
        children2.remove(5);
        System.out.println(children2);

        System.out.println("=============");
        for (String child : children2) {
            System.out.println(child);
        }

        for (int i = 0; i < children2.size() ; i++) {
            System.out.println(children2.get(i));
        }
        for (int i = 0; i < children2.size() ; i++) {
            if (i % 2 == 0) {
                children4.add(children2.get(i));
            }
        }
        System.out.println("=================");
        for (String child : children4) {
            System.out.println(child);
        }

        System.out.println("============");
        System.out.println(children2.isEmpty());
        System.out.println(children2.indexOf("Aaron"));
        System.out.println(children2.contains("Aaron"));

    }
}
