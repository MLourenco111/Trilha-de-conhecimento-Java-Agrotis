package agro.curso.javabasico.heranca_interface_polimorfismo.exercicios44a46;

public class Quadrado extends Figura2D implements DimensaoSuperficial {
    private double area, comprimento;

    @Override
    public void calcularArea() {
        area = Math.pow(comprimento, 2);

    }

}
