package StructuralDesignPatterns.Flyweight.Example.Trees;

import java.util.HashMap;

public class TreeFactory {

    static HashMap<String, TreeType> treeTypeHashMap = new HashMap<>();

    public static TreeType getTreeType(String name, String color, String otherDetails) {
        TreeType treeType = treeTypeHashMap.get(name);
        if (treeType == null) {
            treeType = new TreeType(name, color, otherDetails);
        }
        return treeType;
    }
}
