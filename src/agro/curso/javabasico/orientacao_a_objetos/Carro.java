package agro.curso.javabasico.orientacao_a_objetos;

public class Carro {

    /*
     * Uma classe é uma entidade abstraida do mundo real para o virtual, servido
     * de molde.
     * 
     * atributos são caracteristicas que essa entidade pode ter.
     * 
     * Para atribuir valores a estas caracteristicas precisamos instanciar e dar
     * vida para classe, é chamado de objeto.
     */
    String modelo;
    String marca;
    private String cor;
    int quantidadePassageiros;
    double capacidadeCombustivel;
    double consumoCombustivel;

    /*
     * Construtor é um método de inicialização que serve para reservar espaço na
     * memoria
     * 
     * Toda classe já tem um construtor vazio por padrão
     * 
     * É possivel ter parametros no construtor
     * 
     * 
     */
    Carro() {

    }

    Carro(String modelo, String marca, int quantidadePassageiros) {
        // This serve para referenciar atributos e métodos da própria classe
        this.modelo = modelo;
        this.marca = marca;
        this.quantidadePassageiros = quantidadePassageiros;
    }

    /*
     * metodos são ações ou comportamentos que a classe pode fazer ou ter
     * 
     * Esses metodos podem ser tanto simples ( sem paramentro / sem retorno) ou
     * complexo ( com paramentros / com retorno)
     * 
     * No inicio é sempre declarado o tipo do retorno
     * 
     * OBS: o metodo começa com verbos por boas praticas, metodos sem retorno é
     * declarado como void
     * 
     */
    // Metodo sem retorno
    void exibirAutonomia() {
        System.out.println("A autonomia do carro é: " + this.capacidadeCombustivel * this.consumoCombustivel);
    }

    // Metodo c om retorno
    double obterAutonomia() {
        return this.capacidadeCombustivel * this.consumoCombustivel;
    }

    // Metodo com parametro

    protected double calcularCombustivel(int km) {
        double quantidadeCombustivel = km / this.consumoCombustivel;
        return quantidadeCombustivel;
    }

    /*
     * Encapsulamento
     * 
     * Métodos get and set
     * 
     * Para ter mais uma segurança e controle é utilizado metodos get and set
     * para atribuir e usar valores
     * 
     */

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    /*
     * Modificadores de visibilidade
     * 
     * public todas as classes podem ver
     * 
     * private somente a propria classe pode ver
     * 
     * protected
     * 
     */

}
