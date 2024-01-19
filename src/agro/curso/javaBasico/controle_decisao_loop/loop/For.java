package agro.curso.javaBasico.controle_decisao_loop.loop;

public class For {

    public static void main(String[] args) {
        /*
         * Comando for
         * 
         * Executa um bloco de código que está dentro do comando for enquanto
         * uma expressão for verdadeira
         */

        int max = 10;

        for (int i = 0; i < max; i++) {
            System.out.println("O valor de i é " + i);
        }

        for (int i = 5; i > 0; i--) {
            System.out.println("O valor de i é " + i);
        }

        // iniciando mais de uma variavel dentro do for

        for (int i = 0, j = 10; i < j; i++, j--) {
            System.out.println("i = " + i + " j= " + j);
        }

        // partes ausentes

        int count = 0;

        for (; count < 5;) {
            System.out.println("Valor de count: " + count);
            count += 2;
        }

        // loop sem corpo

        int soma = 0;
        for (int i = 1; i < 5; soma += i++) {
            System.out.println("O valor da soma é: " + soma);
        }

    }

}
