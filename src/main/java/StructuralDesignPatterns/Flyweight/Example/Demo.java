package StructuralDesignPatterns.Flyweight.Example;

public class Demo {

    public static void main(String[] args) {
        Forest forest = new Forest();

        int totalTree = 1000000;
        for (int i=0; i<totalTree; ++i) {
            forest.plantTree(i, i, "Mange", "Green", "Sweet Mange");
            forest.plantTree(i, i, "Apple", "Red", "Sweet Apple");
            forest.plantTree(i, i, "Pineapple", "White", "Sweet Pineapple");
        }

        System.out.println(totalTree + " trees drawn");
//        forest.plant();
        System.out.println("---------------------");
        System.out.println("Memory usage:");
        System.out.println("Tree size (8 bytes) * " + totalTree);
        System.out.println("+ TreeTypes size (~30 bytes) * " + 3 + "");
        System.out.println("---------------------");
        System.out.println("Total: " + ((totalTree * 8 + 3 * 30) / 1024 / 1024) +
                "MB (instead of " + ((totalTree * 38) / 1024 / 1024) + "MB)");
    }
}
