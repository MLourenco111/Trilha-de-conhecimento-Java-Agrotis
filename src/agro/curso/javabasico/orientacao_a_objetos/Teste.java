package agro.curso.javabasico.orientacao_a_objetos;

public class Teste {

    public static void main(String[] args) {

        // esta forma de atribuir valores não é utilizado somente em formato
        // academico
        Carro van = new Carro();
        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.quantidadePassageiros = 10;
        van.capacidadeCombustivel = 100;
        van.consumoCombustivel = 0.2;
        van.setCor("vermelho");

        System.out.println(van.marca);
        System.out.println(van.modelo);
        System.out.println(van.getCor());
        van.exibirAutonomia();
        double autonomia = van.obterAutonomia();
        System.out.println(autonomia);
        int km = 10;
        System.out.println("A quantidade de combustivel necessário para andar " + km + " km é " + van.calcularCombustivel(km));

        Carro fusca = new Carro();
        fusca.marca = "Volkswagen";
        fusca.modelo = "Fusca";
        fusca.quantidadePassageiros = 4;
        fusca.capacidadeCombustivel = 30;
        fusca.consumoCombustivel = 0.15;

        System.out.println(fusca.marca);
        System.out.println(fusca.modelo);
        fusca.exibirAutonomia();
        autonomia = fusca.obterAutonomia();
        System.out.println(autonomia);
        km = 15;
        System.out.println("A quantidade de combustivel necessário para andar " + km + " km é " + fusca.calcularCombustivel(km));
        System.out.println("-------------");
        Carro corolla = new Carro("Corolla Cross", "Toyota", 4);
        System.out.println(corolla.modelo);
        System.out.println(corolla.marca);

        System.out.println("-------------------");

        Calculadora calc = new Calculadora();
        System.out.println(calc.soma(10, 20, 30));

        // metodos static
        System.out.println(Calculadora.soma(1, 1));
        System.out.println(Calculadora.soma(1.1, 1.1));
        // metodo recursivo
        System.out.println(Calculadora.fatorial(5));

        System.out.println("------------------------------");

    }

}
