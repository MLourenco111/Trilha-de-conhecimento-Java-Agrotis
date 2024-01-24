package agro.curso.javabasico.orientacao_a_objetos.exercicios34;

public class Calculadora {
    public double somar(double num1, double num2) {
        return num1 + num2;
    }

    public double subtrair(double num1, double num2) {
        return num1 - num2;
    }

    public double dividir(double num1, double num2) {
        return num1 / num2;
    }

    public double elevar(double num1, int num2) {
        return Math.pow(num1, num2);
    }

    public int fatorial(int num) {
        if (num == 0) {
            return 1;
        }
        return num * fatorial(num - 1);

    }
}
