package chapter9_Inheritance;

/*
1. Superclass constructor run first
A superclass constructor is run before the subclass's constructor

2. Use 'super' to call specific constructor

3. super calls must be first

4. Some constructor must be executed
is the superclass does not have a default constructor, the subclass must explicitly call
one of its other constructors.
 */
public class Employee extends Person {

    private String employeeId;
    private String title;

    //Default constructor
    public Employee() {
        //Use 'super' to call specific constructor
        super("Dominik");
        System.out.println("In Employee default constructor");
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
