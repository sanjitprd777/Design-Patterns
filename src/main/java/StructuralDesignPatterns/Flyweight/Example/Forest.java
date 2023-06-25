package StructuralDesignPatterns.Flyweight.Example;

import StructuralDesignPatterns.Flyweight.Example.Trees.Tree;
import StructuralDesignPatterns.Flyweight.Example.Trees.TreeFactory;
import StructuralDesignPatterns.Flyweight.Example.Trees.TreeType;

import java.util.ArrayList;
import java.util.List;

public class Forest {

    List<Tree> trees = new ArrayList<>();

    public void plantTree(int x, int y, String name, String color, String otherDetails) {
        TreeType treeType = TreeFactory.getTreeType(name, color, otherDetails);
        Tree tree = new Tree(x, y, treeType);
        trees.add(tree);
    }

    public void plant() {
        for (Tree tree : trees) {
            tree.draw();
        }
    }
}
