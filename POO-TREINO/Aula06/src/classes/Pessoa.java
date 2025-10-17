package classes;

public class Pessoa {
    // Atributos
    private String nome;
    private int idade;
    private float altura;

    // Construtor
    public Pessoa(String nome, int idade, float altura) {
        System.out.println("Objeto pessoa criado!");
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        imprimirDados();
    }

    private void imprimirDados() {
        System.out.format("Nome: %s\nIdade: %d\nAltura: %.2f\n", this.nome, this.idade, this.altura);
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    } 
}
