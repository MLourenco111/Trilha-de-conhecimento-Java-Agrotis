package agro.curso.javabasico.heranca_interface_polimorfismo.exercicios36;

public class Contato {
    private static int contador = 0;

    protected String nome;
    private String telefone;
    private int identificador;
    private String email;

    public Contato() {
        this.identificador = Contato.contador;
        contador++;
    }

    public Contato(String nome, String telefone) {
        super();
        this.nome = nome;
        this.telefone = telefone;
        this.identificador = Contato.contador;
        contador++;
    }

    public static int getContador() {
        return contador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public static void setContador(int contador) {
        Contato.contador = contador;
    }

    @Override
    public String toString() {
        return "Contato [nome=" + nome + ", telefone=" + telefone + ", email=" + email + "]";
    }

}
