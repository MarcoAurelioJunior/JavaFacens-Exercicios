package exercicioFaculdadeFacens;

import java.util.Scanner;

public class tipoTriangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            //Scanner para pedir os lados de um trangulo
            System.out.print("Digite o valor do PRIMEIRO lado do triângulo: ");
                float valorLado1 = scanner.nextFloat();
            System.out.print("Digite o valor do SEGUNDO lado do triângulo: ");
                float valorLado2 = scanner.nextFloat();
            System.out.print("Digite o valor do TERCEIRO lado do triângulo: ");
                float valorLado3 = scanner.nextFloat();

            //Condições e classificação dos triângulos
            if(valorLado1 == valorLado2 && valorLado2 == valorLado3 && valorLado1 == valorLado3){ // Se todos os lados forem iguais, então...
                System.out.println("-----------------------------------------------------");
                System.out.println("Tipo: \nEQUILÁTERO\n");
                System.out.println("-----------------------------------------------------");
                System.out.println("Explicação: \nEsse tipo de triângulo é classificado dessa forma, pois todos os seu lados são IGUAIS!\n");
                System.out.printf("Lado 1 = %.1f\n", valorLado1);
                System.out.printf("Lado 2 = %.1f\n", valorLado2);
                System.out.printf("Lado 3 = %.1f\n", valorLado3);
                System.out.println("-----------------------------------------------------");
            }else if(valorLado1 != valorLado2 && valorLado2 != valorLado3 && valorLado1 != valorLado3){ //se todos os lados forem diferentes, então...
                System.out.println("-----------------------------------------------------");
                System.out.println("Tipo: \nESCALENO\n");
                System.out.println("-----------------------------------------------------");
                System.out.println("Explicação: \nEsse tipo de triângulo é classificado dessa forma, pois todos os seu lados são DIFERENTES!\n");
                System.out.printf("Lado 1 = %.1f\n", valorLado1);
                System.out.printf("Lado 2 = %.1f\n", valorLado2);
                System.out.printf("Lado 3 = %.1f\n", valorLado3);
                System.out.println("-----------------------------------------------------");
            } else{ // Senão apenas se um dos lados forem diferentes
                System.out.println("-----------------------------------------------------");
                System.out.println("Tipo: \nISÓSCELES\n");
                System.out.println("-----------------------------------------------------");
                System.out.println("Explicação: \nEsse tipo de triângulo é classificado dessa forma, pois pelo menos dois dos seus lados são IGUAIS e um é DIFERENTE!\n");
                System.out.printf("Lado 1 = %.1f\n", valorLado1);
                System.out.printf("Lado 2 = %.1f\n", valorLado2);
                System.out.printf("Lado 3 = %.1f\n", valorLado3);
                System.out.println("-----------------------------------------------------");
            }

        scanner.close();
    }
}
