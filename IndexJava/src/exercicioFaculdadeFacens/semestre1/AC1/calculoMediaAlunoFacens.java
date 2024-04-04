package exercicioFaculdadeFacens;
import java.util.Scanner;

public class calculoMediaAlunoFacens {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

            //Pergunta as notas AC1, AC2, AG e AF ----------------------------------------------
            System.out.print("Digite a nota da sua AC1: ");
                float valorAC1 = scanner.nextFloat();
            System.out.print("Digite a nota da sua AC2: ");
                float valorAC2 = scanner.nextFloat();
            System.out.print("Digite a nota da sua AG: ");
                float valorAG = scanner.nextFloat();
            System.out.print("Digite a nota da sua AF: ");
                float valorAF = scanner.nextFloat();

            //Converte o valor da avaliação com o a sua devida porcentagem ----------------------
                double mediaAceitavel = 5;

                valorAC1 = valorAC1 * 0.15f;
                valorAC2 = valorAC2 * 0.30f;
                valorAG = valorAG * 0.10f;
                valorAF = valorAF * 0.45f;

            //Faz o calculo da média final (soma) ------------------------------------------------
            float mediaFinal = valorAC1 + valorAC2 + valorAG + valorAF;


            //Verificação de aprovação ------------------------------------------------------------
            if (mediaFinal >= 5) { //Se maior ou igual a 5, APROVADO
                System.out.println("-------------------------------------------------------------");
                System.out.printf("Sua média foi de: %.1f. Parabéns, você foi aprovado!\n", mediaFinal);
                System.out.println("-------------------------------------------------------------");
            }else if(mediaFinal < 5){ //Se menor que 5, REPROVADO + Calculo de pontos faltantes
                double valorQueFaltaParaMedia = mediaAceitavel - mediaFinal; //Cálcula os pontos que falta para a media aceitavel
                System.out.println("-------------------------------------------------------------");
                System.out.printf("Sua média foi de: %.1f. Infelizmente você foi reprovado \n",mediaFinal); 
                System.out.printf("Ainda precisa de %.1f pontos para pelo menos passar com %.1f nessa disciplina!\n", valorQueFaltaParaMedia, mediaAceitavel);
                System.out.println("-------------------------------------------------------------");
            }else{ //Se der algum erro...
                System.out.println("-------------------------------------------------------------");
                System.out.println("Deu algum erro aí!");
                System.out.println("-------------------------------------------------------------");
            }

        scanner.close();
    } 
}
