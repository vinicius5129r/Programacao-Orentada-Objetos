package animal;
// herda de Animal
public class Dragao extends Ave {
    // construtor
    public Dragao(String nome) {
        super(nome);
    }

    public void soltarFogo() {
        System.out.printf("%s está soltando fogo!\n", getNome());
    }
    
}
