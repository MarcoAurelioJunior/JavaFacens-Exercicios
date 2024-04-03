package exercicioCursoExtra;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.lang.Math;

public class twoSum {
    public static void main(String[] args) {
        int target = 9;
        int soma;
        
        List<Integer> sumArrray = new ArrayList<>(Arrays.asList(11, 7, 2, 15));

        Random random = new Random();
        
        do {

            int num1 = sumArrray.get(random.nextInt(4));
            int num2 = sumArrray.get(random.nextInt(4));

            soma = num1 + num2;

            int num1Indice = sumArrray.indexOf(num1);
            int num2Indice = sumArrray.indexOf(num2);


            if(soma == target){
                System.out.println("Os elementos que estáo na posição " + num1Indice + " e " + num2Indice + " da lista " + " tem a suma soma de: " + soma);
            }

        } while (soma != target);

    }
}
