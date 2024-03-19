package exercicioFaculdadeFacens;

import java.util.Scanner;

public class anoBissesto {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
                System.out.print("Informe algum ano para descobrir se é Bissexto: ");
                    int valorAno = scanner.nextInt(); //Salva o valor digitado numa variavel

                int anoBissestoDivisivelQuatro = valorAno % 4; //Vê se o ano digitado é divisível por 4 (resto = 0)
                int anoBissestoDivisivelCem = valorAno % 100; //vê se o ano é divisível por 100 (resto != 0)

            if(anoBissestoDivisivelQuatro == 0 && anoBissestoDivisivelCem != 0){ //Se o ano digitado tiver na divisão por 4 resto 0 e na divisão por 100 resto != então...
                System.out.println("----------------------------------------------------");
                System.out.printf("O ano de %d é um ano BISSEXTO \n", valorAno);
                System.out.println("----------------------------------------------------");
                System.out.printf("Explicação: \nIsso ocorre porque esse ano pode ser divido por quatro dando resto %d \ne não é divisível por cem, nesse caso dando resto %d \n", anoBissestoDivisivelQuatro, anoBissestoDivisivelCem);
                System.out.println("----------------------------------------------------");
            }else if(anoBissestoDivisivelQuatro != 0 || anoBissestoDivisivelCem == 0){ //Se valor tiver resto != de 0 na divisão por 4 ou for divisível por 100 então...
                System.out.println("----------------------------------------------------");
                System.out.printf("O ano de %d NÃO é um ano BISSEXTO \n", valorAno);
                System.out.println("----------------------------------------------------");

                    if (anoBissestoDivisivelQuatro == 0) { //Se o ano for divisível por 4 então entrará na condição de ser divisível por 100, o que não pode!
                        System.out.printf("Explicação: \nEsse ano PODE ser dividido por cem, nesse caso dando resto %d, porém os anos bissextos não podem ser divisíveis por 100! \n", anoBissestoDivisivelCem);
                        System.out.println("----------------------------------------------------");
                    }else{ //Caso o valor divisível por 4 seja falso, aparecerá essa mensagem!
                        System.out.printf("Explicação: \nPorque esse ano NÃO pode ser dividido por quatro, nesse caso dando resto %d \n", anoBissestoDivisivelQuatro);
                        System.out.println("----------------------------------------------------");
                    }
                
            }
        scanner.close();
    }
}
