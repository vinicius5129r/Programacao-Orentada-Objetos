package apresentacao.classes;

public class Moto extends Veiculos { 

    
    public Moto(String modelo, String marca, int ano, String cor, boolean ligado) {
        super(modelo, marca, ano, cor, ligado);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void ligar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'ligar'");
    }

    @Override
    public void desligar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'desligar'");
    }
    
}
