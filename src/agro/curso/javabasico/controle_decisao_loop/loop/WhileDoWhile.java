package agro.curso.javabasico.controle_decisao_loop.loop;

public class WhileDoWhile {

    public static void main(String[] args) {
        /*
         * Comando While
         * 
         * Esse comando avalia uma expressão e caso verdadeira executa o bloco
         * dentro do comando while.
         * 
         */
        int i = 1; // count ou cont
        int max = 10;

        System.out.println("Contando até " + max);

        while (i <= 10) {
            System.out.println("Valor de i:" + i);
            i++;
        }
        /*
         * do-while
         * 
         * Esse comando executa o bloco dentro do comando do e depois avala a
         * expressão. O bloco deixa de ser executado após a expressão ficar
         * falsa.
         * 
         */

        System.out.println(i);

        do {
            i++;
            System.out.println("O valor de i: " + i);
        } while (i < 13);
        System.out.println("O valor de i é: " + i);
    }

}
