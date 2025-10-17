import javax.swing.JOptionPane;

import classes.Personagem;

public class App {
    public static void main(String[] args) throws Exception {
        // Criando personagens
        String nome = JOptionPane.showInputDialog(null, "Digite o nome do personagem: ");
        String classe = JOptionPane.showInputDialog(null, "Digite a classe do personagem (Guerreiro, Mago, Arqueiro): ");
        // Mostrando o status do personagem
        Personagem cla = new Personagem(nome, classe);
        cla.mostrarStatus();

    }
}
