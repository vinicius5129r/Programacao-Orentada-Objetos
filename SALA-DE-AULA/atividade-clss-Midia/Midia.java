public class Midia {
    private String legenda;
    private int duracao;

     // Construtor

    public Midia (String legenda, int duracao){
        this.legenda = legenda;
        this.duracao = duracao;

    }

    //Métodos Getters

    public String getlegenda(){
        return this.legenda;
    }

    public int getduração(){
        return this.duracao;
    }

    // Métodos Setters

    public void setlegenda(String legenda){
        this.legenda = legenda;
    }

    public void setduração(int duração){
        this.duracao = duração;
    }

     //Métodos Próprios
    public void legenda(){
        System.out.println(this.legenda);
    } 
    public void duração(){
        System.out.println(this.duracao);
    }
} 