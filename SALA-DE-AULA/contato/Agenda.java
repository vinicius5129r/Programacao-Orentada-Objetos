package contato;

import java.util.ArrayList;

public class Agenda {
    private ArrayList<contato> contatos = new ArrayList<>();

    public void armazenarContato(contato contato){
        this.contatos.add(contato);
    }

    public void removerContato(contato contato){
        contato.remover(contato);
    }

    public int encontrarContato(String nome){
        for (int i = 0; i < contatos.size(); i++){
            //.get(i) pega o objeto na posição i;
            //.get_nome() função que retorna o nome do objeto;
            //.equals(nome) compara o nome do objeto com o nome passado como parâmetro;
            if (contatos.get(i).get_nome().equalsIgnoreCase(nome)) {
                return i;
            }
        }
        return -1;
    }
    public void imprimirContatos(){
        System.out.println("======ÍNICIO======");
        for (contato contato : contatos){
            contato.imprimeIformacoes(); 
            System.out.println();   
        }
        System.out.println("======FIM======");
    }

    public void imprimirContato(int posicao){
        this.contatos.get(posicao).imprimeIformacoes();
    }
}
