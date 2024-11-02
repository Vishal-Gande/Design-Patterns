package Builder.BuilderPatternV1;

public class Builder {


    // public coz these attrs will be accessed in Student constructor
    public String name;
    public int age;
    public double gpa;


    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public boolean validateAttrs()
    {
        // add logic for false
        return true;
    }
}
