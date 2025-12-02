import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        String nomeEstado;
        int mes = 0;

        double[] temperaturaMinima = {

                17.0, 16.9, 16.9, 17.4, 17.0,
                19.8, 19.4, 15.1, 13.9, 14.9,
                15.4, 16.8, 18.4, 19.3, 16.3,
                16.7, 17.6, 17.7, 12.9, 11.2,
                10.7, 11.4, 12.1, 13.6, 14.8,
                17.9, 18.4, 17.9, 18.0, 15.5,
                14.8

        };

        double[] temperaturaMaxima = {

                27.3, 22.8, 29.5, 24.0, 34.0,
                35.1, 26.2, 18.4, 20.2, 19.4,
                26.8, 30.3, 26.3, 27.0, 25.2,
                32.8, 34.5, 23.0, 18.9, 19.5,
                21.8, 23.9, 25.8, 26.6, 31.2,
                31.0, 21.5, 20.1, 27.1, 19.9,
                22.6

        };

        double[] precipitacao = {

                0.0, 0.0, 0.0, 0.0, 0.0,
                0.0, 0.0, 1.0, 2.2, 0.0,
                25.0, 0.0, 0.0, 0.0, 0.0,
                0.0, 0.0, 39.8, 8.6, 1.6,
                0.0, 0.0, 0.0, 0.0, 0.0,
                0.0, 0.0, 1.8, 20.6, 5.2,
                7.6

        };
        do {
            System.out.println("Digite nome do Estado");
            nomeEstado = leitor.nextLine();
            switch (nomeEstado) {
                case "São Paulo":
                    System.out.println("Digite mês (1 - 12): ");
                    mes = leitor.nextInt();
                    if (mes != 1){
                        
                    }

                    break;

                default:
                    System.out.println("Nome ou Mês não registrado");
                    break;
            }
            leitor.close();
        } while (true);

    }
}
