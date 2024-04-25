package model.domain;

import java.util.Date;

public class StoricoManutenzione {
    private String manutenzione;

    private Date data;

    public StoricoManutenzione(String manutenzione, Date data){
        this.manutenzione=manutenzione;
        this.data=data;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getManutenzione() {
        return manutenzione;
    }

    public void setManutenzione(String manutenzione) {
        this.manutenzione = manutenzione;
    }

}
