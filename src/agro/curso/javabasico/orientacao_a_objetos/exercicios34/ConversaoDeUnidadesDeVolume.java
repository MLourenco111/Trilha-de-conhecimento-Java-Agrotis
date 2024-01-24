package agro.curso.javabasico.orientacao_a_objetos.exercicios34;

public class ConversaoDeUnidadesDeVolume {
    public static double litroParaCentimetrosCubicos(int litro) {
        return litro * 1000;
    }

    public static double metroCubicoParaLitros(int metroCubico) {
        return metroCubico * 1000;
    }

    public static double metroCubicoParaPesCubicos(int metroCubico) {
        return metroCubico * 35.32;
    }

    public static double galaoAmericadoParaPolegadasCubicas(int galaoAmericano) {
        return galaoAmericano * 231;
    }

    public static double galaoAmericadoParaLitros(int galaoAmericano) {
        return galaoAmericano * 3.785;
    }

}
