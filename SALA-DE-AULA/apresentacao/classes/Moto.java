package apresentacao.classes; // Pacote

// 'extends Veiculo': A Moto também é um Veículo.
public class Moto extends Veiculo {

    // Atributo exclusivo de Moto (cilindradas)
    private final int cilindradas;

    // Construtor da Moto
    public Moto(String marca, String modelo, int ano, int cilindradas) {
        // Repassa os dados comuns para a classe pai (Veiculo)
        super(marca, modelo, ano);
        // Guarda o dado específico da moto
        this.cilindradas = cilindradas;
    }

    // Implementação específica de como uma Moto liga
    @Override
    public void ligar() {
        if (this.ligado == false) {
            this.ligado = true;
            System.out.println("A " + this.modelo + " (Moto) ligou. Randandandan!");
        } else {
            System.out.println("A " + this.modelo + " já estava ligada.");
        }
    }

    // Implementação específica de como uma Moto desliga
    @Override
    public void desligar() {
        if (this.ligado == true) {
            this.ligado = false;
            System.out.println("A " + this.modelo + " (Moto) foi desligada.");
        } else {
            System.out.println("A " + this.modelo + " já estava desligado.");
        }
    }

    // Sobrescreve para mostrar as cilindradas além do básico
    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes(); // Mostra o básico (marca, modelo...)
        System.out.println("Tipo: Moto | Cilindradas: " + this.cilindradas + "cc");
    }

    // Método exclusivo da Moto
    public void empinar() {
        if (this.ligado == true) {
            System.out.println("A " + this.modelo + " está empinando! Woohoo!");
        } else {
            System.out.println("Não dá para empinar com a moto desligada.");
        }
    }
}