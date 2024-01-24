package agro.curso.javabasico.orientacao_a_objetos.exercicios34;

public class ConversaoDeUnidadesDeTempo {
    public static double minutoParaSegundos(int minuto) {
        return minuto * 60;
    }

    public static double horaParaMinutos(int hora) {
        return hora * 60;
    }

    public static double diaParaHora(int dia) {
        return dia * 24;
    }

    public static double semanaParaDias(int semana) {
        return semana * 7;
    }

    public static double mesParaDias(int mes) {
        return mes * 30;
    }

    public static double anoParaDias(int ano) {
        return ano * 365.25;
    }

}
