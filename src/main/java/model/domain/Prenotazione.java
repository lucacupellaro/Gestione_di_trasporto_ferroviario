package model.domain;

import java.util.Date;

public class Prenotazione {

    private String codicePrenotazione;
    private String postoTreno;

    private Date data;


    public Prenotazione(String codicePrenotazione, String postoTreno,Date data){
        this.data=data;
        this.codicePrenotazione=codicePrenotazione;
        this.postoTreno=postoTreno;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getCodicePrenotazione() {
        return codicePrenotazione;
    }

    public void setCodicePrenotazione(String codicePrenotazione) {
        this.codicePrenotazione = codicePrenotazione;
    }

    public String getPostoTreno() {
        return postoTreno;
    }

    public void setCodicePostoTreno(String postoTreno) {
        this.postoTreno = postoTreno;
    }
}
