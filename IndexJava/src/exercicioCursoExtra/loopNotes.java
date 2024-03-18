package exercicioCursoExtra;

import java.util.Scanner;

public class loopNotes {
    public static void main(String[] args) {

        // FOR (sabe a quantidade de elementos EXATA)--------------------------------------------------------------------------------------------------------
        for (int cont = 10; cont >= 0; cont--) { //Codigo com decremento, retira numero
            System.out.println(cont);
        }

        Scanner scanner = new Scanner(System.in);
            double somaNota =  0; // variavel que guarda a soma

            for (int i = 1; i <= 4; i++) { //enquanto i for menor que 4 então...

                System.out.println("Digite a nota " + i + " : ");

                double nota = scanner.nextDouble();//adiciona o proximo número do tipo double

                somaNota += nota; //Soma todas as notas com +=
            }
            System.out.println("A média das notas é de: " + somaNota);

        scanner.close();

        // WHILE (não sabe a quantidade de elementos)--------------------------------------------------------------------------------------------------------

        // Exemplo de utilização método Do While
        Scanner scannerWhile = new Scanner(System.in); 
            int somaValores = 0;

            do{ //faça...
                System.out.print("Informe um valor: "); //Informa um novo valor caso a condição seja verdadeira
                int valor = scannerWhile.nextInt(); //Guarda o valor digitado numa variável
                somaValores += valor; // Coloca a soma de cada valor que é colocado na variável SomaValores
                System.out.println(somaValores); //Mostra na tela o valor atual do SomaValores

            } while (somaValores <= 100); //enqunto o somaValores for menor ou igual a 100 então...

        scannerWhile.close();

        //While exercicio 1
        Scanner scannerWhileExc = new Scanner(System.in);

            double nota = 1; //Numero diferente de 0 para conseguir entrar no While
            int somadorNumeroNotas = 0;
            int somadorNotas = 0;

            while (nota != 0) { //Se nota diferente de 0 então...
                System.out.print("Informe uma nota: ");
                nota = scannerWhileExc.nextDouble(); //Guarda o valor da nota digitada na variável nota

                if (nota != 0) { // Se nota for diferente de 0 então...
                    somadorNotas += nota; //Soma todas as notas digitadas
                    somadorNumeroNotas += 1; //Adiciona 1 a cada nota digitada (Calculo de média)
                }
            }

            double media = somadorNotas / somadorNumeroNotas; //Divide a soma das notas pela quantidade de notas
            System.out.println(media);

        scannerWhileExc.close();

        //While exercicio 2

        Scanner scannerWhileExc2 = new Scanner(System.in);

            int somadorNumeroNotas2 = 0;
            int somadorNotas2 = 0;

            while (true) { //CONDIÇÃO SEMPRE VERDADEIRA!!
                System.out.print("Informe uma nota: ");
                double nota2 = scannerWhileExc.nextDouble(); //Guarda o valor da nota digitada na variável nota

                if (nota2 == 0) { // Se nota for igual a 0 então 
                    break; //Quebre
                }

                somadorNotas += nota2; //Soma todas as notas digitadas
                somadorNumeroNotas += 1; //Adiciona 1 a cada nota digitada (Calculo de média)
            }

            double media2 = somadorNotas2 / somadorNumeroNotas2; //Divide a soma das notas pela quantidade de notas
            System.out.println(media2);

        scannerWhileExc2.close();
    }   
}
