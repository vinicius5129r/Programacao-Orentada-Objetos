package apresentacao.classes;
/**
 *  HERANÇA /  POLIMORFISMO
 * * Subclasse 'Carro' que 'extends' (herda de) Veiculo.
 */
public class Carro extends Veiculos {
    
    // Atributo encapsulado específico de Carro
    // final indica que o atributo não pode ser alterado após a inicialização, como assim:
    // significa que o valor de 'numeroPortas' será constante para cada instância de Carro
    // private torna o atributo inacessível diretamente fora da classe Carro
    private final int numeroPortas;

    public Carro(String marca, String modelo, int ano, int numeroPortas) {
        // 2. HERANÇA: Chama o construtor da superclasse (Veiculo)
        super(marca, modelo, ano);
        this.numeroPortas = numeroPortas;
    }

    // POLIMORFISMO: Implementação específica de ligar()
    @Override
    public void ligar() {
        if (!this.ligado) {
            this.ligado = true;
            System.out.println("O " + this.modelo + " (Carro) deu a partida. Vrumm!");
        } else {
            System.out.println("O " + this.modelo + " já estava ligado.");
        }
    }

    // POLIMORFISMO: Implementação específica de desligar() 
    // override indica que estamos sobrescrevendo o método da superclasse
    @Override
    public void desligar() {
        if (this.ligado) {
            this.ligado = false;
            System.out.println("O " + this.modelo + " (Carro) foi desligado.");
        } else {
            System.out.println("O " + this.modelo + " já estava desligado.");
        }
    }

    // Método específico do Carro 
    public void abrirPortaMalas() {
        System.out.println("Porta-malas aberto.");
    }

    // Getter para numeroPortas (Encapsulamento)
    // O Getter permite acesso controlado ao atributo privado
    public int getNumeroPortas() {
        return numeroPortas;
    }
}

