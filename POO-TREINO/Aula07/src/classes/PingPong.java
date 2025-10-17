package classes;
  // Classe PingPong que implementa a interface Jogo
public class PingPong implements Jogo {
    // Implementação dos métodos da interface Jogo
    @Override
    public void fecharJogo() {
        System.out.println("Fechando o jogo de Ping Pong...");
    }

    @Override
    public void iniciarJogo() {
        System.out.println("Iniciando o jogo de Ping Pong...");
        System.out.println("Jogo de Ping Pong");
    }
    
}
