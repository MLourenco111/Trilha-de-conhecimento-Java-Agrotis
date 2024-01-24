package agro.curso.javabasico.orientacao_a_objetos.exercicios34;

public class Exercicios34 {
    public static void main(String[] args) {

        // teste exercicio 1
        Contador cont = new Contador();
        System.out.println(Contador.numeroEstatico);

        cont.incrementar();
        System.out.println(Contador.numeroEstatico);

        cont.zerar();
        System.out.println(Contador.numeroEstatico);
        System.out.println("----------------");

        // teste exercicio 2

        Calculadora calc = new Calculadora();
        System.out.println(calc.somar(10, 10));
        System.out.println(calc.dividir(10, 2));
        System.out.println(calc.elevar(5, 2));
        System.out.println(calc.subtrair(10, 10));
        System.out.println(calc.fatorial(5));

    }
}
