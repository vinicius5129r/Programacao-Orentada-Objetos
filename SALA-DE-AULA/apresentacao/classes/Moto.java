package apresentacao.classes;

/**
 * HERANÇA / POLIMORFISMO
 * * Subclasse 'Moto' que 'extends' (herda de) Veiculo.
 */
public class Moto extends Veiculos {

    // Atributo encapsulado específico de Moto
    private final int cilindradas;

    public Moto(String marca, String modelo, int ano, int cilindradas) {
        // HERANÇA: Chama o construtor da superclasse (Veiculo)
        super(marca, modelo, ano);
        this.cilindradas = cilindradas;
    }

    // POLIMORFISMO: Implementação específica de ligar()
    @Override
    public void ligar() {
        if (!this.ligado) {
            this.ligado = true;
            System.out.println("A " + this.modelo + " (Moto) ligou. Randandandan!");
        } else {
            System.out.println("A " + this.modelo + " já estava ligada.");
        }
    }

    // POLIMORFISMO: Implementação específica de desligar()
    @Override
    public void desligar() {
        if (this.ligado) {
            this.ligado = false;
            System.out.println("A " + this.modelo + " (Moto) foi desligada.");
        } else {
            System.out.println("A " + this.modelo + " já estava desligado.");
        }
    }

    // Método específico da Moto
    public void empinar() {
        if (this.ligado) {
            System.out.println("A " + this.modelo + " de " + this.cilindradas + "cc está empinando! 🏍️");
        } else {
            System.out.println("Não dá para empinar com a moto desligada.");
        }
    }
}

