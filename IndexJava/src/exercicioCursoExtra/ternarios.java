package exercicioCursoExtra;

import java.util.Scanner;

public class ternarios {
    public static void main(String[] args) {

        //Funcção 1
        Scanner scanner = new Scanner(System.in);
            int media = scanner.nextInt();
        
            if (media >= 7) {
                
            } else{

            }

            System.out.println(media >= 7 ? "O aluno está aprovado!" : "O aluno está reprovado");
        scanner.close();

        //Função 2
        int idadeParadirigir = 19; //Idade do usuário
        boolean boolIdadeParaDirigir = idadeParadirigir >= 18 ? true : false; //Retorna True ou False em relação a idade
        System.out.println(boolIdadeParaDirigir);
        
        //Função 3
        boolean emailValido = true;
        boolean senhaValida = false;

        String credeciaisValidas = emailValido ? (senhaValida ? "Acesso liberado" : "Senha invalida") : "Email invalido";
        System.out.println(credeciaisValidas);


    }   
    

}
