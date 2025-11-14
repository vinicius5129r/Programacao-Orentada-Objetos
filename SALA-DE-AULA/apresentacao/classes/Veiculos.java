package apresentacao.classes;

public abstract class Veiculos {
    protected String modelo;
    protected String marca; 
    protected int ano;
    protected String cor;
    protected boolean ligado;

    public Veiculos(String modelo, String marca, int ano, String cor, boolean ligado) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.cor = cor;
        this.ligado = ligado;
    }

    // Métodos abstratos
    public abstract void ligar();
    public abstract void desligar();

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    
}