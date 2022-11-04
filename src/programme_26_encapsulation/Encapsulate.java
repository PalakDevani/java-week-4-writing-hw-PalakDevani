package programme_26_encapsulation;

public class Encapsulate {
    // private variables declared these can only be accessed by public methods of class
    private String name;
    private int rollNo;
    private int age;

    public void setName(String name) //set method for name to access private variable name
    {
        this.name = name;
    }

    public String getName() // get method for Name to access private variable age
    {
        return name;
    }

    public int getRollNo()     // get method for roll to access private variable rollNo
    {
        return rollNo;
    }

    // set method for roll to access private variable rollNo
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    // get method for age to access private variable age
    public int getAge() {
        return age;
    }

    // set method for age to access private variable age
    public void setAge(int age) {
        this.age = age;
    }
}
