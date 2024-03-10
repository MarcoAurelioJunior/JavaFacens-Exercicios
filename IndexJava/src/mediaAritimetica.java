
// Exercicio: Média Aritimética

//Instruções: Dadas 3 notas do aluno, imprima a sua média aritimética

import java.util.Scanner;

public class mediaAritimetica {
    public static void main(String[] args) {

        //Scanner para descobrir as 3 notas
        Scanner scanner = new Scanner(System.in);
                System.out.print("Digite a sua PRIMEIRA nota (AC1): ");
            float nota1 = scanner.nextFloat();
                System.out.print("Digite a sua SEGUNDA nota (AC2): ");
            float nota2 = scanner.nextFloat();
                System.out.print("Digite a sua TERCEIRA nota (AF): ");
            float nota3 = scanner.nextFloat();

            double resultadoMedia = (nota1 + nota2 + nota3) / 3;

        //Verifica se passou ou não sendo que a média precisa ser maior que 6
            if (resultadoMedia > 6) {
                System.out.printf("sua média foi de: %.1f. Parabéns você conseguiu passar nessa discplina!", resultadoMedia);
            } else if (resultadoMedia < 5) { //Se não passou será submetido a AS 
                System.out.printf("sua média foi de: %.1f. Vixe, não foi dessa vez, talvez você faça a AS (Avaliação substitutiva) \n", resultadoMedia);

                //Novo scanner (Recebe o valor da prova AS)
                Scanner scannerAs = new Scanner(System.in);
                        System.out.print("Digite a nota da sua (AS): ");
                    float notaAS = scannerAs.nextFloat();
                scannerAs.close();

                //Verifica se a AS é maior que alguma nota das outras avaliações

                if (notaAS <= nota1 && notaAS <= nota2 && notaAS <= nota3) {
                    System.out.printf("Sua nota da AS não superou nenhuma nota de outra avaliação, por conta disso sua média continua de %.1f \n", resultadoMedia);
                } else { //Verifica a menor nota e substitui ela pela prova AS
                    if (nota1 < nota2 && nota1 < nota3) {
                        resultadoMedia = (notaAS + nota2 + nota3) / 3;
                    } else if (nota2 < nota1 && nota2 < nota3) {
                        resultadoMedia = (nota1 + notaAS + nota3) / 3;
                    } else {
                        resultadoMedia = (nota1 + nota2 + notaAS) / 3;
                    }

                    System.out.printf("Sua nota da prova AS sendo de: %.1f. E alterando sua menor nota, teremos que sua média vai ser de %.1f \n", notaAS, resultadoMedia);
                }

                // Verifica se passou na disciplna ou não 
                if (resultadoMedia > 6) {
                    System.out.printf("Parabéns você conseguiu passar nessa discplina!", resultadoMedia);
                }else {
                    System.out.println("Infelizmente você não conseguiu passar na disciplina");
                }
            }
                
        scanner.close();   
    }    
}
