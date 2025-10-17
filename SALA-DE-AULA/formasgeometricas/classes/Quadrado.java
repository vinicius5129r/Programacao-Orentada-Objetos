package formasgeometricas.classes; //definição do pacote
//classe Quadrado para calcular área e perímetro do quadrado
public class Quadrado {
    //atributo lado do quadrado
    double lado; //lado do quadrado
    private double area; //área do quadrado
    private double perimetro; //perímetro do quadrado

    //construtor da classe Quadrado
    public Quadrado(double lado) {
        this.lado = lado;

    }

    //método para calcular a área do quadrado
    private double calcularArea() {
        //fórmula da área do quadrado: lado * lado
        area = lado * lado; 
        //Retorna o valor da área calculada
        return area;
    }

    //método para calcular o perímetro do quadrado
    private double calcularPerimetro() {
        //fórmula do perímetro do quadrado: 4 * lado
        perimetro = 4 * lado;
        return perimetro;
    }
    
    //método para exibir os resultados do quadrado
    public void ResultadosQuadrado() {
        //formatação da saída dos resultados
        System.out.format("Lado: %.1f\nArea: %.1f\nPerímetro: %.1f\n", lado, calcularArea(), calcularPerimetro());
    }
}
