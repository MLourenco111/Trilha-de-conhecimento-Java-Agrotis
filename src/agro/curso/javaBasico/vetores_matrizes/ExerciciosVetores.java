package agro.curso.javaBasico.vetores_matrizes;

import java.util.Random;
import java.util.Scanner;

public class ExerciciosVetores {
    static Scanner scan = new Scanner(System.in);
    static Random gerador = new Random();

    public static void main(String[] args) {
        vigesimoQuarto();
    }

    public static void primeiro() {
        int[] vetorA = new int[] { 5, 10, 15, 20, 25 }, vetorB = new int[vetorA.length];
        for (int i = 0; i < vetorA.length; i++) {
            vetorB[i] = vetorA[i];
            System.out.println("vetor B " + vetorB[i]);
        }
    }

    public static void segundo() {
        int[] vetorA = new int[] { 5, 10, 15, 20, 25, 30, 35, 40 }, vetorB = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            vetorB[i] = vetorA[i];
            vetorB[i] = vetorB[i] * 2;
            System.out.println("vetor A " + vetorA[i] + " * 2" + " = vetor B " + vetorB[i]);
        }
    }

    public static void terceiro() {
        int[] vetorA = new int[15];
        int[] vetorB = new int[vetorA.length];
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = gerador.nextInt(10);
            vetorB[i] = vetorA[i] * vetorA[i];
            System.out.println("vetor A : " + vetorA[i] + " * vetor A " + vetorA[i] + "  = vetor B " + vetorB[i]);
        }
    }

    public static void quarto() {
        int[] vetorA = new int[15];
        double[] vetorB = new double[vetorA.length];
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = gerador.nextInt(100);
            vetorB[i] = Math.sqrt(vetorA[i]);
            System.out.println("vetor A : " + vetorA[i] + " raiz quadrada do  vetor A = vetor B " + vetorB[i]);

        }

    }

    public static void quinto() {
        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = gerador.nextInt(100);
            vetorB[i] = vetorA[i] * i;
            System.out.println("vetor A : " + vetorA[i] + " * " + i + "  = vetor B " + vetorB[i]);

        }
    }

    public static void sexto() {
        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorA.length];
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = gerador.nextInt(100);
            vetorB[i] = gerador.nextInt(100);
            vetorC[i] = vetorA[i] + vetorB[i];
            System.out.println("vetor A : " + vetorA[i] + " + " + "vetor B: " + vetorB[i] + " = vetor C " + vetorC[i]);
        }
    }

    public static void setimo() {
        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorA.length];
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = gerador.nextInt(100);
            vetorB[i] = gerador.nextInt(100);
            vetorC[i] = vetorA[i] - vetorB[i];
            System.out.println("vetor A : " + vetorA[i] + " - " + "vetor B: " + vetorB[i] + " = vetor C " + vetorC[i]);

        }
    }

    public static void oitavo() {
        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorA.length];
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = gerador.nextInt(100);
            vetorB[i] = gerador.nextInt(100);
            vetorC[i] = vetorA[i] * vetorB[i];
            System.out.println("vetor A : " + vetorA[i] + " * " + "vetor B: " + vetorB[i] + " = vetor C " + vetorC[i]);
        }
    }

    public static void nono() {
        int[] vetorA = new int[10];
        double[] vetorB = new double[vetorA.length];
        double[] vetorC = new double[vetorA.length];
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = gerador.nextInt(100);
            vetorB[i] = gerador.nextDouble();

            vetorC[i] = vetorA[i] / vetorB[i];
            System.out.println("vetor A : " + vetorA[i] + " / " + "vetor B: " + vetorB[i] + " = vetor C " + vetorC[i]);

        }
    }

    public static void decimo() {
        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = gerador.nextInt(100);
            vetorB[i] = vetorA[i] % 2;
            System.out.println("vetor A : " + vetorA[i] + " % 2 = vetor B: " + vetorB[i]);
        }

    }

    public static void decimoPrimeiro() {
        int[] vetorA = new int[10];
        int contador = 0;
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = gerador.nextInt(100);
            if (vetorA[i] % 2 == 0) {
                System.out.println("números pares do vetor A : " + vetorA[i]);
                contador++;
            }
        }
        System.out.println("O vetor tem " + contador + " elementos pares");
    }

    public static void decimoSegundo() {
        int[] vetorA = new int[10];
        int soma = 0;
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = gerador.nextInt(100);
            soma += vetorA[i];
            System.out.println(vetorA[i]);
        }
        System.out.println("A soma dos elementos é " + soma);
    }

    public static void decimoTerceiro() {
        int[] vetorA = new int[10];
        int soma = 0;
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = gerador.nextInt(100);
            if (vetorA[i] % 5 == 0) {
                System.out.println("números divisiveis por 5 do vetor A : " + vetorA[i]);
                soma += vetorA[i];
            }
        }

        System.out.println("A soma dos elementos multiplos por 5 é " + soma);
    }

    public static void decimoQuarto() {
        int[] vetorA = new int[10];
        int soma = 0, media = 0, contadorImpares = 0;
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = gerador.nextInt(100);
            if (vetorA[i] % 2 == 1) {
                System.out.println(" números impares do vetor A : " + vetorA[i]);
                soma += vetorA[i];
                contadorImpares++;
            }
        }
        media = soma / contadorImpares;
        System.out.println("A média dos números ímpares é " + media);
    }

    public static void decimoQuinto() {
        int[] vetorA = new int[10];
        int contadorImpar = 0, contadorPar = 0;
        double porcentagemPar = 0, porcentagemImpar = 0;
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = gerador.nextInt(100);
            if (vetorA[i] % 2 == 0) {
                contadorPar++;
            } else {
                contadorImpar++;
            }
            System.out.println("vetor A: " + vetorA[i]);
        }

        porcentagemPar = (contadorPar * 100) / vetorA.length;
        porcentagemImpar = (contadorImpar * 100) / vetorA.length;
        System.out.println("Quantidade de números pares: " + contadorPar);
        System.out.println("Quantidade de números impares: " + contadorImpar);
        System.out.println("A % de números pares é " + porcentagemPar + "% e a % de impar é " + porcentagemImpar + " %");

    }

    public static void decimoSexto() {
        int[] vetorA = new int[10];
        int somaMenores = 0, contador = 0, media = 0, somaMaiores = 0, contadorMaiores = 0;
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = gerador.nextInt(100);
            if (vetorA[i] < 15) {
                somaMenores += vetorA[i];
            } else if (vetorA[i] == 15) {
                contador++;
            } else if (vetorA[i] > 15) {
                somaMaiores += vetorA[i];
                contadorMaiores++;
            }
        }
        media = somaMaiores / contadorMaiores;
        System.out.println("A soma dos elementos menores que 15: " + somaMenores + "\nElementos iguais a 15: " + contador
                        + "\nMédia números maiores que 15:  " + media);
    }

    public static void decimoSetimo() {
        int[] vetorA = new int[10];
        int contador = 0;
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = gerador.nextInt(100);
            if (vetorA[i] > 35) {
                contador++;
            }
        }
        System.out.println("O vetor tem " + contador + " elementos acima de 35 anos");
    }

    public static void decimoOitavo() {
        int[] vetorA = new int[10];
        int contadorMenor = 0, contadorMaior = 0, menorNumero = Integer.MAX_VALUE, maiorNumero = Integer.MIN_VALUE;
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = gerador.nextInt(100);
            if (vetorA[i] < menorNumero) {
                menorNumero = vetorA[i];
                contadorMenor = i;
            } else if (vetorA[i] > maiorNumero) {
                maiorNumero = vetorA[i];
                contadorMaior = i;
            }
            System.out.println("vetor A: " + vetorA[i]);
        }

        System.out.println("O menor número é " + menorNumero + " na posição " + contadorMenor);
        System.out.println("O maior número é " + maiorNumero + " na posição " + contadorMaior);
    }

    public static void decimoNono() {
        double[] nota1 = new double[10];
        double[] nota2 = new double[nota1.length];
        double[] result = new double[nota1.length];
        for (int i = 0; i < nota1.length; i++) {
            nota1[i] = gerador.nextInt(10);
            nota2[i] = gerador.nextInt(10);
            result[i] = (nota1[i] + nota2[i]) / 2;
            System.out.print("A média das notas " + nota1[i] + " + " + nota2[i] + " = " + result[i]);
            if (result[i] < 7) {
                System.out.println(" Reprovado");
            } else if (result[i] >= 7) {
                System.out.println(" Aprovado");
            }

        }

    }

    public static void vigesimo() {
        System.out.println("Digite a cotação do dólar em relação ao real: ");
        double dolar = scan.nextDouble();

        double[] vetorA = new double[20];
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = dolar * (i + 1);

            System.out.println("Dolar " + dolar + " x " + (i + 1) + " = " + vetorA[i]);
        }
    }

    public static void vigesimoSegundo() {
        int[] vetorA = new int[10];
        int contadorUm = 0, contadorZero = 0, porcentagemZero, porcentagemUm;
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = (int) Math.round(Math.random() * 1);
            if (vetorA[i] == 1) {
                contadorUm++;
            } else if (vetorA[i] == 0) {
                contadorZero++;
            }
            System.out.println("vetor A: " + vetorA[i]);
        }

        porcentagemZero = (contadorZero * 100) / vetorA.length;
        porcentagemUm = (contadorUm * 100) / vetorA.length;
        System.out.println("Quantidade de números 0 : " + contadorZero);
        System.out.println("Quantidade de números 1 : " + contadorUm);
        System.out.println("A % de números 0 é " + porcentagemZero + "% e a % de 1 é " + porcentagemUm + " %");

    }

    public static void vigesimoTerceiro() {
        int contador = 0;
        do {
            int[] vetorA = new int[10];
            for (int i = 0; i < vetorA.length; i++) {
                vetorA[i] = gerador.nextInt(1000);
                if (vetorA[i] % 2 == 1) {
                    continue;
                } else {
                    contador++;
                }

                System.out.println("vetor A " + vetorA[i]);
            }
        } while (contador < 10);
    }

    public static void vigesimoQuarto() {

    }

}
