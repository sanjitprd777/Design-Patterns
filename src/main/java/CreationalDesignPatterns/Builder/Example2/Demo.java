package CreationalDesignPatterns.Builder.Example2;

public class Demo {

    public static void main(String[] args) {
        StudentBuilder studentBuilder = new StudentBuilder();

        // Create student
        Student student = studentBuilder.setId(1).setAge(25).setName("Sanjit").setRollNumber("2016IPG091").build();
        System.out.println(student);

        StudentBuilder studentBuilder1 = new StudentBuilder();
        Student student1 = studentBuilder1.setId(1).setAge(25).setRollNumber("2016IPG091").build();
        System.out.println(student1);


        StudentBuilder studentBuilder2 = new StudentBuilder();
        Student student2 = studentBuilder2.setId(1).setAge(25).setName("Sanjit").build();
        System.out.println(student2);

    }
}
