package agro.curso.javabasico.heranca_interface_polimorfismo.heranca_polimorfismo;

public class Escola {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        Pessoa professor = new Professor();

        aluno.setEndereco("teste");
        aluno.setCurso("Psicologia");
        double[] notas = { 10 };
        aluno.setNotas(notas);
        professor.setEndereco("teste 2");

        System.out.println(aluno.obterEtiquetaEndereco());
        System.out.println(professor.obterEtiquetaEndereco());
        System.out.println(aluno);

        Aluno aluno2 = new Aluno();

        aluno2.setEndereco("teste");
        aluno2.setCurso("Psicologia");
        double[] notas2 = { 10 };
        aluno2.setNotas(notas2);

        System.out.println(aluno2);
        System.out.println(aluno.equals(aluno2));

    }
}
