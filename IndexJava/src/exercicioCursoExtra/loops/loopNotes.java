package exercicioCursoExtra.loops;

import java.util.Scanner;

public class loopNotes {
    public static void main(String[] args) {

        // FOR --------------------------------------------------------------------------------------------------------
        for (int cont = 10; cont >= 0; cont--) { //code with decrement, withdraw number
            System.out.println(cont);
        }

        Scanner scanner = new Scanner(System.in);
            double somaNota =  0; // variable that stores and adds

            for (int i = 1; i <= 4; i++) { //while i < 4 then...

                System.out.println("Digite a nota " + i + " : ");

                double nota = scanner.nextDouble();//add the next number type double

                somaNota += nota; //adding all notes and put in the variable
            }
            System.out.println("A média das notas é de: " + somaNota);

        scanner.close();

        // WHILE --------------------------------------------------------------------------------------------------------

        Scanner scannerWhile = new Scanner(System.in); 
            int somaValores = 0;

            do{ //do...
                System.out.print("Informe um valor: "); //informs a new value if the condition is true
                int valor = scannerWhile.nextInt(); //Store the typed value in the variable
                somaValores += valor; //Put the adding of each items in the variable SomaValores
                System.out.println(somaValores); //Show the current value on the screen 

            } while (somaValores <= 100); //While somaValores <= 100 then...

        scannerWhile.close();

        //While exercise 1
        Scanner scannerWhileExc = new Scanner(System.in);

            double nota = 1; //number different then 0 to start while
            int somadorNumeroNotas = 0;
            int somadorNotas = 0;

            while (nota != 0) { //if note different then 0...
                System.out.print("Informe uma nota: ");
                nota = scannerWhileExc.nextDouble();

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
