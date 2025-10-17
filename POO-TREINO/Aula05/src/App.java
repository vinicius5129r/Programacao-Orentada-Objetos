import classes.Conta;
import classes.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        Pessoa pessoa1 = new Pessoa();
        //Modificar → Acessar os métodos set
        //pegar → Acessar os métodos get

        //Modificar os atributos
        pessoa1.setNome("Vinicius");
        pessoa1.setIdade(19);
        pessoa1.setAltura(1.75);

        //Acessar os métodos get
        /*System.out.println(pessoa1.getNome());
        System.out.println(pessoa1.getIdade());
        System.out.println(pessoa1.getAltura()); */

        Conta conta1 = new Conta();
        System.out.println(conta1.getSaldo());
        conta1.depositar(100);
        System.out.println(conta1.getSaldo());
    }
}
