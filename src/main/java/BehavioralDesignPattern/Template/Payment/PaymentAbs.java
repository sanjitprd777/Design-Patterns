package BehavioralDesignPattern.Template.Payment;

public abstract class PaymentAbs {
    //  The access modifier for an abstract method is considered to be the same as the class it belongs to.
    //  If the class is public, then the abstract method is also considered public by default.
    abstract void validate();
    public abstract void deduct();
    public abstract void transfer();
    public abstract void credit();
    public abstract void notification();

    public final void sendMoney() {
        validate();

        deduct();

        transfer();

        credit();

        notification();
    }
}
