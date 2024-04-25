package model.domain;

public class Locomotrici {

    private int id;
    private String modello;
    private String marca;


    public Locomotrici(int id, String modello, String marca){
        this.id=id;
        this.modello=modello;
        this.marca=marca;
    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }

    public String getModello(){
        return modello;
    }
    public void setModello(String modello){
        this.modello=modello;
    }

    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca=marca;
    }


}
