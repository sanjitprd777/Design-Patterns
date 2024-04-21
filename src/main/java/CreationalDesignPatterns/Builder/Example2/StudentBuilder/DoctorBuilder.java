package CreationalDesignPatterns.Builder.Example2.StudentBuilder;

import java.util.List;

public class DoctorBuilder extends StudentBuilder {
    public String fname;

    public DoctorBuilder(String father) {
        fname = father;
        subjects = List.of("BIO", "CARDIO");
    }
}
