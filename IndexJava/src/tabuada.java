import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {
        
        //Pergunta o número desejado e a quantidade
        Scanner scanner = new Scanner(System.in);
                System.out.print("Qual tabuada deseja: ");
            int valorTabuada = scanner.nextInt();
                System.out.print("Quantidade de multiplicações: ");
            int valorQuantidade = scanner.nextInt();

            for (int i = 0; i < valorQuantidade+1; i++) { //Repete o valor dependendo da variavel valorTabuada 
                System.out.println(valorTabuada + " X " + i + " = " + i * valorTabuada); //Formatação da tabuada
            }

        scanner.close();
    }
}
