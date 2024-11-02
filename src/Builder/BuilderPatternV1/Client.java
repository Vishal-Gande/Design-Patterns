package Builder.BuilderPatternV1;

public class Client {

    public static void main(String[] args) {

        Builder b = new Builder();
        b.setName("vish");
        b.setAge(27);
        b.setGpa(7.11);

        if(b.validateAttrs() == false )
        {
            // handle exceptions code
        }

        // if validation successful, control reaches this line

        Student S = new Student(b);
    }
}
