package BehavioralDesignPattern.Template.Payment;

public class CreditCard extends PaymentAbs {
    @Override
    void validate() {
        System.out.println("CreditCard transaction validated");
    }

    @Override
    public void deduct() {
        System.out.println("CreditCard money deducted");
    }

    @Override
    public void transfer() {
        System.out.println("CreditCard money transferred");
    }

    @Override
    public void credit() {
        System.out.println("CreditCard money credited");
    }

    @Override
    public void notification() {
        System.out.println("CreditCard money notification");
    }

}
