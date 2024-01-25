package agro.curso.javabasico.heranca_interface_polimorfismo.interfaces.exemplobanco;

public interface BancoDados extends SqlDCL, SqlDDL, SqlDML {
    void abrirConexao();

    void fecharConexao();
}
