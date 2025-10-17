package animal;

public class Ave extends Animal {
    // construtor
    public Ave(String nome) {
        super(nome);
    }

    // métodos específicos da Ave
    public void voar() {
        System.out.printf("%s está voando\n", getNome());
    }       
}
