package view;

import model.domain.Credentials;
import model.domain.Role;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LoginView {
    public LoginView() {
    }

    public static Credentials authenticate() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("");
        System.out.println("Login");
        System.out.println("");
        System.out.println("Username: ");
        String username = reader.readLine();
        System.out.println("Password: ");
        String password = reader.readLine();
        return new Credentials(username, password, (Role)null);
    }
}
