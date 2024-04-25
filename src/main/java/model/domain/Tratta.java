package model.domain;

public class Tratta {

    private int id;
    private String capolinePartenza;
    private String capolineArrivo;

    public Tratta(int id, String capolinePartenza, String capolineArrivo){
        this.id=id;
        this.capolinePartenza=capolinePartenza;
        this.capolineArrivo=capolineArrivo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getcapolinePartenza() {
        return capolinePartenza;
    }

    public void setcapolinePartenza(String capolinePartenza) {
        this.capolinePartenza = capolinePartenza;
    }


    public String getcapolineArrivo() {
        return capolineArrivo;
    }

    public void setcapolineArrivo(String capolineArrivo) {
        this.capolineArrivo = capolineArrivo;
    }


}
