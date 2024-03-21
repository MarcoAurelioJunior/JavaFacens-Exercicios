package exercicioCursoExtra;
import java.util.Scanner;

public class diaDeIdade {
    public static void main(String[] args) { //Pergunta idade ao usuario
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha uma das opções abaixo: ");
        System.out.println("1 - Para saber os dias de vida");
        System.out.println("2 - Para saber os meses de vida");

        int valorOpt = scanner.nextInt();

        Opt(valorOpt);
        scanner.close();
    }

    public static void Opt(int OPT){

        if (OPT == 1) {
            Scanner scannerDias = new Scanner(System.in);

                System.out.print("Em que dia você nasceu: ");
                    int valorDia = scannerDias.nextInt();
                System.out.print("Em que mês você nasceu: ");
                    int valorMes = scannerDias.nextInt();
                System.out.print("Em que ano você nasceu: ");
                    int valorAno = scannerDias.nextInt();

                int idadeUsuario = 2024 - valorAno;

                int calculoMesParaDias = valorMes * 31;
                int calculoAnoParaDias = idadeUsuario * 365;

                int calculoIdadeParaDias =  calculoAnoParaDias + calculoMesParaDias + valorDia;

                System.out.println("Você tem " + calculoIdadeParaDias + " dias de idade.");

            scannerDias.close();

        }else if(OPT == 2){
            Scanner scannerMeses = new Scanner(System.in);
                System.out.print("Em que mês você nasceu: ");
                    int valorMes = scannerMeses.nextInt();
                System.out.print("Em que ano você nasceu: ");
                    int valorAno = scannerMeses.nextInt();

                int idadeUsuario = 2024 - valorAno;

                int calculoAnoParaDias = idadeUsuario * 31;

                int calculoValorMeses =  calculoAnoParaDias + valorMes;

                System.out.println("Você tem " + calculoValorMeses + " meses de vida e " + " valorAno");
            
            scannerMeses.close();
            
        }


    }
}
