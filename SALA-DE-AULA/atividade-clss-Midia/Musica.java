import javax.print.attribute.standard.Media;

public class Musica extends Media{
    private String titulo;
    private String album;

    // Construtor
    public Musica(String titulo, String legenda, int duracao, String album) {
        super(duracao);
        this.titulo = titulo;
        this.album = album;
    }

    // Métodos Getters
    public String getTitulo() {
        return this.titulo;
    }

    public String getAlbum() {
        return this.album;
    }

    // Métodos Setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    //Métodos Próprios
    public void exibirDetalhes() {
        System.out.println("--- Detalhes da Música ---");
        System.out.println("Título: " + this.titulo);
        System.out.println("Álbum: " + this.album);
        System.out.println("--------------------------");
    }

    public void tocar() {
        System.out.println("Tocando agora: '" + this.titulo + "'");
    }
}