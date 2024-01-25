package agro.curso.javabasico.heranca_interface_polimorfismo.interfaces.exemplobanco;

public interface SqlDDL {
    void create(String query);

    void alter(String query);

    void drop(String query);
}
