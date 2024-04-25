package model.domain;

public class Vagone {
    private int id;
    private String modello;
    private int classe;
    private String marca;
    private int maxPasseggeri;

    public Vagone(int id, String modello, int classe, String marca, int maxPasseggeri){
        this.id=id;
        this.modello=modello;
        this.classe=classe;
        this.marca=marca;
        this.maxPasseggeri=maxPasseggeri;
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

    public int getClasse(){
        return classe;
    }
    public void setClasse(int classe){
        this.classe=classe;
    }

    public int getMaxPasseggeri(){
        return maxPasseggeri;
    }
    public void setMaxPasseggeri(int maxPasseggeri){
        this.maxPasseggeri=maxPasseggeri;
    }

}
