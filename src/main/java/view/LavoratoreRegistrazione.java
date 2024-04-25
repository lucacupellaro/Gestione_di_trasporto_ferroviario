package view;

import model.domain.Acquirente;
import model.domain.Credentials;
import model.domain.Lavoratore;
import model.domain.Role;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class LavoratoreRegistrazione {
    public LavoratoreRegistrazione() {
    }

    public static Credentials register() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Inserisci un username: ");
        String username = reader.readLine();
        System.out.println("Inserisci una password: ");
        String password = reader.readLine();
        return new Credentials(username, password, Role.LAVORATORI);
    }

    public static Lavoratore setLavoratoreInfo(Credentials credentials) throws IOException {
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

        Lavoratore lavoratore = new Lavoratore(codiceFiscale, nome, cognome, dataDiNascita, credentials.getUsername(), credentials.getPassword());
        return lavoratore;
    }
}
