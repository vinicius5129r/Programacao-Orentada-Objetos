package apresentacao;
import apresentacao.classes.Carro;
import apresentacao.classes.Moto;
import apresentacao.classes.Veiculos;

import java.util.ArrayList; // Importa a classe ArrayList 
import java.util.List; // Importa a interface List 
public class Desmonstracao {
    public static void main(String[] args) {
         // Criando instâncias (objetos) das subclasses
        // Veiculo meuCarro = new Carro(...); // Também funcionaria (Polimorfismo)
        Carro meuCarro = new Carro("Ford", "Focus", 2020, 4);
        Moto minhaMoto = new Moto("Honda", "CBR 600", 2022, 600);

        // --- Demonstração do POLIMORFISMO ---
        // A lista é do tipo 'Veiculo' (superclasse), mas pode
        // armazenar qualquer objeto que SEJA UM 'Veiculo' (subclasses).
        List<Veiculos> garagem = new ArrayList<>();
        garagem.add(meuCarro);
        garagem.add(minhaMoto);

        System.out.println("--- 🏁 Iniciando demonstração ---");

        // O loop trata todos os objetos da mesma forma (como Veiculo)
        for (Veiculos veiculo : garagem) {
            System.out.println("--------------------------------");
            veiculo.exibirDetalhes();
            veiculo.ligar();
            veiculo.exibirDetalhes();
        }
        
        System.out.println("--------------------------------");
        System.out.println("--- 🏁 Fim da demonstração ---");
    }
}
