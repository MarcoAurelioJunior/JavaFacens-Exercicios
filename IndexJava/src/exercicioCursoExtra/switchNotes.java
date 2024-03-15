package exercicioCursoExtra;

import java.util.Scanner;

public class switchNotes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.print("Qual das opções abaixo você deseja: \n");
            System.out.print("Ensino infantil 1\nEnsino infantil 2\nEnsino fundamental 1\nEnsino fundamental 2\nEnsino médio\nDigite o resultado: ");
                String valorOpt = scanner.nextLine();
            
            switch (valorOpt) {
                case "Ensino infantil 1":
                    System.out.println("Seu salário será de 4 mil reais, ensino infantil 1");
                    break;
                case "Ensino infantil 2":
                    System.out.println("Seu salário será de 5 mil reais, ensino infantil 2");
                    break;
                case "Ensino fundamental 1":
                    System.out.println("Seu salário será de 6 mil reais, ensino fundamental 1");
                    break;
                case "Ensino fundamental 2":
                    System.out.println("Seu salário será de 7 mil reais, ensino fundamental 2");
                    break;
                case "Ensino medio":
                    System.out.println("Seu salário será de 8 mil reais, ensino médio");
                    break;
                default:
                    System.out.println("Erro, opção inválida!");
                    break;

                }
        scanner.close();    
    }   
}
