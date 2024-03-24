package exercicioCursoExtra.funcoes;

import java.util.Scanner;

public class functionNotes {

    public static void main(String[] args) { //Void = don't return anything
        //Function comprarSorvete
        System.out.println(comprarSorvete(10)); //call the function comprarSorvete and assign 10 to dinheiro

        //function calculoMedia
        Scanner scanner = new Scanner(System.in);
            System.out.print("Digite a nota 1: ");
            int valorNum1 = scanner.nextInt();

            System.out.print("Digite a nota 2: ");
            int valorNum2 = scanner.nextInt();

            System.out.print("Digite a nota 3: ");
            int valorNum3 = scanner.nextInt();

            System.out.println(calculoMedia(valorNum1, valorNum2, valorNum3)); //call the function and put the parameters of the user
        scanner.close();
    }
    public static String comprarSorvete(float dinheiro){ //Create a function of type String
        return "Comprei o sorvete e custou R$ " + dinheiro; //Return the variable "dinheiro" + string
    }

    public static String calculoMedia(int num1, int num2, int num3) { //Create a function calculoMedia() and assign num1, num2 and num3
        return "O resultado da média vai ser de: " + (num1 + num2 + num3)/3; //return the values adding and dividing by 3
    }
}
