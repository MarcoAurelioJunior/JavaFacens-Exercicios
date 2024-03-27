package exercicioCursoExtra.arrays;

import java.util.*;

public class mediaEscola {
    public static void main(String[] args) {
        List<Integer> valoresMedia = new ArrayList(Arrays.asList(8, 6, 5, 9, 10));

        for (int i = 0; i < valoresMedia.size(); i++) {
            if (valoresMedia.get(i) < 7) {
                System.out.println("Temos isso de reprovados: " + i);
            }
        }
    }
}
