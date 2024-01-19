package agro.curso.javaBasico.vetores_matrizes;

public class Vetor {

    public static void main(String[] args) {
        /*
         * Arrays
         * 
         * Estrutura de dados mais simples existente na maioria das linguagens
         * de programação.
         * 
         * Lista ordenada de dados.
         * 
         */

        double[] temperaturasAno = new double[365];

        temperaturasAno[0] = 31.3;
        temperaturasAno[1] = 31;
        temperaturasAno[2] = 30.3;
        temperaturasAno[3] = 35.9;

        for (int i = 0; i < temperaturasAno.length; i++) {
            if (temperaturasAno[i] == 0) {
                break;
            }
            System.out.println("O valor da temperado do dia " + (i + 1) + " é " + temperaturasAno[i]);
        }

        for (double temp : temperaturasAno) {
            System.out.println(temp);
        }

    }

}
