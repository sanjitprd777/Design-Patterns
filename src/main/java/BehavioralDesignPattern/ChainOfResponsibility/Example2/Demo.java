package BehavioralDesignPattern.ChainOfResponsibility.Example2;

import BehavioralDesignPattern.ChainOfResponsibility.Example2.Middleware.AuthenticationCheck;
import BehavioralDesignPattern.ChainOfResponsibility.Example2.Middleware.AuthorizationCheck;
import BehavioralDesignPattern.ChainOfResponsibility.Example2.Middleware.Middleware;
import BehavioralDesignPattern.ChainOfResponsibility.Example2.Server.Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo {

    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        Middleware middleware = Middleware.linkMiddleware(new AuthenticationCheck(), new AuthorizationCheck());
        Server server = new Server(middleware);

        boolean success;
        do {
            System.out.println("Enter email");
            String email = reader.readLine();
            System.out.println("Enter password");
            String password = reader.readLine();
            success = server.checkUser(email, password);
        } while (!success);
    }
}
