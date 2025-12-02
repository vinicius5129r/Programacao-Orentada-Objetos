package apresentacao.classes; // Define em qual pacote (pasta) esta classe está

/**
 * Classe abstrata 'Veiculo'.
 * 'abstract' significa que não podemos criar um 'new Veiculo()' direto.
 * Ela serve apenas de modelo para Carro e Moto.
 */
public abstract class Veiculo { 

    // Atributos 'protected':
    // Permitem que as classes filhas (Carro, Moto) acessem essas variáveis diretamente.
    // Se fosse 'private', as filhas não conseguiriam ver.
    protected String marca;
    protected String modelo;
    protected int ano;
    protected boolean ligado;

    // Construtor: Método chamado automaticamente quando criamos um objeto (new).
    // Ele recebe os dados iniciais e preenche os atributos.
    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;   // Guarda a marca recebida no atributo da classe
        this.modelo = modelo; // Guarda o modelo recebido
        this.ano = ano;       // Guarda o ano recebido
        this.ligado = false;  // Todo veículo começa desligado por padrão
    }

    // Métodos abstratos:
    // Não têm corpo (código) aqui. Eles são um "contrato".
    // Obrigam Carro e Moto a criarem suas próprias versões de ligar e desligar.
    public abstract void ligar();
    public abstract void desligar();

    // Método concreto (com código):
    // Este método já funciona e será herdado pelas filhas.
    public void exibirDetalhes() {
        // Imprime os dados comuns a todos os veículos
        System.out.println("Marca: " + this.marca + " | Modelo: " + this.modelo + " | Ano: " + this.ano);
        
        // Lógica simples para mostrar se está ligado ou desligado
        if (this.ligado == true) {
            System.out.println("Estado: Ligado");
        } else {
            System.out.println("Estado: Desligado");
        }
    }
}