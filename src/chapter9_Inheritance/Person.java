package chapter9_Inheritance;

public class Person {

    private String name;
    private int age;
    private String gender;

    //Default constructor do not need to create is here just to show it
    //if not created it gone when non default constructor is created
    public Person() {
        System.out.println("In Person default constructor");
    }

    //Non default constructor take an parameter
    public Person(String name) {
        System.out.println("In Person 2nd constructor. Name is set");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

}
