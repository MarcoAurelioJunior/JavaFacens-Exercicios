package exercicioCursoExtra.loops;

import java.util.Scanner;

public class exercicioPosto {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
            System.out.print("Insira o valor do litro: ");
            double valorLitro = scanner.nextDouble();
        
            for (int i = 1; i <= 50; i++) {
                System.out.println("Quantidade de litros: " + i + "| Valor do litro: " + valorLitro + "| Valor total: " + i*valorLitro );
            }
        scanner.close();
    }
}
