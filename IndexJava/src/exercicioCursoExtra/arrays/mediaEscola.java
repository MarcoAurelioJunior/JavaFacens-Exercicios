package exercicioCursoExtra.arrays;

import java.lang.reflect.Array;
import java.util.*;

public class mediaEscola {
    public static void main(String[] args) {
        
        List<Double> notas = new ArrayList<>(Arrays.asList(7.9, 8.0, 9.2, 6.0, 5.3));
        exibeResultado(notas);
    }

    public static void exibeResultado(List<Double> listaNotas){
        int numAprovados = 0;
        int numReprovados = 0;

        for (int i = 0; i < listaNotas.size(); i++) {
            if(listaNotas.get(i) <= 7){
                numReprovados += 1;
            }else{
                numAprovados += 1;
            } 
        }

        System.out.println("Número de aprovados: " + numAprovados);
        System.out.println("Número de reprovados: " + numReprovados);
    }
}
