package classes;
    //Herança
public class Arqueiro extends Personagem { 
    private String arma;
    //Construtor
    public Arqueiro(String nome) {
        super(nome); // Chama o construtor da superclasse (Personagem)
        this.setClasse("Arqueiro"); // Usando o método setClasse da superclasse
        setNivel(3); // Usando o método setNivel da superclasse
        this.arma = "Arco longo";
    }
    
    @Override
    public String toString() {
        String informacoes = super.toString(); // Chama o método toString da superclasse
        String informacoesAqueiro = String.format(" Arma: %s|\n", arma);
        return informacoes + informacoesAqueiro;
    }

    public void atacar() {
        System.out.printf("%s atacou com %s!", this.getNome(), arma);
    }
}
