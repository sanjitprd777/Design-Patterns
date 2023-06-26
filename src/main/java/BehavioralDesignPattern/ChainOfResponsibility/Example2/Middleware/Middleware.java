package BehavioralDesignPattern.ChainOfResponsibility.Example2.Middleware;

public abstract class Middleware {

    Middleware next;

    public static Middleware linkMiddleware(Middleware first, Middleware... chain) {
        Middleware head = first;
        for (Middleware middleware : chain) {
            head.next = middleware;
            head = head.next;
        }
        return first;
    }

    public abstract boolean check(String email, String password);

    public boolean checkNext(String email, String password) {
        if (next != null) {
            return next.check(email, password);
        }
        return true;
    }
}
