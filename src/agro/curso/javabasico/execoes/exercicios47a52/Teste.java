package agro.curso.javabasico.execoes.exercicios47a52;

public class Teste {

    public static void main(String[] args) {
        Contato contato = new Contato("Matheus", "41992477204");
        Contato contato1 = new Contato("Jorge", "41998757535");
        Contato contato2 = new Contato("Lucas", "41991052437");
        Agenda agenda = new Agenda();

        agenda.adicionarContato(contato, contato.getIdentificador());
        agenda.adicionarContato(contato1, contato1.getIdentificador());
        agenda.adicionarContato(contato2, contato2.getIdentificador());
        System.out.println(agenda);

    }

}
