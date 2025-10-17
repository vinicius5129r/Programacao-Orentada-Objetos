public class App {
    public static void main(String[] args) throws Exception {
        //private → Só pode ser acessado dentro da própria classe
        //public → Pode ser acessado de qualquer lugar
        //protected → Pode ser acessado na classe e nas subclasses (mesmo de outros pacotes)
        //default → Só pode ser acessado dentro do mesmo pacote (sem modificador)
        FestaVip festa = new FestaVip();
        festa.entrar();
    }
}
