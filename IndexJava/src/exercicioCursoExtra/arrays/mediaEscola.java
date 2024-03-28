package exercicioCursoExtra.arrays;

import java.util.*;

public class mediaEscola {
    public static void main(String[] args) {
        
        List<Double> notas = new ArrayList<>(Arrays.asList(7.9, 8.0, 9.2, 6.0, 5.3)); //Array com as notas
        exibeResultado(notas); //Chama função e coloca a lista das notas como parametro
    }

    public static void exibeResultado(List<Double> listaNotas){ //Cria a função colocando como paramentro uma lista "Imaginária"
        int numAprovados = 0; //contador de aprovados
        int numReprovados = 0; //contador de reprovados

        for (int i = 0; i < listaNotas.size(); i++) { //Enquanto i for menor que tamanho da lista então...
            if(listaNotas.get(i) <= 7){ //Se algum elemento da lista for menor ou igual a 7 então...
                numReprovados += 1; //Adiciona + 1 ao contador de reprovados
            }else{
                numAprovados += 1; //Adiciona + 1 ao contador de aprovados
            } 
        }

        //Sysout fora do for para não repetir o contador, colocando apenas o seu ultimo resultado

        System.out.println("Número de aprovados: " + numAprovados); //Resultado do contador
        System.out.println("Número de reprovados: " + numReprovados); //Resultado do contador
    }
}
