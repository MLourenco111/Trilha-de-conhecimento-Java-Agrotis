package agro.curso.javabasico.heranca_interface_polimorfismo.exercicios36;

import java.util.Scanner;

public class Escola {
    static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        Professor professor = new Professor("Kayo", "Informatica", "kayo.kayo@kayo.com");
        Curso curso = new Curso("Ciencia da computação", "8:00", professor);
        curso.adicionar(new Aluno("matheus", 1202200055));
        curso.adicionar(new Aluno("kleber", 1202200056));
        curso.adicionar(new Aluno("leticia", 1202200057));
        curso.adicionar(new Aluno("fernanda", 1202200058));

        curso.getAlunos().forEach((aluno) -> {
            System.out.println(aluno.getNome());
            double[] notas = aluno.getNotas();
            for (int i = 0; i < notas.length; i++) {
                System.out.println("Digite a nota  " + i);
                double nota = scan.nextDouble();
                notas[i] = nota;

            }
            aluno.calcularMedia();
            System.out.println("------------");
        });

    }

    public static void mostrarResultado() {

    }

}
