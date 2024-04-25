package model.domain;

public enum Role {
    ACQUIRENTE(1),
    GESTORI_DEL_SERVIZIO(2),
    LAVORATORI(3);

    private final int id;

    private Role(int id){
        this.id = id;
    }

    public static Role fromInt(int id){

        for(Role type : values()){
            if (type.getId() == id){
                return type;
            }
        }

        return null;
    }

    public int getId(){
        return id;
    }
}
