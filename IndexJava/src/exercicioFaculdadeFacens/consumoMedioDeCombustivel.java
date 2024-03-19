package exercicioFaculdadeFacens;
import java.util.Scanner;//Import Scanner

public class consumoMedioDeCombustivel {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Novo Scanner

            // Guarda na variável a resposta do usuário (Scanner) -------------------------------------------------------------------------------
            System.out.print("Qual foi a sua distância percorrida (KM): ");// Pergunta a distância percorrida
                float valorDistanciaPercorrida = scanner.nextFloat();//Guarda o valor do próximo float em uma variavel

            System.out.print("Agora coloque a quantidade de combustível gasto (L): ");//Pergunta a quantidade de combustível gasto
                float valorQuantidadeCombustivel = scanner.nextFloat();//Guarda o valor do próximo float em uma variavel

            // Cálculo do consumo e print -------------------------------------------------------------------------------------------------------------------
                float calculoConsumoMedio = valorDistanciaPercorrida / valorQuantidadeCombustivel;//Faz o calculo do consumo médio
                System.out.println("-------------------------------------------------------------");
                System.out.printf("Você teve um consumo médio de combustível de %.2fkm/l\n", calculoConsumoMedio);//Mostra na tela o resultado em km/l
                System.out.println("-------------------------------------------------------------");
        scanner.close();//Fecha o scanner
        
    }
}
