package animal;
// herda de Animal
public class Gato extends Animal {
    // construtor
    public Gato( String nome) {
        super(nome);
    }
    // métodos específicos do Gato
    public void miar() {
        System.out.printf("%s está miando\n", getNome());
    }

    public void arranhar() {
        System.out.printf("%s está arranhando\n", getNome());
    }
}
