package BehavioralDesignPattern.ChainOfResponsibility.Example2.Middleware;

public class AuthorizationCheck extends Middleware {
    @Override
    public boolean check(String email, String password) {
        if (email.contains("admin")) {
            System.out.println("You're authorized to perform Admin actions");
        }
        else {
            System.out.println("You're can only perform basic actions");
        }
        return super.checkNext(email, password);
    }
}
