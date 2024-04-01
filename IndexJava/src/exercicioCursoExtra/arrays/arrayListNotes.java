package exercicioCursoExtra.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class arrayListNotes {
    public static void main(String[] args) {
        
        //Array list (Lista "Maleavel")-----------------------------------------------------------

        List<String> nomes = new ArrayList<>(Arrays.asList("Marco", "Maria"));

        System.out.println(Arrays.toString(nomes.toArray())); //Chama array usando o ARRAY LIST

        //Add
            nomes.add("José"); //Adiciona um elemento ao final do Array
            nomes.add(1, "Joana"); //Adiciona um elemento no índice indicado
            System.out.println(Arrays.toString(nomes.toArray()));

        //Get
            String elemento = nomes.get(1); //Pega um elemento de acordo com o índice
            System.out.println(elemento);

        //Set
            nomes.set(1, "Jonas"); //Coloca primeiro o índice do elemento que deseja mudar e do lado a alteração
            System.out.println(Arrays.toString(nomes.toArray()));
        
        //Remove
            nomes.remove(1); //Remove o índice 1 (Jonas)
            System.out.println(Arrays.toString(nomes.toArray()));

            nomes.remove(nomes.size() -1); //Pega o tamanho da lista toda e remove 1 (José)
            System.out.println(Arrays.toString(nomes.toArray()));

        //Size
            int tamanhoArray = nomes.size(); //Pega o tamanho da lista toda
            System.out.println(tamanhoArray);

        //IndexOf
            int index = nomes.indexOf("Marco"); //Retorna o índex do elemento
            System.out.println(index);

        //Sort
            nomes.add("Elias");
            nomes.sort(null); //Organiza os elementos, nesse caso como é uma String em ordem alfabética
            System.out.println(Arrays.toString(nomes.toArray()));
        //
        
        //-----------------------------------------------------------------------------------------
        //Adicionando nomes com funções
            adicionaNome(nomes);
            System.out.println(Arrays.toString(nomes.toArray()));

        //Editando nomes com funções
            editaNome(nomes);
            System.out.println(Arrays.toString(nomes.toArray()));

        //Remove nomes com funções
            removeNome(nomes);
            System.out.println(Arrays.toString(nomes.toArray()));

        //Ordena nomes com funções
            ordenaLista(nomes);
            System.out.println(Arrays.toString(nomes.toArray()));

        //
    
    }

    public static List<String> adicionaNome(List<String> nomes) { //Cria um função do tipo List<String>
        Scanner scanner = new Scanner(System.in); //Cria novo Scanner

        System.out.print("Digite um nome:"); //Pede nome
        String nomeAdd = scanner.nextLine(); //Guarda o nome numa variavel

        nomes.add(nomeAdd); //Adiciona o nome digitado numa variavel
        return nomes;

    }

    public static List<String> editaNome(List<String> nomes) { //Cria um função do tipo List<String>
        Scanner scanner = new Scanner(System.in); //Cria novo Scanner

        System.out.print("Digite um nome:"); //Pede nome
        String nomeSet = scanner.nextLine(); //Guarda o nome numa variavel

        System.out.print("Digite o número do elemento que deseja alterar:"); //Pede o número do elemento
        int numeroSet = scanner.nextInt(); //Guarda o número numa variavel

        nomes.set(numeroSet, nomeSet); //Coloca o número de elemento e o nome que deseja alterar
        return nomes;
    }

    public static List<String> removeNome(List<String> nomes) { //Cria um função do tipo List<String>
        nomes.remove(nomes.size() -1); //Remove o ultimo elemento da lista
        return nomes;
    }

    public static List<String> ordenaLista(List<String> nomes) { //Cria um função do tipo List<String>
        nomes.sort(null); //Organiza a lista em ordem alfabética
        return nomes;
    }
    
}
