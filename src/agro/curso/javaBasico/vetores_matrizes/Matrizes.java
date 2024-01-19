package agro.curso.javaBasico.vetores_matrizes;

public class Matrizes {

    public static void main(String[] args) {
        /*
         * Matriz
         * 
         * é uma tabela de de N x M elementos ou arrays de arrays
         * 
         */

        double[][] notasAlunos = new double[2][4];

        notasAlunos[0][0] = 10;
        notasAlunos[0][1] = 7;
        notasAlunos[0][2] = 8;
        notasAlunos[0][3] = 9.5;

        notasAlunos[1][0] = 9.5;
        notasAlunos[1][1] = 1;
        notasAlunos[1][2] = 7;
        notasAlunos[1][3] = 5;
        // iteração de matrizes
        for (int i = 0; i < notasAlunos.length; i++) {
            for (int j = 0; j < notasAlunos[i].length; j++) {
                System.out.println(notasAlunos[i][j] + " ");

            }
            System.out.println();
        }

        // mundança de valores na matriz
        notasAlunos[1][3] = 8;
        for (int i = 0; i < notasAlunos.length; i++) {
            for (int j = 0; j < notasAlunos[i].length; j++) {
                System.out.println(notasAlunos[i][j] + " ");

            }
            System.out.println();
        }

        System.out.println("Calculando a média: de cada aluno: ");

        for (int i = 0; i < notasAlunos.length; i++) {
            double soma = 0;
            for (int j = 0; j < notasAlunos[i].length; j++) {

                soma += notasAlunos[i][j];
            }

            System.out.println("Média do aluno " + i + " é " + (soma / 4));
        }

    }

}
