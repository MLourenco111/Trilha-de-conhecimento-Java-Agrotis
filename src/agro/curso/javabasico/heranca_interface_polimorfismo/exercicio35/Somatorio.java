package agro.curso.javabasico.heranca_interface_polimorfismo.exercicio35;

import java.util.Scanner;

public class Somatorio {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println(somatorio(scan.nextInt()));
    }

    public static int somatorio(int n) {
        if (n == 1) {
            return 1;
        }

        return n + somatorio(--n);
    }
}
