package atividade;

import java.util.ArrayList;

import contato.contato;

public class AgendaV2 {
    private ArrayList<AtividadeAgenda> Contato = new ArrayList<>();

    public void armazenarContato(AtividadeAgenda contato) {
        Contato.add(contato);
    }

    public void removerContato(contato contato){
        contato.remover(contato);
    }

    public int encontrarContato(String nome){
        for (int i = 0; i < contato.size(); i++){
            //.get(i) pega o objeto na posição i;
            //.get_nome() função que retorna o nome do objeto;
            //.equals(nome) compara o nome do objeto com o nome passado como parâmetro;
            if (contato.get(i).get_nome().equalsIgnoreCase(nome)) {
                return i;
            }
        }
        return -1;
    }
    public void imprimirContatos(){
        System.out.println("======ÍNICIO======");
        for (AtividadeAgenda contato : Contato){
            contato.imprimeIformacoes(); 
            System.out.println();   
        }
        System.out.println("======FIM======");
    }

    public void imprimirContato(int posicao){
        this.Contato.get(posicao).imprimeIformacoes();
    }

    public void armazenarContato(Contato contato2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'armazenarContato'");
    }
}

