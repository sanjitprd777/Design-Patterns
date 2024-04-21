package BehavioralDesignPattern.Template.Payment;

public class NetBanking extends PaymentAbs {
    @Override
    void validate() {
        System.out.println("NetBanking transaction validated");
    }

    @Override
    public void deduct() {
        System.out.println("NetBanking money deducted");
    }

    @Override
    public void transfer() {
        System.out.println("NetBanking money transferred");
    }

    @Override
    public void credit() {
        System.out.println("NetBanking money credited");
    }

    @Override
    public void notification() {
        System.out.println("NetBanking money notification");
    }
}
