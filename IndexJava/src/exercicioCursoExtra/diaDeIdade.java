package exercicioCursoExtra;
import java.util.Scanner;

//APLICAÇÃO EM MANUTENÇÃO!

public class diaDeIdade {
    public static void main(String[] args) { //Pergunta idade ao usuario
        Scanner scanner = new Scanner(System.in);
            System.out.println("Digite o dia em que nasceu: ");
        int idadeEmAnosDia = scanner.nextInt();
            System.out.println("Digite o mês em que nasceu: ");
        int idadeEmAnosMes = scanner.nextInt();
            System.out.println("Digite o ano em que nasceu: ");
        int idadeEmAnos= scanner.nextInt();

        int atualAno = 2024; // Ano atual

        int idade = atualAno - idadeEmAnos; //Idade do usuario

        int calculoAnoParaDias = idade * 365;//Pega a idade e multiplica por 365
        int calculoMesParaDias = (idadeEmAnosMes * 31) - 2 * idade ;//Descobre quantos meses ele viveu e multiplica por 31 além de tira 2 dias a cada mês (contando fevereiro)

        int calculoFinal = calculoAnoParaDias + calculoMesParaDias + idadeEmAnosDia;//Soma tudo

        System.out.printf("Você tem %d dias de idade!", calculoFinal);
    }
}
