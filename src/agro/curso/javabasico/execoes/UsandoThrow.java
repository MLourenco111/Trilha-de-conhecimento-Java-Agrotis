package agro.curso.javabasico.execoes;

import java.util.Scanner;

public class UsandoThrow {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("Entre com um número decima");
        try {
            double num = leNumero();
        } catch (Exception e) {
            System.out.println("Entrada inválida");

        }
    }

    public static double leNumero() throws Exception {
        Scanner scan = new Scanner(System.in);
        double num = scan.nextDouble();
        return num;
    }
}
