package apresentacao; // Pacote principal

// Importando as classes
import apresentacao.classes.Carro;
import apresentacao.classes.Moto;
import apresentacao.classes.Veiculo;

// Importando ferramentas de lista do Java
import java.util.ArrayList;
import java.util.List;

public class Demonstracao {

    // Método main: O ponto de partida do programa
    public static void main(String[] args) {

        // Criando um objeto Carro real
        Carro meuCarro = new Carro("Ford", "Focus", 2020, 4);

        // Criando um objeto Moto real
        Moto minhaMoto = new Moto("Honda", "CBR 600", 2022, 600);

        // --- POLIMORFISMO NA LISTA ---
        // Criamos uma lista chamada 'garagem'.
        // Ela aceita qualquer coisa que seja do tipo 'Veiculo'.
        List<Veiculo> garagem = new ArrayList<>();

        // Adicionamos o carro e a moto na mesma lista.
        // Isso funciona porque ambos "são" Veículos.
        garagem.add(meuCarro);
        garagem.add(minhaMoto);

        System.out.println("--- Iniciando demonstração ---");

        // Loop 'foreach': "Para cada 'veiculo' dentro da 'garagem'..."
        for (Veiculo veiculo : garagem) {
            System.out.println("--------------------------------");

            // Aqui acontece a mágica do Polimorfismo:
            // O Java sabe se o objeto é Carro ou Moto e chama o método certo.
            // Vai mostrar as portas se for carro, ou cilindradas se for moto.
            veiculo.exibirDetalhes();
            System.out.println("--------------------------------");

            // Chama o ligar() específico (Vrumm ou Randandandan)
             veiculo.ligar();

            // Ações específicas dependendo do tipo do veículo
            // Usamos 'instanceof' para verificar o tipo real do objeto
            // e fazemos um cast para chamar métodos específicos.
            // o cast é como dizer "Ei Java, eu sei que isso é uma Moto/Carro!"
            if (veiculo instanceof Moto) {
                ((Moto) veiculo).empinar(); // Se for moto, empina!
            } else if (veiculo instanceof Carro) {
                ((Carro) veiculo).abrirPortaMalas(); // Se for carro, abre o porta-malas!
            }

            System.out.println("--------------------------------");
            veiculo.desligar(); // Desliga o veículo
            System.out.println("--------------------------------");
            if (veiculo instanceof Moto) {
                ((Moto) veiculo).empinar(); // Tenta empinar de novo (deve dar bronca)
            } else if (veiculo instanceof Carro) {
                ((Carro) veiculo).abrirPortaMalas(); // Tenta abrir o porta-malas de novo
            }
        }

        System.out.println("--------------------------------");
        System.out.println("--- Fim da demonstração ---");
    }
}