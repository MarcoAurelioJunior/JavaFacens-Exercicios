package exercicioCursoExtra.arrays;
import java.util.*;

public class arraysNote {
    public static void main(String[] args) {

        //Cria um Array com elementos ----------------------------------------------------------
        
        int[] javaArrays = {1, 2, 3, 4}; 
        System.out.println(Arrays.toString(javaArrays)); //Chama o array usando Arrays.toString

        //Cria um array sem elementos ----------------------------------------------------------

        int[] javaArrays2 = new int[5]; //Cria um array informando o seu tipo e atribuindo o tamanho dele nesse caso 5
        System.out.println(Arrays.toString(javaArrays2));

        //Adicionando elementos ----------------------------------------------------------------
        String[] animais = new String[3];

        animais[0] = "Cachorro"; // Add ao elemento 0 
        animais[1] = "Gato"; // Add ao elemento 1
        animais[2] = "Peixe"; // Add ao elemento 2

        System.out.println(Arrays.toString(animais)); //Chama o array usando Arrays.toString

        System.out.println(animais[0]); //Exibe o valor do indice 
    }
        
}
