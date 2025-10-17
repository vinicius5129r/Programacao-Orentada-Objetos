package formasgeometricas.classes; //definição do pacote
//classe Triangulo para calcular área e perímetro do triângulo
public class Triangulo {
    double base;
    double altura;
    double ladoA;
    double ladoB;
    double ladoC;
    private double area;
    private double perimetro;

    //construtor da classe Triangulo
    public Triangulo(double base, double altura, double ladoA, double ladoB, double ladoC) {
        this.base = base;
        this.altura = altura;
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }
    
    //método para calcular a área do triângulo
    private double calcularArea() {
        //fórmula da área do triângulo: (base * altura) / 2
        area = (base * altura) / 2;
        return area;
    }

    //método para calcular o perímetro do triângulo
    private double calcularPerimetro() {
        //fórmula do perímetro do triângulo: ladoA + ladoB + ladoC
        perimetro = ladoA + ladoB + ladoC;
        return perimetro;
    }
    
    //método para exibir os resultados do triângulo
    public void ResultadosTriangulo() {
        //formatação da saída dos resultados
        System.out.format("Base: %.1f\nAltura: %.1f\nLados: %.1f, %.1f, %.1f\nArea: %.1f\nPerímetro: %.1f\n", 
                          base, altura, ladoA, ladoB, ladoC, calcularArea(), calcularPerimetro());
    }
    
}
