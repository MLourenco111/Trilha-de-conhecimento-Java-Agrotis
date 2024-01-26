package agro.curso.javabasico.execoes;

public class UsandoMinhaException {
    public static void main(String[] args) {

        int[] numeros = { 4, 8, 5, 16, 32, 64, 128 };
        int[] denominadores = { 2, 0, 4, 8, 0 };
        for (int i = 0; i < numeros.length; i++) {
            try {
                if (numeros[i] % 2 != 0) {
                    throw new DivisaoNaoExata(numeros[i], denominadores[i]);
                }
                System.out.println(numeros[i] + "/" + denominadores[i] + " = " + (numeros[i] / denominadores[i]));
            } catch (ArithmeticException | ArrayIndexOutOfBoundsException | DivisaoNaoExata e) {
                System.out.println("Aconteceu um erro");
            } catch (Exception e) {
                System.out.println("Aconteceu um erro");
                System.out.println(e.getMessage());
            }
        }
    }
}
