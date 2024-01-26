package agro.curso.javabasico.heranca_interface_polimorfismo.exercicios36;

import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        boolean flagAgenda = true;
        Agenda agenda = new Agenda();
        String nomeAgenda;
        for (int i = 0; i < agenda.getContatos().length; i++) {
            if (i == 0) {
                System.out.println("Digite o nome da Agenda ");
                nomeAgenda = scan.nextLine();
                agenda.setNome(nomeAgenda);
            }
            System.out.println("Digite o nome: ");
            String nome = scan.nextLine();
            System.out.println("Digite  o telefone: ");
            String telefone = scan.nextLine();
            System.out.println("Digite  o email: ");
            String email = scan.nextLine();
            Contato contato = new Contato();
            contato.setNome(nome);
            contato.setTelefone(telefone);
            contato.setEmail(email);
            agenda.adicionarContato(contato, contato.getIdentificador());
        }

        agenda.mostrarContatoAgenda();
    }
}
