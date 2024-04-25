package view;

import model.domain.Acquirente;
import model.domain.Credentials;
import model.domain.Role;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class AcquirenteRegistrazione {

    public AcquirenteRegistrazione() {
    }

    public static Credentials register() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Inserisci un username: ");
        String username = reader.readLine();
        System.out.println("Inserisci una password: ");
        String password = reader.readLine();
        return new Credentials(username, password, Role.ACQUIRENTE);
    }

    public static Acquirente setUserInfo(Credentials credentials) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Inserisci il codice fiscale: ");
        String codiceFiscale = reader.readLine();
        System.out.println("Inserisci il tuo nome: ");
        String nome = reader.readLine();
        System.out.println("Inserisci il tuo cognome: ");
        String cognome = reader.readLine();
        Date dataDiNascita = null;

        try {
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            dateFormat.setLenient(false);
            System.out.println("Inserisci la tua data di nascita: [yyyy-mm-dd]");
            java.util.Date date = dateFormat.parse(reader.readLine());
            dataDiNascita = new Date(date.getTime());
        } catch (ParseException var16) {
            System.out.println("Errore nell'inserimento della data di nascita");
            var16.printStackTrace();
            System.exit(1);
        }

        System.out.println("Inserisci il numero della tua carta di credito: ");
        String numeroCartaDiCredito = reader.readLine();
        Date dataDiScadenzaCartaDiCredito = null;

        try {
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            dateFormat.setLenient(false);
            System.out.println("Inserisci la data di scadenza della carta di credito: [yyyy-mm-dd]");
            java.util.Date date = dateFormat.parse(reader.readLine());
            dataDiScadenzaCartaDiCredito = new Date(date.getTime());
        } catch (ParseException var15) {
            System.out.println("Errore nell'inserimento della data di scadenza della carta di credito: ");
            var15.printStackTrace();
            System.exit(1);
        }

        System.out.println("Inserisci il cvv della carta di credito: ");
        String cvv = reader.readLine();

        Acquirente user = new Acquirente(codiceFiscale, nome, cognome, dataDiNascita, numeroCartaDiCredito, credentials.getUsername(), credentials.getPassword(), dataDiScadenzaCartaDiCredito, cvv);
        return user;
    }
}
