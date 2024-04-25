package model.domain;

import javax.xml.crypto.Data;
import java.sql.Date;

public class Acquirente {
    private String codiceFiscale;
    private String nome;
    private String cognome;
    private Date dataDiNascita;
    private String numeroCartaDiCredito;

    private Date dataDiScadenzaCartaDiCredito;
    private String cvv;

    private String username;
    private String password;

    public Acquirente(String codiceFiscale,String nome,String cognome,Date dataDiNascita, String numeroCartaDiCredito, String username, String password, Date dataDiScadenzaCartaDiCredito, String cvv){
       this.codiceFiscale=codiceFiscale;
       this.nome=nome;
       this.cognome=cognome;
       this.dataDiNascita=dataDiNascita;
       this.numeroCartaDiCredito=numeroCartaDiCredito;
       this.username=username;
       this.password=password;
       this.dataDiScadenzaCartaDiCredito=dataDiScadenzaCartaDiCredito;
       this.cvv=cvv;
    }

    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    public void setCodiceFiscale(String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.nome = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.nome = password;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public Date getDataDiNascita() {
        return dataDiNascita;
    }

    public void setDataDiNascita(Date dataDiNascita) {
        this.dataDiNascita = dataDiNascita;
    }

    public String getNumeroCartaDiCredito() {
        return numeroCartaDiCredito;
    }

    public void setNumeroCartaDiCredito(Date dataDiNascita) {
        this.numeroCartaDiCredito = numeroCartaDiCredito;
    }

    public Date getdataDiScadenzaCartaDiCredito() {
        return dataDiScadenzaCartaDiCredito;
    }

    public void setdataDiScadenzaCartaDiCredito(Date dataDiScadenzaCartaDiCredito) {
        this.dataDiScadenzaCartaDiCredito = dataDiScadenzaCartaDiCredito;
    }

    public String getCvv() {
        return cvv;
    }

    public void setNumeroCartaDiCredito(String cvv) {
        this.cvv = cvv;
    }


}
