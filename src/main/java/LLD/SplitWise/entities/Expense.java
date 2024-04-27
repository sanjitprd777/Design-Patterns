package LLD.SplitWise.entities;

public class Expense {

    String id;
    String name;
    Amount amount;
    String userId;

    public Expense(String id, String name, Amount amt, String usr) {
        this.id = id;
        this.name = name;
        this.amount = amt;
        this.userId = usr;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Amount getAmount() {
        return amount;
    }

    public String getUserId() {
        return userId;
    }
}
