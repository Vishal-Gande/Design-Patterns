package Builder.BuilderPatternFinal;

public class Student {

    private String name;
    private int age;
    private double gpa;


    // Make constructor pvt now, as builder class is within Student class.
    // this solves for problems with v2 :
    // Student s2 = new builder(b); this way of initialising objects should not be allowed


    // extra note:
    // Qsn: can attributes of builder object be used in student class, as it's private and outside the inner builder class
    //Yes, attributes of the Builder object can be used within the Student class, even though they are private, because the Student constructor accepts a Builder instance as a parameter. In Java, nested classes (including static inner classes) have special access rights to the private fields of each other. This means that the outer class (Student) can access private fields of its inner class (Builder), and vice versa.
    private Student(Builder b)
    {
        this.name = b.name;
        this.age = b.age;
        this.gpa = b.gpa;

        System.out.println("Student object created successfully");
    }

    public static Builder getBuilder()
    {
        return new Builder();
    }

    // ****** adding builder class code here *****

    // The Builder class is static so it can be accessed via Student without needing an instance of Student.
   // A static inner class can be instantiated independently of its outer class instance.
    public static class Builder {

        private String name;
        private int age;
        private double gpa;


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
}
