package Builder.BuilderPatternV2;

public class Student {

    private String name;
    private int age;
    private double gpa;


    public Student(Builder b)
    {
        this.name = b.name;
        this.age = b.age;
        this.gpa = b.gpa;

        System.out.println("Student object created successfully");
    }

    // has to be static as you're calling this class variable in client line no. 8
    public static Builder getBuilder()
    {
        return new Builder();
    }
}
