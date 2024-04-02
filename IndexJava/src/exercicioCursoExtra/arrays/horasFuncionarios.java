package exercicioCursoExtra.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class horasFuncionarios {
    public static void main(String[] args) {

        List<Double> horariosFuncionario = new ArrayList<>(Arrays.asList()); //Cria uma lista
        listaHoras(horariosFuncionario); //Chama a função e coloca a lista como parametro
        
    }

    public static void listaHoras(List<Double> horariosFuncionario) {
        Scanner scanner = new Scanner(System.in); 

            double soma = 0; //contador para a soma das horas
            for (int i = 1; i <= 20; i++) {

                System.out.print("Digite um dos seus horários: "); 
                double horarioFunc = scanner.nextDouble();

                horariosFuncionario.add(horarioFunc); //Adiciona na lista os valores digitados

                soma += horarioFunc; //Soma todos os valorres digitados
            }

            //Verificação
            
            if (soma > 160){ 
                System.out.println("Você recebeu algumas horas extras, isso é opcional!");
            }else if(soma == 160){
                System.out.println("Você cumpriu exatamente as suas horas, irá receber seu salário normalmente");
            }else{
                System.out.println("Você não cumpriu suas horas recomendadas, deverá repor. Horas faltantes: " + (160 - soma));
            }

        scanner.close();

    }
}
