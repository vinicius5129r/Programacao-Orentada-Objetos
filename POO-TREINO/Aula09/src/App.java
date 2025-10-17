import classes.*;

public class App {
    public static void main(String[] args) throws Exception {
        /*Classe Object + toString + implicito e exemplo
         * Sobreescrita de método (+ exemplo)
         * Métodos super
         * Modificadores sem acesso
         */
        Personagem p1 = new Personagem("Aragorn");
        System.out.println(p1);
        p1.atacar();

        Arqueiro a1 = new Arqueiro("Legolas");
        System.out.println(a1);
        a1.atacar();
    }
}
