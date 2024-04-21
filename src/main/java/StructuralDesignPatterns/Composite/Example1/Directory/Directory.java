package StructuralDesignPatterns.Composite.Example1.Directory;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileDirectory {

    String name;
    List<FileDirectory> fileDirectories;

    public Directory() {}

    public Directory(String name) {
        this.name = name;
        fileDirectories = new ArrayList<>();
    }

    public void add(FileDirectory fileDirectory) {
        fileDirectories.add(fileDirectory);
    }

    public void ls(String path) {
        System.out.println("Directory Name: " + name);
        for (FileDirectory fileDirectory : fileDirectories) {
            fileDirectory.ls(path!=null?path+"/"+name:name);
        }
    }
}
