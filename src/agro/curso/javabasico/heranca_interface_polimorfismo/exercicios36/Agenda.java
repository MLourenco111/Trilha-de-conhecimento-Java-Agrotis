package agro.curso.javabasico.heranca_interface_polimorfismo.exercicios36;

import java.util.Arrays;

public class Agenda {
    private Contato[] contatos;
    private String nome;

    Agenda() {
        this.contatos = new Contato[3];
    }

    Agenda(String nome) {
        this.nome = nome;
        this.contatos = new Contato[3];
    }

    public Contato[] getContatos() {
        return contatos;
    }

    public void setContatos(Contato[] contatos) {
        this.contatos = contatos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Agenda [contatos=" + Arrays.toString(contatos) + "]";
    }

    public void adicionarContato(Contato contato, int identificador) {
        if (this.contatos.length < identificador + 1) {
        } else {
            this.contatos[identificador] = contato;
        }
    };

    public void mostrarContatoAgenda() {
        System.out.println(this.toString());
    }

}