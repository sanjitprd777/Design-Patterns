package CreationalDesignPatterns.Prototype.Example2.Products;

import CreationalDesignPatterns.Prototype.Example2.Interface.Product;

import java.util.Objects;

public class Copy implements Product {

    private String subject;

    public Copy() {}

    public Copy(Copy target) {
        if (target != null) {
            this.subject = target.subject;
        }
    }

    @Override
    public Product clone() {
        return new Copy(this);
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Copy copy))    return false;
        return (Objects.equals(subject, copy.subject));
    }
}
