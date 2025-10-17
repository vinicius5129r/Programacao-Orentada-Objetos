    // Pacote principal
import classes.*;
    // Classe principal
public class App {
    public static void main(String[] args) throws Exception {
        // encapsulamento --> inteface
        VideioGame v1 = new VideioGame();
        v1.Ligar();
        v1.Jogar(new PingPong());
        v1.Fechar();

    }
}
