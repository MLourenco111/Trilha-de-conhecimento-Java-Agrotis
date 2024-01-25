package agro.curso.javabasico.heranca_interface_polimorfismo.exercicios36a43;

public class PessoaJuridica extends Pessoa {

    private String cnpj;

    public PessoaJuridica(String nome, double rendaBruta, String cnpj) {
        super(nome, rendaBruta);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        String s = super.toString();
        s += ", cnpj=" + cnpj + ", Imposto a pagar  " + this.calcularImposto() + "]";
        return s;
    }

    @Override
    public double calcularImposto() {
        // TODO Auto-generated method stub
        return this.getRendaBruta() * 0.10;
    }

}
