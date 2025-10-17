package animal;
// classe base (superclasse)
public class Animal {
    // atributo comum a todos os animais
    private String nome;

    // construtor
    public Animal(String nome) {
        this.nome = nome;
        
    }

    // métodos comuns a todos os animais
    public void comer(){
        // <nome do animal> está comendo
        System.out.printf("%s está comendo\n", nome);
    }

    public void beber() {
        // <nome do animal> está bebendo
        System.out.printf("%s está bebendo\n", nome);
    }

    // Getters and Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
