package model.domain;

import java.sql.Date;

public class Lavoratore {
    private String codiceFiscale;
    private String nome;
    private String cognome;
    private Date dataDiNascita;
    //private String ruolo;
    private String username;
    private String password;

    public Lavoratore(String codiceFiscale,String nome,String cognome,Date dataDiNascita, String username, String password){
        this.codiceFiscale=codiceFiscale;
        this.nome=nome;
        this.cognome=cognome;
        this.dataDiNascita=dataDiNascita;
       // this.ruolo=ruolo;
        this.username=username;
        this.password=password;
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

    /*
    public String getRuolo() {
        return ruolo;
    }

    public void setRuolo(Date dataDiNascita) {
        this.ruolo = ruolo;
    }

     */

}
