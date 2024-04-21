package CreationalDesignPatterns.Builder.Example2;

import CreationalDesignPatterns.Builder.Example2.StudentBuilder.DoctorBuilder;
import CreationalDesignPatterns.Builder.Example2.StudentBuilder.EngineerBuilder;
import CreationalDesignPatterns.Builder.Example2.StudentBuilder.StudentBuilder;

public class Demo {

    public static void main(String[] args) {
        StudentBuilder studentBuilder = new EngineerBuilder();

        // Create student
        Student student = studentBuilder.setId(1).setAge(25).setName("Sanjit").setRollNumber("2016IPG091").build();
        System.out.println(student);

        StudentBuilder studentBuilder1 = new EngineerBuilder();
        Student student1 = studentBuilder1.setId(1).setAge(25).setRollNumber("2016IPG091").build();
        System.out.println(student1);


        StudentBuilder studentBuilder2 = new DoctorBuilder("father name");
        Student student2 = studentBuilder2.setId(1).setAge(25).setName("Sanjit").build();
        System.out.println(student2);

    }
}
