package exercicioCursoExtra;
import java.util.Scanner;

public class investigacaoCriminosa {
    public static void main(String[] args) {
        int numSim = interrogatorio();
        classificaInterrogado(numSim);
    }

    public static void classificaInterrogado(int numSim){
        if(numSim == 0 || numSim == 1){
            System.out.println("Inocente");
        }else if(numSim == 2){
            System.out.println("Suspeito");
        }else if(numSim == 3){
            System.out.println("Cúmplice");
        }else if(numSim == 5){
            System.out.println("Assassino");
        }
    }

    public static int interrogatorio() {
        Scanner scanner = new Scanner(System.in);

            int numSim = 0;

            System.out.print("Telefonou para a vítima? ");
            int valor1 = scanner.nextInt();
                if (valor1 == 1) {
                    numSim += 1;
                }

            System.out.print("Esteve no local do crime? ");
            int valor2 = scanner.nextInt();
                if (valor2 == 1) {
                    numSim += 1;
                }

            System.out.print("Mora perto da vítima? ");
            int valor3 = scanner.nextInt();
                if (valor3 == 1) {
                    numSim += 1;
                }

            System.out.print("Devia para a vítima? ");
            int valor4 = scanner.nextInt();
                if (valor4 == 1) {
                    numSim += 1;
                }

            System.out.print("Já trabalhou com a vítima? ");
            int valor5 = scanner.nextInt();
                if (valor5 == 1) {
                    numSim += 1;
                }
                
        return numSim;
    }
}
