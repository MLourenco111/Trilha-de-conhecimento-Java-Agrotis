package agro.curso.javaBasico.controle_decisao_loop.loop.auxiliares;

import java.util.Scanner;

public class BreakContinue {
    public static void main(String[] args) {
        /*
         * Comando break
         * 
         * Usado para saída de loops. Pode ser usado juntamente com um rótulo
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = scan.nextInt();

        System.out.println("Digite um valor maximo: ");

        int max = scan.nextInt();

        for (int i = numero; i <= max; i++) {
            if (i % 7 == 0) {
                System.out.println("Este número é o primeiro divisivel por 7 : " + i);
                break;
            }
        }

        /*
         * Comando continue
         * 
         * Complemento do break Continue o loop na próxima iteração
         * 
         */

        for (int i = numero; i <= max; i++) {
            if (i % 7 == 0) {
                continue;
            }
            System.out.println("O valor de i é: " + i);
        }
    }
}
