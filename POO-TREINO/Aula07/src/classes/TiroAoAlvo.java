package classes;
    // Classe TiroAoAlvo que implementa a interface Jogo
public class TiroAoAlvo implements Jogo {
    // Implementação dos métodos da interface Jogo
    @Override
    public void fecharJogo() {
        System.out.println("Fechando o jogo de Tiro ao Alvo...");
    }

    @Override
    public void iniciarJogo() {
        System.out.println("Iniciando o jogo de Tiro ao Alvo...");
    }
    
}
