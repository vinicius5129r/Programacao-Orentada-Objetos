package animal;
// herda de Animal
public class Pombo extends Ave {
    // atributo específico do Pombo
    private int cartasEnviadas = 10;
    // construtor
    public Pombo(String nome) {
        super(nome);
    }

    // método específico do Pombo
    public void ciscar() {
        System.out.printf("%s está ciscando\n", getNome());
    }
    // método para enviar cartas
    public void enviarCarta() {
        System.out.printf("%s enviou uma carta. Total de cartas enviadas: %d\n", getNome(), cartasEnviadas);
        cartasEnviadas++;
    }
    // Getter para cartasEnviadas
    public int getCartasEnviadas() {
        return cartasEnviadas;
    }
    
}
