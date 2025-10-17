import animal.*;

/* O que herança?;
 *  Herança é um mecanismo que permite que uma classe adquira as 
 * propriedades (atributos) e comportamentos (métodos) de outra classe.
 */
public class App {
    public static void main(String[] args) throws Exception {
        // criando objetos das subclasses
        Cachorro dog = new Cachorro("Rex");
        dog.latir();
        dog.beber();
        dog.comer();

        Gato cat = new Gato("Mingau");
        cat.miar();
        cat.beber();
        cat.comer();

        Dragao dragon = new Dragao("Smaug");
        dragon.voar();
        dragon.soltarFogo();
        dragon.beber();

        Pombo pigeon = new Pombo("Pombo");
        pigeon.voar();
        pigeon.beber();
        pigeon.comer();
    }
}
