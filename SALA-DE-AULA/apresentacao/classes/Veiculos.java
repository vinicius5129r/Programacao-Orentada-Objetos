package apresentacao.classes;
/**
 * 1. ABSTRAÇÃO / 3. ENCAPSULAMENTO
 * * Superclasse abstrata 'Veiculo'.
 * Define o que todo Veiculo DEVE ter (ligar, desligar)
 * e o que ele JÁ tem (marca, modelo, exibirDetalhes).
 * * Atributos são 'protected' para encapsular, mas permitir
 * acesso às classes filhas.
 */
 public abstract class Veiculos {
    // Atributos encapsulados comuns a todos os Veiculos
    // protected permite acesso às subclasses e classes 
    // do mesmo pacote diferente de private que não permite acesso 
    //nenhum fora da classe mesma
    protected String marca;
    protected String modelo;
    protected int ano;
    protected boolean ligado;

    // Construtor que as classes filhas usarão
    public Veiculos(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.ligado = false;
    }

    // --- ABSTRAÇÃO ---
    // Métodos abstratos (o contrato) que as subclasses devem implementar
    public abstract void ligar();
    public abstract void desligar();

    // --- HERANÇA ---
    // Método concreto que será herdado
    public void exibirDetalhes() {
        System.out.println("Marca: " + this.marca + ", Modelo: " + this.modelo + ", Ano: " + this.ano);
        System.out.println("Estado: " + (this.ligado ? "Ligado" : "Desligado"));
    }
}