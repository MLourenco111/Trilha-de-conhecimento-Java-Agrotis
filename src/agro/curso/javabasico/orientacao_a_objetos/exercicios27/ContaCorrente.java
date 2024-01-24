package agro.curso.javabasico.orientacao_a_objetos.exercicios27;

public class ContaCorrente {
    String tipo = "corrente";
    int numero;
    String nome;
    double saldo;
    int limite;
    boolean especial = false;

    double depositar(double valor) {

        if (valor < 0) {
            System.out.println("valor invalido");
        } else {
            this.saldo += valor;
        }
        return this.saldo;
    }

    double sacar(int valor) {
        if (valor > this.saldo && valor < 0) {
            System.out.println("Não foi possivel sacar este valor");
        } else {
            this.saldo -= valor;
        }
        return saldo;
    }

    void consultarSaldo() {
        System.out.println("O seu saldo é R$ " + this.saldo);
    }

    void consultarCheque() {
        System.out.println(" Está usando cheque especial " + this.especial);
    }
}
