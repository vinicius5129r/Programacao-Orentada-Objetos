package formasgeometricas.classes; //definição do pacote
//classe Circulo para calcular área e perímetro do círculo
public class Circulo {
    //atributo raio do círculo
    double raio; //raio do círculo
    private double area; //área do círculo
    private double perimetro; //perímetro do círculo
    private final double PI = 3.14; //constante PI

    //construtor da classe Circulo
    public Circulo(double raio) {
        //inicializa o atributo raio
        this.raio = raio;
    }

    //método para calcular a área do círculo
    private double calcularArea() {
        //fórmula da área do círculo: PI * raio * raio
        area = PI * raio * raio;
        //Retorna o valor da área calculada
        return area;
    }

    //método para calcular o perímetro do círculo
    private double calcularPerimetro() {
        //fórmula do perímetro do círculo: 2 * PI * raio
        perimetro = 2 * PI * raio;
        //Retorna o valor do perímetro calculado
        return perimetro;
    }
    
    //método para exibir os resultados do círculo
    public void ResultadosCirculo() {
        //formatação da saída dos resultados
        System.out.format("Raio: %.1f\nArea: %.1f\nPerímetro: %.1f\n", raio, calcularArea(), calcularPerimetro());
    }
    
}
