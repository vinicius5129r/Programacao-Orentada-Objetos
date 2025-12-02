package apresentacao.classes; // Define que esta classe pertence ao pacote 'apresentacao.classes'

// A classe Carro herda (extends) tudo o que a classe Veiculo tem
public class Carro extends Veiculo {
    
    // Atributo 'final': O número de portas é definido na fábrica e não muda mais
    private final int numeroPortas;
    
    // Atributo de estado: Variável booleana (true/false) para saber se a mala está aberta
    // private: Só a classe Carro pode mexer nisso diretamente
    private boolean portaMalasAberto; 

    // Construtor: O método que cria o objeto Carro na memória
    public Carro(String marca, String modelo, int ano, int numeroPortas) {
        // super(...): Chama o construtor da classe pai (Veiculo) para configurar marca, modelo e ano
        super(marca, modelo, ano);
        
        // this.numeroPortas: Guarda o número de portas recebido no atributo da classe
        this.numeroPortas = numeroPortas;
        
        // Inicialização: Todo carro novo começa com o porta-malas fechado (false)
        this.portaMalasAberto = false; 
    }

    // @Override: Indica que estamos substituindo o método ligar() original da classe Veiculo
    @Override
    public void ligar() {
        // --- PASSO 1: VERIFICAÇÃO DE SEGURANÇA ---
        
        // Verifica: "O porta-malas está aberto (true)?"
        if (this.portaMalasAberto == true) {
            // Se sim, avisa o usuário que vai fechar sozinho
            System.out.println("Aviso: O porta-malas estava aberto. Fechando automaticamente...");
            
            // Altera o estado do porta-malas para fechado (false)
            this.portaMalasAberto = false; 
            
            // Confirmação visual
            System.out.println("Porta-malas fechado.");
        }

        // --- PASSO 2: LIGAR O MOTOR ---
        
        // Verifica: "O carro está desligado (false)?"
        if (this.ligado == false) {
            // Muda o estado do motor para ligado (true)
            this.ligado = true;
            // Imprime mensagem de sucesso
            System.out.println("O " + this.modelo + " (Carro) deu a partida. Vrumm!");
        } else {
            // Se já estava ligado, avisa o usuário
            System.out.println("O " + this.modelo + " já estava ligado.");
        }
    }

    // Método para desligar o carro
    @Override
    public void desligar() {
        // Verifica: "O carro está ligado (true)?"
        if (this.ligado == true) {
            // Muda o estado do motor para desligado (false)
            this.ligado = false;
            // Imprime mensagem
            System.out.println("O " + this.modelo + " (Carro) foi desligado.");
        } else {
            // Se já estava desligado, avisa
            System.out.println("O " + this.modelo + " já estava desligado.");
        }
    }

    // --- MÉTODO ESPECÍFICO COM LÓGICA DE SEGURANÇA ---
    public void abrirPortaMalas() {
        // Verifica: "O carro está ligado (true)?"
        if (this.ligado == true) {
            // SE ESTIVER LIGADO: Não faz nada além de dar bronca.
            System.out.println("Não é possível abrir o porta-malas com o carro em movimento (ligado)!");
        } else {
            // SE ESTIVER DESLIGADO (else): Permite abrir.
            
            // Muda o estado do porta-malas para aberto (true)
            this.portaMalasAberto = true;
            // Avisa que abriu
            System.out.println("Porta-malas aberto.");
        }
    }

    // Método para exibir todas as informações do carro
    @Override
    public void exibirDetalhes() {
        // Chama o método da classe pai para mostrar Marca, Modelo e Ano
        super.exibirDetalhes();
        
        // Mostra o número de portas
        System.out.println("Tipo: Carro | Portas: " + this.numeroPortas);
        
        // Verifica o estado do porta-malas para imprimir o texto correto
        if (this.portaMalasAberto == true) {
            System.out.println("Porta-malas: [ABERTO]");
        } else {
            System.out.println("Porta-malas: [FECHADO]");
        }
    }

    // Getter: Permite que outras classes leiam o número de portas, mas não alterem
    public int getNumeroPortas() {
        return numeroPortas;
    }
}