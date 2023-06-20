package CreationalDesignPatterns.Prototype.Example2;

import CreationalDesignPatterns.Prototype.Example2.Interface.Product;
import CreationalDesignPatterns.Prototype.Example2.Products.Copy;
import CreationalDesignPatterns.Prototype.Example2.Products.Pen;

import java.util.ArrayList;
import java.util.List;

public class Demo {

    public static void main(String[] args) {
        Pen pen = new Pen();
        pen.setPrice(100.15f);

        Pen penClone = (Pen) pen.clone();

        Copy copy = new Copy();
        copy.setSubject("Mathematics");

        Copy copyClone = (Copy) copy.clone();

        List<Product> products = new ArrayList<>();
        products.add(pen);
        products.add(copy);
        products.add(penClone);
        products.add(copyClone);

        List<Product> productListCopy = new ArrayList<>();

        for (Product product : products) {
            productListCopy.add(product.clone());
        }

        for (int i=0; i<products.size(); ++i) {
            if (products.get(i) != productListCopy.get(i)) {
                System.out.println(i + " Yay! products are different");
                System.out.println(i + " Product: " + products.get(i).hashCode() + " " + "ProductClone: " + productListCopy.get(i).hashCode());
                if (products.get(i).equals(productListCopy.get(i))) {
                    System.out.println(i + " They are identical (yay!)");
                }
                System.out.println();
            }
        }
    }
}
