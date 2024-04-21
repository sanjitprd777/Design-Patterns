package BehavioralDesignPattern.Template.Payment;

public class UPI extends PaymentAbs {
    @Override
    void validate() {
        System.out.println("UPI transaction validated");
    }

    @Override
    public void deduct() {
        System.out.println("UPI money deducted");
    }

    @Override
    public void transfer() {
        System.out.println("UPI money transferred");
    }

    @Override
    public void credit() {
        System.out.println("UPI money credited");
    }

    @Override
    public void notification() {
        System.out.println("UPI money notification");
    }

}
