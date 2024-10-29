package BuilderPatternV1;

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
}
