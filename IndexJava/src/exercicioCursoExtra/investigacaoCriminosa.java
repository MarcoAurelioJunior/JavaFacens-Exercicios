package exercicioCursoExtra;
import java.util.Scanner;

public class investigacaoCriminosa {
    public static void main(String[] args) {
        int numSim = interrogatorio(); //Cria a variavel numSim atribuindo a função interrogatorio() que está retornando os resultados!
        classificaInterrogado(numSim); //Chama a funçao classificaInterrogado() e atribui a variavel
    }

    public static void classificaInterrogado(int numSim) { // Cria a função e coloca como parametro a variavel
        //Classificação dos resultados!
        
        if(numSim == 0 || numSim == 1){ 
            System.out.println("Inocente");
        }else if(numSim == 2){
            System.out.println("Suspeito");
        }else if(numSim == 3){
            System.out.println("Cúmplice");
        }else if(numSim == 5){
            System.out.println("Assassino");
        }
    }

    public static int interrogatorio() { //Cria a função interrogatorio()

        Scanner scanner = new Scanner(System.in); //Novo Scanner

            int numSim = 0; //Variavel valor inicial 0 

            System.out.print("Telefonou para a vítima? ");
            int valor1 = scanner.nextInt();
                if (valor1 == 1) { //Se o valor for igual a 1 (Sim) então...
                    numSim += 1; //Atribua a variavel + 1
                }

            System.out.print("Esteve no local do crime? ");
            int valor2 = scanner.nextInt();
                if (valor2 == 1) { //Se o valor for igual a 1 (Sim) então...
                    numSim += 1; //Atribua a variavel + 1
                }

            System.out.print("Mora perto da vítima? ");
            int valor3 = scanner.nextInt();
                if (valor3 == 1) { //Se o valor for igual a 1 (Sim) então...
                    numSim += 1; //Atribua a variavel + 1
                }

            System.out.print("Devia para a vítima? ");
            int valor4 = scanner.nextInt();
                if (valor4 == 1) { //Se o valor for igual a 1 (Sim) então...
                    numSim += 1; //Atribua a variavel + 1
                }

            System.out.print("Já trabalhou com a vítima? ");
            int valor5 = scanner.nextInt();
                if (valor5 == 1) { //Se o valor for igual a 1 (Sim) então...
                    numSim += 1; //Atribua a variavel + 1
                }
        scanner.close();      
        return numSim; //Retorna a variavel com os seus devidos resultados
    }
}
