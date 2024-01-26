package agro.curso.javabasico.execoes;

public class Exececao {
    public static void main(String[] args) {

        try {

            // bloco que é monitorado para erros
            int[] vetor = new int[4];
            System.out.println("Antes da exception");

            vetor[4] = 1;
            System.out.println("Esse texto não será impresso");
        } catch (ArrayIndexOutOfBoundsException exception) {

            // bloco para o tratamento de erro
            System.out.println("Exceção ao acessar um índice do vetor que não existe");
        }

        System.out.println("Esse texto será impreso após a exception");

        int[] numeros = { 4, 8, 16, 32, 64, 128 };
        int[] denominadores = { 2, 0, 4, 8, 0 };
        for (int i = 0; i < numeros.length; i++) {
            try {
                System.out.println(numeros[i] + "/" + denominadores[i] + " = " + (numeros[i] / denominadores[i]));
                // } catch (ArithmeticException exp) {
                // System.out.println("Erro ao dividir por zero");
                // } catch (ArrayIndexOutOfBoundsException exception) {
                // System.out.println("Tamanhos de Arrays diferente");
            } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
                System.out.println("Aconteceu um erro");
            }
        }
    }
}
