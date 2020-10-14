package model;

public class Tipo {
    
    private String normal;
    private String lancamento;
    private String infantil;

    //Construtor
    public Tipo(String normal, String lancamento, String infantil) {
        this.normal = normal;
        this.lancamento = lancamento;
        this.infantil = infantil;
    }
    
    //Get & Set

    public String getNormal() {
        return normal;
    }

    public void setNormal(String normal) {
        this.normal = normal;
    }

    public String getLancamento() {
        return lancamento;
    }

    public void setLancamento(String lancamento) {
        this.lancamento = lancamento;
    }

    public String getInfantil() {
        return infantil;
    }

    public void setInfantil(String infantil) {
        this.infantil = infantil;
    }
    
}
