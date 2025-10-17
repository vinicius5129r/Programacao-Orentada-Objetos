package atividade;

public class AtividadeAgenda {
    public static void main(String[] args) {
        
        Contato contato1 = new Contato("João Silva", "ney@email.com", "1234-5678");

        Contato contato2 = new Contato("Maria Oliveira", "bat@batmail.com", "8765-4321");

        Contato contato3 = new Contato("Carlos Souza", "pescador_lambarildo@email.com", "1122-3344");

        Contato contato4 = new Contato("Ana Pereira", "ana234532@gmail.com", "9988-7766");

        //contato1.imprimeIformacoes();
        AgendaV2 agenda = new AgendaV2();
        agenda.armazenarContato(contato1);
        agenda.armazenarContato(contato2);
        agenda.armazenarContato(contato3);
        agenda.armazenarContato(contato4);
    }

    public void imprimeIformacoes() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'imprimeIformacoes'");
    }

}
