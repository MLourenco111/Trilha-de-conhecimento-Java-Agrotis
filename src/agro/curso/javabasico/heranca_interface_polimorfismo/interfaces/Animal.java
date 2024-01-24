package agro.curso.javabasico.heranca_interface_polimorfismo.interfaces;

public abstract class Animal {
    private String nome;

    public abstract void emitirSom();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
