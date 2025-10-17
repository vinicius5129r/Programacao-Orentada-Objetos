public class Artista {  
    private String nome;
    private String genero;

    // Construto
    public Artista(String nome, String genero) {
        this.nome = nome;
        this.genero = genero;
    }

    // Métodos Getters
    public String getNome() {
        return this.nome;
    }

    public String getGenero() {
        return this.genero;
    }

    // Métodos Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    // Métodos próprios
    public void exibirFicha() {
        System.out.println("--- <Ficha do Artista> ---");
        System.out.println("Nome: " + this.nome);
        System.out.println("Gênero: " + this.genero);
        System.out.println("------------------------");
    }
}
