package agro.curso.javabasico.orientacao_a_objetos.exercicios27;

public class Lampada {
    String modelo;
    String cor;
    String tensao;
    String marca;
    int potencia;
    int durabilidade;
    int economiaDeEnergia;
    int garantiaMeses;
    boolean estado;

    boolean ligar() {
        return estado = true;
    }

    boolean desligar() {
        return estado = false;
    }

}
