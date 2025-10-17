public class App {
    public static void main(String[] args) throws Exception {
        //Declarando um objeto do tipo celular = Instanciando um objeto
        Celular celularA = new Celular();
        celularA.nome = "Iphone 12";
        celularA.tamanhoTela = 6.1f;
        celularA.espacoArmazenamento = 256;
        celularA.sistemaOperacional = "IOS";

        Celular celularB = new Celular();
        celularB.nome = "Galaxy Note 20 Ultra";
        celularB.tamanhoTela = 6.9f;
        celularB.espacoArmazenamento = 256;
        celularB.sistemaOperacional = "Android";

        Celular celularC = new Celular();
        celularC.nome = "Xaomi Mi 11 PRO";
        celularC.tamanhoTela = 6.8f;
        celularC.espacoArmazenamento = 128;
        celularC.sistemaOperacional = "Android";

        System.out.format("Celular %s com tela de %.1f, com %dGB e SO é %s\n", celularA.nome, celularA.tamanhoTela, celularA.espacoArmazenamento, celularA.sistemaOperacional);
        System.out.format("Celular %s com tela de %.1f, com %dGB e SO é %s\n", celularB.nome, celularB.tamanhoTela, celularB.espacoArmazenamento, celularB.sistemaOperacional);
        System.out.format("Celular %s com tela de %.1f, com %dGB e SO é %s", celularC.nome, celularC.tamanhoTela, celularC.espacoArmazenamento, celularC.sistemaOperacional);
    }
}
