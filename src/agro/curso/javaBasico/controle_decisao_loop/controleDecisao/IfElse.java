package agro.curso.javaBasico.controle_decisao_loop.controleDecisao;

import java.util.Scanner;

public class IfElse {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite sua idade");

        int idade = scan.nextInt();

        // estrutura básica de if else

        if (idade >= 18) {
            System.out.println("É maior de idade");
        } else {
            System.out.println("Não é maior de idade.");
        }

        // If Else aninhado

        System.out.println("Digite o valor do produto: ");

        double valor = scan.nextDouble();

        if (valor <= 10) {
            System.out.println("Está barato, pode comprar");
        } else if (valor > 10 && valor < 15) {
            System.out.println("Você pode pedir um desconto");
        } else if (valor >= 15 && valor < 17) {
            System.out.println("Pode pesquisar mais");
        } else {
            System.out.println("Está muito caro.");
        }

    }
}
