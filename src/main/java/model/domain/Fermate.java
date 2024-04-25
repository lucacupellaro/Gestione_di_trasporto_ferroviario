package model.domain;

import java.sql.Time;
import java.time.LocalTime;
import java.util.Date;

public class Fermate {

    private String citta;
    private String stazione;
    private String provincia;

    private LocalTime orarioPartenza;

    private LocalTime orarioArrivo;

    public Fermate(String citta, String stazione, String provincia,LocalTime orarioPartenza,LocalTime orarioArrivo){
        this.citta=citta;
        this.stazione=stazione;
        this.provincia=provincia;
        this.orarioPartenza=orarioPartenza;
        this.orarioArrivo=orarioArrivo;

    }

    public String getCitta(){
        return citta;
    }

    public void setCitta(String citta){
        this.citta=citta;
    }
    public void setStazione(String citta){
        this.stazione=stazione;
    }

    public String getStazione(){
        return stazione;
    }

    public void setProvincia(String provincia){
        this.provincia=provincia;
    }

    public String getProvincia(){
        return provincia;
    }

    public void setOrarioPartenza(LocalTime orarioPartenza){
        this.orarioPartenza=orarioPartenza;
    }

    public LocalTime getOrarioPartenza(){
        return orarioPartenza;
    }

    public void setOrarioArrivo(LocalTime orarioArrivo){
        this.orarioArrivo=orarioArrivo;
    }

    public LocalTime getOrarioArrivo(){
        return orarioArrivo;
    }
}

