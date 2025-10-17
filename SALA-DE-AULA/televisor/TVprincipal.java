package televisor;
import televisor.classes.*;

public class TVprincipal {
    public static void main(String[] args) {
        // Criando canais
        Canal canal1 = new Canal("Globo", 5);
        canal1.setCategoria("Entretenimento");
        canal1.setIdioma("Português");

        Canal canal2 = new Canal("ESPN", 10);
        canal2.setCategoria("Esportes");
        canal2.setIdioma("Português");

        Canal canal3 = new Canal("CNN", 20);
        canal3.setCategoria("Notícias");
        canal3.setIdioma("Inglês");

        // Criando TV
        TV tv = new TV();

        // Adicionando canais à TV
        tv.adicionarCanal(canal1);
        tv.adicionarCanal(canal2);
        tv.adicionarCanal(canal3);

        // Ligando a TV
        tv.ligar();

        // Trocando para o canal 10
        tv.trocarCanal(20);

        // Aumentando o volume
        tv.aumentarVolume();

        // Listando todos os canais
        new Botoes().listarCanais(tv);

    }

}
