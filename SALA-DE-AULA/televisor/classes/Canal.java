package televisor.classes;


public class Canal {
    String nome;
    int numero;
    String categoria;
    String idioma;
    boolean ativo;

    // Construtor
    public Canal(String nome, int numero) {
    this.nome = nome;
    this.numero = numero;
    this.categoria = "";
    this.idioma = "";
    this.ativo = true;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
    return String.format("Canal %s - %d\ncategoria = %s idioma = %s, ativo = %b", nome, numero, categoria, idioma, ativo);
    }
    
}
