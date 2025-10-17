public class FestaVip {
	private int quantidadeCafe = 30;
	private int quantidadeSalgado = 50;

    void entrar() {
        beberCafe();
        comerSalgado();
    }

	// <modificador> <retorno-método> <nome-método>
    private void beberCafe() {
        quantidadeCafe--;
        System.out.println("Bebeu 1 xícara de café.");
    }

    public void comerSalgado() {
        quantidadeSalgado--;
        System.out.println("Comeu 5 salgado.");
    }
}
