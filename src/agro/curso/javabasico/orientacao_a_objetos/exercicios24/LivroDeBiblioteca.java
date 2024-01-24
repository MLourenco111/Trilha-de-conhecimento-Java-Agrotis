package agro.curso.javabasico.orientacao_a_objetos.exercicios24;

import java.util.Date;

public class LivroDeBiblioteca extends Livro {
    int id;
    Date dataEmprestimo;
    Date dataDevolucao;
    String nomeCliente;
    String sessao;
    boolean emprestimo = false;
}
