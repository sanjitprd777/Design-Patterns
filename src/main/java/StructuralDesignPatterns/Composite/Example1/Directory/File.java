package StructuralDesignPatterns.Composite.Example1.Directory;

public class File implements FileDirectory {
    String name;

    public File() { name = null; }

    public File(String name) {
        this.name = name;
    }

    public void ls(String path) {
        System.out.println("File Name: " + path + "/" + name);
    }
}
