package model.domain;

import java.sql.Date;

public class Treni {
    private String matricola;
    private Date dataDiAcquisto;

    public Treni(String matricola, Date dataDiAcquisto){
        this.matricola=matricola;
        this.dataDiAcquisto=dataDiAcquisto;

    }
    public Date getdataDiAcquisto() {
        return dataDiAcquisto;
    }

    public void setdataDiAcquisto(Date dataDiAcquisto) {
        this.dataDiAcquisto = dataDiAcquisto;
    }


}
