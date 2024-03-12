package exercicioCursoExtra;
import java.util.Scanner;

public class conversorDolar {
    public static void main(String[] args) {

        
        //Scanner para verificar o que o usuário deseja fazer
        Scanner scanner2 = new Scanner(System.in);
            System.out.print("O que deseja fazer? Digite 1: Dolar para real. Digite 2: Real para dolar: ");
        int escolhaOpt = scanner2.nextInt();// Variavel para guardar o valor da opção digitada, que envia para um IF/ELSE

            //Se opção 1 for escolhida (Dolar para Real)
            if (escolhaOpt == 1) {

                //Novo scanner, pega o valor do dolar
                Scanner scanner = new Scanner(System.in);
                    System.out.print("Digite o valor (em dolar): ");
                double valorProdutoDolar = scanner.nextFloat();//Variavel para guardar o valor em dolar

                double valorDolar = 4.98; //Variavel para o valor do dolar atual
                double conversorParaReal = valorProdutoDolar * valorDolar; //Multiplicação para converter o dolar para real
                scanner.close(); //Fecha o scanner Dolar para Real

                System.out.printf("Convertendo esse valor de: %.2f US$. Para o real, teremos: %.2f R$",valorProdutoDolar, conversorParaReal );
            } else if (escolhaOpt == 2) { //Se opção 2 for escolhida (Real para Dolar)

                //Novo scanner, pega o valor em real
                Scanner scanner3 = new Scanner(System.in);
                    System.out.print("Digite o valor (em reais): ");
                double valorProdutoReal = scanner3.nextFloat();//Variavel para guardar o valor em reais

                double valorDolar = 4.98; //Variavel para o valor do dolar atual
                double conversorParaDolar = valorProdutoReal / valorDolar; //Dividi para converter real para dolar
                scanner3.close(); //Fecha o scanner Real para Dolar

                System.out.printf("Convertendo esse valor de: %.2f R$. Para dolar, teremos: %.2f US$",valorProdutoReal, conversorParaDolar );
            } else { // Se colocar uma opção diferente de 1 ou 2, aparece esse texto de ero
                System.out.printf("Opa, deu erro aí! Não temos a opção %d", escolhaOpt);
            }

        //Fecha o scanner que contem as opções do usuário
        scanner2.close();
        
    }
}
