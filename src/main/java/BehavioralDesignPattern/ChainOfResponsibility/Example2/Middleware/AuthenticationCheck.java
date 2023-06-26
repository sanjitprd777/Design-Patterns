package BehavioralDesignPattern.ChainOfResponsibility.Example2.Middleware;

import BehavioralDesignPattern.ChainOfResponsibility.Example2.Server.Server;

public class AuthenticationCheck extends Middleware {

    @Override
    public boolean check(String email, String password) {
        if (!Server.checkEmail(email)) {
            System.out.println("Email not registered");
            return false;
        }
        if (!Server.validatePassword(email, password)) {
            System.out.println("Invalid password given");
            return false;
        }
        return super.checkNext(email, password);
    }
}
