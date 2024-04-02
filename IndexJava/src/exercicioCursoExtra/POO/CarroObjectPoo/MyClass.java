package exercicioCursoExtra.POO.CarroObjectPoo;

public class MyClass {
    public static void main(String[] args) {
        //Declara o valor para cada objeto --------------------------------------------------------------->
        carro ferrari = new carro("Ferrari", 260, 320, "Vermelho");
        carro mcLaren = new carro("McLaren", 280, 340, "Preto");
        //------------------------------------------------------------------------------------------------>

        System.out.println(ferrari.nome); //Chama o valor nome 
        System.out.println(mcLaren.nome); //Chama o valor nome 
        ferrari.acelerar(); //Chama a função criada no outro arquivo "carro"
        System.out.println(ferrari.velocidadeAtual); //Mostra na tela o valor da velocidade atual junto com o resutlado da função
    }
    
}
