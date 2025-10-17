package classes;

import javax.swing.JOptionPane;

public class Personagem {
    // Atributos da classe Personagem
    private String nome;
    private int nivel;
    private int forca;
    private int vida;
    private String classe;

    //Método Construtor
    public Personagem(String nome, String classe) {
        this.nome = nome; // Define o nome do personagem
        this.classe = classe; // Define a classe do personagem
        nivel = 10; // Nível inicial padrão
        vida = nivel * 100; // Vida inicial baseada no nível
        
        // Cálculo da força baseado na classe
        if (classe.equalsIgnoreCase("Guerreiro")) {
            forca = 15 * nivel; // Força baseada no nível
        } else if (classe.equalsIgnoreCase("Mago")) {
            forca = 8 * vida; // Força baseada na vida
        } else if (classe.equalsIgnoreCase("Arqueiro")) {
            forca = 12 * nivel; // Força baseada no nível
        } else {
            forca = 60; // Força padrão para classes desconhecidas
        }
    }
    // Método especial
    public void mostrarStatus() {
        // Exibe o status completo do personagem
        String status = String.format("Nome: %s \n Classe: %s \n Nível: %d \n Força: %d \n Vida: %d\n", nome, classe, nivel, forca, vida);
        JOptionPane.showMessageDialog(null, status, "Status do Personagem", JOptionPane.INFORMATION_MESSAGE);
    }
    // Getters e Setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getNivel() {
        return nivel;
    }
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    public int getForca() {
        return forca;
    }
    public void setForca(int forca) {
        this.forca = forca;
    }
    public int getVida() {
        return vida;
    }
    public void setVida(int vida) {
        this.vida = vida;
    }
    
}
