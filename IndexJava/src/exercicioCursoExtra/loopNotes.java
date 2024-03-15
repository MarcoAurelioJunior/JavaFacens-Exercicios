package exercicioCursoExtra;

import java.util.Scanner;

public class loopNotes {
    public static void main(String[] args) {

        //Enquanto cont for menor que 50 então adicione 1 para cont 
        for (int cont = 10; cont >= 0; cont--) {
            System.out.println(cont);
        }

        Scanner scanner = new Scanner(System.in);
            double somaNota =  0; // variavel que guarda a soma

            for (int i = 1; i <= 4; i++) { //enquanto i for menor que 4 então...

                System.out.println("Digite a nota " + i + " : ");

                double nota = scanner.nextDouble();//adiciona o proximo númeor do tipo double

                somaNota += nota; //Soma todas as notas com +=
            }
            System.out.println("A média das notas é de: " + somaNota);
        scanner.close();
    }   
}
