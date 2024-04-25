package view;

import model.domain.Credentials;
import model.domain.GestoriDelServizio;
import model.domain.Lavoratore;
import model.domain.Role;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class GestoreDelServizioRegistrationView {
    public GestoreDelServizioRegistrationView() {
    }

    public static Credentials register() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Inserisci un username: ");
        String username = reader.readLine();
        System.out.println("Inserisci una password: ");
        String password = reader.readLine();
        return new Credentials(username, password, Role.GESTORI_DEL_SERVIZIO);
    }

    public static GestoriDelServizio setGestoreInfo(Credentials credentials) throws IOException {

        GestoriDelServizio gestoriDelServizio = new GestoriDelServizio( credentials.getUsername(), credentials.getPassword());
        return gestoriDelServizio;
    }
}
