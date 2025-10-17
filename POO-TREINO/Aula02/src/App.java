public class App {
    public static void main(String[] args) throws Exception {
        Personagem heroi = new Personagem();
        heroi.nome = "Hécules";
        heroi.nivel = 2;
        heroi.forca = 16;

        heroi.mostrarStatus();
        heroi.atacar("Largatixa", "Movimento Felino");
    }
}
