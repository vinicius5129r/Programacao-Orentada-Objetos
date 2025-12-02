package apresentacao.classes; // Pacote

// 'extends Veiculo': HERANÇA.
// O Carro ganha tudo o que Veiculo tem (marca, modelo, etc).
public class Carro extends Veiculo {
    
    // Atributo exclusivo de Carro.
    // 'private': ENCAPSULAMENTO (só a classe Carro mexe aqui).
    // 'final': O valor não muda depois que o carro é criado.
    private final int numeroPortas;

    // Construtor do Carro
    public Carro(String marca, String modelo, int ano, int numeroPortas) {
        // 'super(...)': Chama o construtor da classe pai (Veiculo)
        // para configurar marca, modelo e ano.
        super(marca, modelo, ano);
        
        // Configura o atributo que é só do Carro
        this.numeroPortas = numeroPortas;
    }

    // @Override: POLIMORFISMO.
    // Estamos reescrevendo o método ligar() original para funcionar do jeito do Carro.
    @Override
    public void ligar() {
        if (this.ligado == false) { // Se não estiver ligado...
            this.ligado = true;     // ...muda para ligado
            System.out.println("O " + this.modelo + " (Carro) deu a partida. Vrumm!");
        } else {
            System.out.println("O " + this.modelo + " já estava ligado.");
        }
    }

    // Reescrevendo o desligar()
    @Override
    public void desligar() {
        if (this.ligado == true) { // Se estiver ligado...
            this.ligado = false;   // ...muda para desligado
            System.out.println("O " + this.modelo + " (Carro) foi desligado.");
        } else {
            System.out.println("O " + this.modelo + " já estava desligado.");
        }
    }

    // @Override no exibirDetalhes:
    // Queremos mostrar os dados do Veiculo + o número de portas.
    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes(); // Chama o método do pai (mostra marca, modelo, estado...)
        System.out.println("Tipo: Carro | Portas: " + this.numeroPortas); // Completa com a info do filho
    }

    // Método exclusivo do Carro (Moto não tem isso)
    public void abrirPortaMalas() {
        System.out.println("Porta-malas aberto.");
    }

    // Getter para ler o atributo privado
    public int getNumeroPortas() {
        return numeroPortas;
    }
}