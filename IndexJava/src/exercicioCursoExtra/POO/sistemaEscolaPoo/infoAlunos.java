package exercicioCursoExtra.POO.sistemaEscolaPoo;

public class infoAlunos {
    
    //Atributos
    public String nome;
    public String sobrenome;
    public int idade;
    private String cpf;    

    infoAlunos(String nome, String sobrenome, int idade, String cpf){ // Método constructor
        this.nome = nome; 
        this.sobrenome = sobrenome;
        this.idade = idade;        
        this.cpf = cpf;
    }

    public String saudacao(){
        return String.format("Olá, %s %s", this.nome, this.sobrenome);
    }

    //Metodo get - retorna o cpf indicado
    public String getCpf(){
        return this.cpf;
    }

    //Metodo set - pode alterar o cpf, passando como parametro
    public void setCpf(String cpf){
        this.cpf = cpf;
    }


}
