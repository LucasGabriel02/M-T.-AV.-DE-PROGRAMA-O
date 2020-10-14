package model;

public class Aluguel {
    
    private String fita;
    private int diasAlugada;
    
    //Construtor
    public Aluguel(String fita, int diasAlugada) {
        this.fita = fita;
        this.diasAlugada = diasAlugada;
    }

    public Aluguel(String string) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    //Get & Set
    public String getFita() {
        return fita;
    }

    public void setFita(String Fita) {
        this.fita = Fita;
    }

    public int getDiasAlugada() {
        return diasAlugada;
    }

    public void setDiasAlugada(int diasAlugada) {
        this.diasAlugada = diasAlugada;
    }

    int getdiasAlugada() {
        throw new UnsupportedOperationException(""); 
    }
    
}
