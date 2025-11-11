package formasgeometricas;
/* Criar classes para calcular área e perímetro das seguintes formas geométricas:
 *  quadrado, retângulo, círculo e triângulo.
 *  Cada classe deve ter métodos para calcular a área e o perímetro.
*/
import formasgeometricas.classes.Circulo;
import formasgeometricas.classes.Quadrado;
import formasgeometricas.classes.Triangulo;

public class Principal {
    //A classe principal deve instanciar cada forma geométrica e exibir a área e o perímetro calculados.
    //execução dos métodos das classes criadas.
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado(6.9); //Instanciando a classe Quadrado
        Triangulo triangulo = new Triangulo(4.0, 5.0, 3.0, 4.0, 5.0); //Instanciando a classe Triangulo
        Circulo circulo = new Circulo(7.5); //Instanciando a classe Circulo
        System.out.println("Cálculo de Área e Perímetro das Formas Geométricas\n");
        quadrado.ResultadosQuadrado(); //Chamando o método para exibir resultados do Quadrado
        triangulo.ResultadosTriangulo(); //Chamando o método para exibir resultados do Triângulo
        circulo.ResultadosCirculo(); //Chamando o método para exibir resultados do Círculo

    }
}
