package exercicioCursoExtra.POO.CarroObjectPoo;

public class carro { //Cria uma classe publica

    //Cria objetos ----------------------------->
    String nome; 
    int velocidadeMax; 
    int velocidadeAtual;
    String cor;
    //------------------------------------------>

    carro(String nome, int velocidadeMax, int velocidadeAtual, String cor){ // Método constructor
        this.nome = nome;
        this.velocidadeMax = velocidadeMax;
        this.velocidadeAtual = velocidadeAtual;
        this.cor = cor;
    }

    public void acelerar(){
        this.velocidadeAtual += 20;
    }

}
