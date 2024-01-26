package agro.curso.javabasico.heranca_interface_polimorfismo.exercicio35;

public class FibonacciRecursivo {

    public static int calcular(int termo) {
        if (termo < 0) {
            System.out.println("Valor inválido");
            return 0;
        }
        if (termo == 1) {
            return 1;
        } else {
            return calcular(termo - 1) + calcular(termo - 2);
        }

    }
}
