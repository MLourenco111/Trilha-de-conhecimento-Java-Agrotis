package agro.curso.javabasico.orientacao_a_objetos.exercicios34;

public class ConversaoDeUnidadesDeArea {
    public static double metroQuadradoParaPesQuadrados(int metroQuadrado) {
        return metroQuadrado * 10.76;
    }

    public static double peQuadradoParaCentimetrosQuadrados(int peQuadrado) {
        return peQuadrado * 929;
    }

    public static double milhaQuadradaParaAcress(int milhaQuadrada) {
        return milhaQuadrada * 640;
    }

    public static double acreParapesQuadrados(int pesQuadrados) {
        return pesQuadrados * 43.560;
    }

}
