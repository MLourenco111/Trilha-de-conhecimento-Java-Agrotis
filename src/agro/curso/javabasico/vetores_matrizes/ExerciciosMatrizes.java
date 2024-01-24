package agro.curso.javabasico.vetores_matrizes;

import java.util.Random;

public class ExerciciosMatrizes {
    static Random gerador = new Random();

    public static void main(String[] args) {
        segundo();
    }

    public static void primeiro() {
        int[][] m = new int[4][4];
        int maior = Integer.MIN_VALUE, vertical = 0, horizontal = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = gerador.nextInt(10);
                System.out.print(m[i][j] + " ");
                if (m[i][j] > maior) {
                    maior = m[i][j];
                    horizontal = i;
                    vertical = j;
                }
            }
            System.out.println();
        }

        System.out.println(
                        "O maior número está na linha  " + horizontal + " e na coluna " + vertical + " e o seu valor é " + maior);
    }

    public static void segundo() {
        int[][] m = new int[10][10];
        int maiorValorLinhaCinco = Integer.MIN_VALUE, maiorValorLinhaSete = Integer.MIN_VALUE,
                        menorValorLinhaSete = Integer.MAX_VALUE, menorValorLinhaCinco = Integer.MAX_VALUE;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = gerador.nextInt(10);
                System.out.print(m[i][j] + " ");

                if (m[4][j] > maiorValorLinhaCinco) {
                    maiorValorLinhaCinco = m[6][j];
                } else if (m[4][j] < menorValorLinhaCinco) {
                    menorValorLinhaCinco = m[6][j];
                }
                if (m[6][j] > maiorValorLinhaSete) {
                    maiorValorLinhaSete = m[6][j];
                } else if (m[6][j] < menorValorLinhaSete) {
                    menorValorLinhaSete = m[6][j];
                }
            }
            System.out.println();
        }
        System.out.println("O maior número da linha 5 é " + maiorValorLinhaCinco + " e o menor valor é " + menorValorLinhaCinco);
        System.out.println("O maior número da linha 7 é " + maiorValorLinhaSete + " e o menor valor é " + menorValorLinhaSete);
    }
}
