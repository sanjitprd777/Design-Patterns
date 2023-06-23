package StructuralDesignPatterns.Composite.Example1.Directory;

public class File implements FileDirectory {
    String name;

    public File() {}

    public File(String name) {
        this.name = name;
    }

    public void ls() {
        System.out.println("File Name: " + name);
    }
}
