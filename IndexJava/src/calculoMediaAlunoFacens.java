import java.util.Scanner;

public class calculoMediaAlunoFacens {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

            //Pergunta as notas AC1, AC2, AG e AF ----------------------------------------------
            System.out.print("Digite a nota da sua AC1: ");
                double valorAC1 = scanner.nextDouble();
            System.out.print("Digite a nota da sua AC2: ");
                double valorAC2 = scanner.nextDouble();
            System.out.print("Digite a nota da sua AG: ");
                double valorAG = scanner.nextDouble();
            System.out.print("Digite a nota da sua AF: ");
                double valorAF = scanner.nextDouble();

            //Converte o valor da avaliação com o a sua devida porcentagem ----------------------
                double mediaAceitavel = 5;

                valorAC1 = valorAC1 * 0.15;
                valorAC2 = valorAC2 * 0.30;
                valorAG = valorAG * 0.10;
                valorAF = valorAF * 0.45;

            //Faz o calculo da média final (soma) ------------------------------------------------
            double mediaFinal = valorAC1 + valorAC2 + valorAG + valorAF;


            //Verificação de aprovação ------------------------------------------------------------
            if (mediaFinal >= 5) { //Se maior ou igual a 5, APROVADO

                System.out.printf("Sua média foi de: %.1f. Parabéns, você foi aprovado!", mediaFinal);

            }else if(mediaFinal < 5){ //Se menor que 5, REPROVADO + Calculo de pontos faltantes

                double valorQueFaltaParaMedia = mediaAceitavel - mediaFinal; //Cálcula os pontos que falta para a media aceitavel
                System.out.printf("Sua média foi de: %.1f. Infelizmente você foi reprovado \n",mediaFinal); 
                System.out.printf("Ainda precisa de %.1f pontos para pelo menos passar com %.1f nessa disciplina! ", valorQueFaltaParaMedia, valorQueFaltaParaMedia+mediaFinal);

            }else{ //Se der algum erro...

                System.out.println("Deu algum erro aí!");
                
            }

        scanner.close();
    } 
}
