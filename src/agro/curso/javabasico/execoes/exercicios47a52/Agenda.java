package agro.curso.javabasico.execoes.exercicios47a52;

import java.util.Arrays;

public class Agenda {
    private Contato[] contatos;

    Agenda() {
        this.contatos = new Contato[Contato.getContador()];
    }

    public Contato[] getContatos() {
        return contatos;
    }

    public void setContatos(Contato[] contatos) {
        this.contatos = contatos;
    }

    @Override
    public String toString() {
        return "Agenda [contatos=" + Arrays.toString(contatos) + "]";
    }

    public void adicionarContato(Contato contato, int identificador) {
        this.contatos[identificador] = contato;
    };
}
