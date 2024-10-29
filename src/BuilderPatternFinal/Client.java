package BuilderPatternFinal;

public class Client {

    public static void main(String[] args) {


        Student s = Student.getBuilder()
                .setName("vish")
                .setAge(27)
                .setGpa(7.11)
                .build()  // this build fn of builder object must return an object
                            // this method itself has code for validation as well
                ;
        //We are doing method chaining.. each of the fns return a builder object


        // problems with this code
        // Student s2 = new builder(b); this way of initialising objects should not be allowed

    }
}
