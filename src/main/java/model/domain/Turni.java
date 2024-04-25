package model.domain;

import java.time.LocalTime;
import java.util.Date;

public class Turni {
    private LocalTime orarioInizio;

    private LocalTime orarioFine;

    private Date data;

    public Turni(LocalTime orarioInizio,LocalTime orarioFine,Date data){
        this.data=data;
        this.orarioInizio=orarioInizio;
        this.orarioFine=orarioFine;

    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
    public LocalTime getOrarioInizio() {
        return orarioInizio;
    }

    public void setOrarioInizio(LocalTime orarioInizio) {
        this.orarioInizio = orarioInizio;
    }

    public LocalTime getOrarioFine() {
        return orarioFine;
    }

    public void setOrarioFine(LocalTime orarioFine) {
        this.orarioFine = orarioFine;
    }






}
