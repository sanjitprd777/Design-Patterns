package BehavioralDesignPattern.Template;

import BehavioralDesignPattern.Template.Payment.CreditCard;
import BehavioralDesignPattern.Template.Payment.NetBanking;
import BehavioralDesignPattern.Template.Payment.PaymentAbs;
import BehavioralDesignPattern.Template.Payment.UPI;

public class TemplateDemo {

    public static void main(String[] args) {
        PaymentAbs upi = new UPI();
        upi.sendMoney();
        System.out.println();

        PaymentAbs creditCard = new CreditCard();
        creditCard.sendMoney();
        System.out.println();

        PaymentAbs netBanking = new NetBanking();
        netBanking.sendMoney();
        System.out.println();
    }
}
