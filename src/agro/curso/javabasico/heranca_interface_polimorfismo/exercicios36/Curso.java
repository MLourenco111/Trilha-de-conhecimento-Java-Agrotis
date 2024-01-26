package agro.curso.javabasico.heranca_interface_polimorfismo.exercicios36;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nome;
    private String horario;
    private Professor professor;
    private List<Aluno> alunos;

    public Curso(String nome, String horario, Professor professor) {
        super();
        this.nome = nome;
        this.horario = horario;
        this.professor = professor;
        alunos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void adicionar(Aluno aluno) {
        alunos.add(aluno);
    }

}
