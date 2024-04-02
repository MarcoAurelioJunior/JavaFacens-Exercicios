package exercicioCursoExtra.POO.sistemaEscolaPoo;

public class recebeAluno {
    public static void main(String[] args) {
        infoAlunos aluno = new infoAlunos("Marco", "Aurélio Roque de Oliveira Júnior", 18);

        System.out.println(aluno.nome + " " + aluno.sobrenome + " tem " + aluno.idade + " de idade");
    }
}
