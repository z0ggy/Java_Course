package home_work;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println(deFront("away")); // aay
    }

    public static String deFront(String str) {
        String front = str.substring(2);
        String first = str.substring(0, 1);
        String second = str.substring(1, 2);
        System.out.println("front " + front);
        System.out.println("first " + first);

        if (first.equals("a")) {
            return first + front;
        }

        if (second.equals("b")) {
            return second + front;
        }

        return front;
    }

}
