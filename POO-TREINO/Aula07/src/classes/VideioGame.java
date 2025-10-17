package classes;

public class VideioGame {
    // Atributo para armazenar o jogo atual
    private Jogo jogo; // Atributo para armazenar o jogo atual
    private boolean ligado; // Atributo para indicar se o videogame está ligado
    // Método para ligar o videogame
    public void Ligar() {
        this.ligado = true;
        System.out.println("Ligando o Videogame...");
    }
    // Método para iniciar e jogar um jogo
    public void Jogar(Jogo jogo) {
        if (ligado == true) { // Verifica se o videogame está ligado
            this.jogo = jogo;
            jogo.iniciarJogo();
            System.out.println("Iniciando o jogo...");
        } else {
            System.out.println("O videogame está desligado. Ligue-o antes de jogar.");
        }
        
    }
    // Método para fechar o jogo e desligar o videogame
    public void Fechar() { 
        if (ligado == true) { // Verifica se o videogame está ligado
        jogo.fecharJogo();
        System.out.println("Desligando o Videogame...");
        boolean TemJogoRodando = jogo != null; // Verifica se há um jogo rodando
        if (TemJogoRodando) {// Verifica se há um jogo rodando
            jogo.fecharJogo (); // Fecha o jogo
            jogo = null; // Remove a referência ao jogo
        } else { // Se não houver jogo rodando
            System.out.println("Nenhum jogo está rodando.");
        }
        } else {
            System.out.println("O videogame está desligado. Ligue-o antes de jogar.");
        }
    }
}
