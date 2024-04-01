package exercicioCursoExtra.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class horasFuncionarios {
    public static void main(String[] args) {
        List<Double> horariosFuncionario = new ArrayList<>(Arrays.asList());
        Scanner scanner = new Scanner(System.in);

        double soma = 0;
        for (int i = 1; i <= 20; i++) {

            System.out.print("Digite um dos seus horários: ");
            double horarioFunc = scanner.nextDouble();

            horariosFuncionario.add(horarioFunc);

            soma += horarioFunc;
        }

        if (soma > 160){
            System.out.println("Você recebeu algumas horas extras, isso é opcional!");
        }else if(soma == 160){
            System.out.println("Você cumpriu exatamente as suas horas, irá receber seu salário normalmente");
        }else{
            System.out.println("Você não cumpriu suas horas recomendadas, deverá repor. Horas faltantes: " + (160 - soma));
        }

    }

    public static void listaHoras(double[] listaHoras) {
          
    }
}
