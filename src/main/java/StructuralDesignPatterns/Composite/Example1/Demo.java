package StructuralDesignPatterns.Composite.Example1;

import StructuralDesignPatterns.Composite.Example1.Directory.Directory;
import StructuralDesignPatterns.Composite.Example1.Directory.File;

public class Demo {

    public static void main(String[] args) {
        File file = new File("image1.png");
        File file1 = new File("text.txt");
        File file2 = new File("movie.mp4");
        Directory directory = new Directory("Drive D:");
        directory.add(file);
        Directory directory1 = new Directory("Miscellaneous");
        directory1.add(file1);
        directory1.add(file2);
        directory.add(directory1);
        directory.ls(null);
    }
}
