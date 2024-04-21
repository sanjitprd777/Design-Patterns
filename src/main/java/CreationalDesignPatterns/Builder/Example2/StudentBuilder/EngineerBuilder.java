package CreationalDesignPatterns.Builder.Example2.StudentBuilder;

import java.util.List;

public class EngineerBuilder extends StudentBuilder {

    public EngineerBuilder() {
        subjects = List.of("OS", "DSA");
    }
}
