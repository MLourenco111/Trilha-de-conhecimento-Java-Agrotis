package agro.curso.javabasico.heranca_interface_polimorfismo.heranca_polimorfismo;

public class Professor extends Pessoa {
    private String nomeCurso;
    private double salario;

    public Professor() {
        this.testeVisibilidade = 0;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double calcularSalarioLiquido() {
        return 0;
    }

    public String obterEtiquetaEndereco() {
        String s = "Endereço do Professor: ";
        s += super.getEndereco();
        return s;
    }
}
