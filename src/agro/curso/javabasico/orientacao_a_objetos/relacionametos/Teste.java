package agro.curso.javabasico.orientacao_a_objetos.relacionametos;

public class Teste {
    public static void main(String[] args) {

        Contato contato = new Contato();
        Endereco end = new Endereco();
        Telefone tel = new Telefone();
        Telefone tel2 = new Telefone();
        // obj endereco
        end.setCidade("Campo Largo");
        end.setEstado("Paraná");
        end.setNomeRua("Franscico Alves Mendes");
        end.setComplemento("Apto");
        end.setNumero(195);
        end.setCep("80385020");
        // obj telefone
        tel.setDdd("41");
        tel.setTelefone("99247-7204");
        tel.setTipo("celular");
        // obj telefone2
        tel2.setDdd("41");
        tel2.setTelefone("55555-5555");
        tel2.setTipo("casa");

        // atribuindo os valores para o Array
        Telefone[] telefones = new Telefone[2];
        telefones[0] = tel;
        telefones[1] = tel2;
        // obj contato
        contato.setNome("Matheus");
        contato.setEndereco(end);
        contato.setTelefones(telefones);
        System.out.println(contato.getNome());
        if (contato != null && contato.getEndereco() != null) {
            System.out.println(contato.getEndereco().getCidade());
        }

        if (contato != null && contato.getTelefones() != null) {
            for (Telefone t : contato.getTelefones()) {
                System.out.println(t.getDdd() + " " + t.getTelefone());
            }
        }

    }
}
