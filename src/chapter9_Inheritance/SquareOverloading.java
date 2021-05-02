package chapter9_Inheritance;

public class SquareOverloading extends Rectangle {

    //Overloading same name different parameters
    public void print(String what) {
        System.out.println("I am a " + what);
    }
}
