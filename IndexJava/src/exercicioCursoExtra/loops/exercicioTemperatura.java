package exercicioCursoExtra.loops;

import java.util.Scanner;

public class exercicioTemperatura {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

            int numeroDeTemperaturas = 0;
            double somaTemperatura = 0;
        
            while (true) {
                System.out.print("Insira uma temperatura: ");
                double valorTemperatura = scanner.nextDouble();

                if(valorTemperatura == 0){
                    break;
                }

                numeroDeTemperaturas += 1;
                somaTemperatura += valorTemperatura;

            }

            double media = somaTemperatura / numeroDeTemperaturas;
            System.out.println("A média de temperatura foi de: " + media);

        scanner.close();
    }
        
}
