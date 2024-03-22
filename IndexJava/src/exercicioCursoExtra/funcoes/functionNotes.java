package exercicioCursoExtra.funcoes;

import java.util.Scanner;

public class functionNotes {

    public static void main(String[] args) { //Void = Função que não retorna algo
        //Função comprarSorvete
        System.out.println(comprarSorvete(10)); //Chama a função comprarSorvete e atribui 10 ao dinheiro

        //Função calculoMedia
        Scanner scanner = new Scanner(System.in);
            System.out.print("Digite a nota 1: ");
            int valorNum1 = scanner.nextInt();

            System.out.print("Digite a nota 2: ");
            int valorNum2 = scanner.nextInt();

            System.out.print("Digite a nota 3: ");
            int valorNum3 = scanner.nextInt();

            System.out.println(calculoMedia(valorNum1, valorNum2, valorNum3)); //chama a função e coloca os parametros dos dígitos do usuário
        scanner.close();
    }
    public static String comprarSorvete(float dinheiro){ //Cria a função do tipo String
        return "Comprei o sorvete e custou R$ " + dinheiro; //Retorna o texto + a quantidade de dinheiro estabelecida
    }

    public static String calculoMedia(int num1, int num2, int num3) { //Cria função do tipo String, passando os parametros num1, num2, num3
        return "O resultado da média vai ser de: " + (num1 + num2 + num3)/3; //Retorna o resultado somanddo e dividindo os parametros passados
    }
}
