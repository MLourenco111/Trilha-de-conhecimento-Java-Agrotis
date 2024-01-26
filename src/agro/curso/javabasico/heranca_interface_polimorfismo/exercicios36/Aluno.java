package agro.curso.javabasico.heranca_interface_polimorfismo.exercicios36;

public class Aluno {
    private String nome;
    private int matricula;
    private double[] notas;

    public Aluno(String nome, int matricula) {
        super();
        this.nome = nome;
        this.matricula = matricula;
        notas = new double[2];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public void calcularMedia() {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        double media = soma / notas.length;
        if (media < 7) {
            System.out.println("Reprovado " + media);
        } else {
            System.out.println("Aprovado " + media);
        }

    }

}
