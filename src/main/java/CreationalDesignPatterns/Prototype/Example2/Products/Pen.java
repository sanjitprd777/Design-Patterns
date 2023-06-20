package CreationalDesignPatterns.Prototype.Example2.Products;

import CreationalDesignPatterns.Prototype.Example2.Interface.Product;

import java.util.Objects;

public class Pen implements Product {

    private float price;

    public Pen() {}

    public Pen(Pen target) {
        super();
        if (target != null) {
            this.price = target.price;
        }
    }

    @Override
    public Product clone() {
        return new Pen(this);
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Pen))  return  false;
        return (Objects.equals(price, ((Pen) object2).price));
    }
}
