package home_work;

public class Test {
    public static void main(String[] args) {
        System.out.println(conCat("cat", "tad"));

    }


    public static String conCat(String a, String b) {
        String output = a + b;
        String front = "";
        String back = "";

        if (a.length() > 0) {
            front = a.substring(a.length() - 1);
        }

        if (b.length() > 0) {
            back = b.substring(0, 1);
        }

        if (front.equals(back)) {
            output = a + b.substring(1);
        }


        return output;
    }

}
