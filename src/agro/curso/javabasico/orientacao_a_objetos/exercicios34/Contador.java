package agro.curso.javabasico.orientacao_a_objetos.exercicios34;

public class Contador {
    static int numeroEstatico = 0;

    Contador() {
        numeroEstatico++;
    }

    public int incrementar() {
        return numeroEstatico++;
    }

    public int zerar() {
        return numeroEstatico = 0;
    }
}
