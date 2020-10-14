package model;

public class Fita {
    
    static void add(Aluguel aluguel) {
        throw new UnsupportedOperationException("");
    }
    
    private String titulo;
    private String codigoDePreco;
    //       fita
    
    //Construtot

    public Fita(String titulo, String codigoDePreco) {
        this.titulo = titulo;
        this.codigoDePreco = codigoDePreco;
    }
    
    
    
    //Get & Set

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCodigoDePreco() {
        return codigoDePreco;
    }

    public void setCodigoDePreco(String codigoDePreco) {
        this.codigoDePreco = codigoDePreco;
    }
    
}
