package classes;
    // Classe Xadrez que implementa a interface Jogo
public class Xadrez implements Jogo {
    // Implementação dos métodos da interface Jogo
    @Override
    public void fecharJogo() {
        System.out.println("Fechando o jogo de Xadrez...");
    }

    @Override
    public void iniciarJogo() {
        System.out.println("Iniciando o jogo de Xadrez...");
    }
    
}
