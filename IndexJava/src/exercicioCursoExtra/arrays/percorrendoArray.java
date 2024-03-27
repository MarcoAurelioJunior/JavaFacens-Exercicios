package exercicioCursoExtra.arrays;

import java.util.*;

public class percorrendoArray {
    public static void main(String[] args) {
        List<String> objetos = new ArrayList<>(Arrays.asList("Tesora", "Cadeado", "Celular", "PC")); //Cria a lista

        int tamanhoLista = objetos.size(); //tamnho da lista em uma variavel
        for (int i = 0; i <= tamanhoLista; i++) { //Enquanto i for menor e igual a tamanho da lista então...
            String valorLista = objetos.get(i); //Pega valor da lista
            System.out.println(valorLista); //Printa na tela
        }
    }
}
