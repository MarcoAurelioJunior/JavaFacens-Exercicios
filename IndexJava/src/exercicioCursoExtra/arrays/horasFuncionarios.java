package exercicioCursoExtra.arrays;

import java.util.Scanner;

public class horasFuncionarios {
    public static void main(String[] args) {
        double[] horasFuncionarios = new double[20];
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= horasFuncionarios.length; i++) {
            System.out.print("Digite um dos seus horários: ");
            int horarioFunc = scanner.nextInt();
        }
    }

    public static void listaHoras(double[] listaHoras) {
          
    }
}
