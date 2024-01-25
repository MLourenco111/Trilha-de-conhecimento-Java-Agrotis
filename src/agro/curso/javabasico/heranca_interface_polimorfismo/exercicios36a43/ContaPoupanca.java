package agro.curso.javabasico.heranca_interface_polimorfismo.exercicios36a43;

import java.util.Date;

public class ContaPoupanca extends ContaBancaria {

    private Date diaRendimento;

    public ContaPoupanca(String nomeCliente) {
        super(nomeCliente);
    }

    public Date getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(Date diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    public double calcularNovoSaldo(double taxaRendimento) {
        double valorRendimento = 0;
        if (taxaRendimento > 0) {
            valorRendimento = this.getSaldo() * taxaRendimento;
            double novoSaldo = this.getSaldo() + valorRendimento;
            setSaldo(novoSaldo);
        }
        return valorRendimento;
    }

}
