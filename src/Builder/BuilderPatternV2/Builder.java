package Builder.BuilderPatternV2;

public class Builder {


    // public coz these attrs will be accessed in Student constructor
    public String name;
    public int age;
    public double gpa;


    public Builder setName(String name) {
        this.name = name;
        return this;
    }
    public Builder setAge(int age) {
        this.age = age;
        return this;
    }
    public Builder setGpa(double gpa) {
        this.gpa = gpa;
        return this;
    }

    public Student build(){

        // add code for validation and throw exceptions
        return new Student(this);
    }
    public boolean validateAttrs()
    {
        // add logic for false
        return true;
    }
}
