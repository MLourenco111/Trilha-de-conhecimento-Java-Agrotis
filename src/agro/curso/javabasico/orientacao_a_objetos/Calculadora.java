package agro.curso.javabasico.orientacao_a_objetos;

public class Calculadora {

    // sobrecarga de metodos
    public static int soma(int num1, int num2) {
        return num1 + num2;
    }

    public static double soma(double num1, double num2) {
        return num1 + num2;
    }

    public int soma(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public int soma(int[] vetorInteiros) {
        int total = 0;
        for (int i = 0; i < vetorInteiros.length; i++) {
            total += vetorInteiros[i];
        }
        return total;
    }

    // metodo recursivo
    // A recursividade é usada quando o metodo chama ele mesmo
    // precisa de um ponto de parada para não ter um looping infinito

    public static int fatorial(int num) {
        if (num == 0) {
            return 1;
        }
        return num * fatorial(num - 1);
    }
}
