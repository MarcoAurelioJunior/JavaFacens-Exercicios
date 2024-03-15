package exercicioCursoExtra;

import java.util.Scanner;

public class sistemaEcommerce {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
            System.out.print("Digite o seu nome: ");
                String nome = scanner.nextLine();
            System.out.print("Digite o seu sobrenome: ");
                String sobrenome = scanner.nextLine();
            System.out.print("Digite um email: ");
                String email = scanner.nextLine();
            System.out.print("Digite uma senha: ");
                int senha = scanner.nextInt();
            System.out.print("Confirme sua senha: ");
                int senhaconfirma = scanner.nextInt();

            if(senha == senhaconfirma){
                System.out.println("Ok, tudo pronto " + nome + " " + sobrenome);
                System.out.println("Enviamos um código de confirmação no email " + email);
            } else{
                System.out.println("Erro, confirmação de senha inválida");
            }

        scanner.close();

    }
}
