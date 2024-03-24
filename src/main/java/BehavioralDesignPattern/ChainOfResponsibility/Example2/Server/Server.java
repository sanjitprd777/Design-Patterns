package BehavioralDesignPattern.ChainOfResponsibility.Example2.Server;

import BehavioralDesignPattern.ChainOfResponsibility.Example2.Middleware.Middleware;

import java.util.HashMap;

public class Server {

    private final Middleware middleware;
    public static HashMap<String, String> userDb;

    public Server(Middleware middleware) {
        this.middleware = middleware;
        userDb = new HashMap<>();
        userDb.put("sanjit", "12345");
        userDb.put("sahil", "12345");
        userDb.put("surendraadmin", "12345");
    }

    public boolean checkUser(String email, String password) {
        if (middleware.check(email, password)) {
            System.out.println("Authentic user");
            return true;
        }
        else {
            System.out.println("User not registered");
        }
        return false;
    }

    public static boolean checkEmail(String email) {
        return (userDb.containsKey(email));
    }

    public static boolean validatePassword(String email, String pwd) {
        return (userDb.get(email).equals(pwd));
    }
}
