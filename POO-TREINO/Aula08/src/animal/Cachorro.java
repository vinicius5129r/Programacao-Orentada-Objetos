package animal;
// herda de Animal
public class Cachorro extends Animal {
    private int ossosEnterrados = 50;
    // construtor
    public Cachorro( String nome) {
        super(nome); // chama o construtor da superclasse (Animal)
    }
    // métodos específicos do Cachorro
    public void latir() {
        System.out.printf("%s está latindo\n", getNome());
    }
    // método para enterrar ossos
    public void enterrarOsso() {
        System.out.printf("%s está enterrando um osso\n", getNome());
        ossosEnterrados++;
    }
    // Getter para ossosEnterrados
    public int getOssosEnterrados() {
        return ossosEnterrados;
    }
}
