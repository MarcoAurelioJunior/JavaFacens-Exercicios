package exercicioCursoExtra.POO.sistemaEscolaPoo;

public class recebeAluno {
    public static void main(String[] args) {
        infoAlunos Marco = new infoAlunos("Marco", "Aurélio Roque de Oliveira Júnior", 18, "24324324365");
        infoAlunos Maria = new infoAlunos("Maria", "Luíza Corre de Oliveira", 15, "0000000000");

        System.out.println(Marco.getCpf()); //Chama a função para pegar o cpf
        Maria.setCpf("77777777777"); //Chama a função para editar o cpf 
        System.out.println(Maria.getCpf());
        
        System.out.println(Maria.saudacao());
        System.out.println(Marco.saudacao());
    }
}
