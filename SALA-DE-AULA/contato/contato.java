package contato;

public class contato {
    private String _nome;
    private String _email;
    private String _telefone;

    public contato(String _nome, String _email, String _telefone) {
        this._nome = _nome;
        this._email = _email;
        this._telefone = _telefone;
    }

    public String get_nome() {
        return _nome;
    }

    public void set_nome(String _nome) {
        this._nome = _nome;
    }

    public String get_email() {
        return _email;
    }

    public void set_email(String _email) {
        this._email = _email;
    }

    public String get_telefone() {
        return _telefone;
    }

    public void set_telefone(String _telefone) {
        this._telefone = _telefone;
    }

    public void imprimeIformacoes(){
        System.out.println("_nome: " + this._nome);
        System.out.println("_email: " + this._email);
        System.out.println("_telefone: " + this._telefone);
    }

    public void remover(contato contato) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remover'");
    }

    public static int size() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'size'");
    }

    public static contato get(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'get'");
    }
    
}