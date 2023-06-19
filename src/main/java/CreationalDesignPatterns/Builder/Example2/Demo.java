package CreationalDesignPatterns.Builder.Example2;

public class Demo {

    public static void main(String[] args) {
        StudentBuilder studentBuilder = new StudentBuilder();

        // Create student
        Student student = studentBuilder.setId(1).setAge(25).setName("Sanjit").setRollNumber("2016IPG091").build();
        System.out.println(student);
    }
}
