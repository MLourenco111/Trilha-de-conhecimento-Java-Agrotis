package agro.curso.javabasico.heranca_interface_polimorfismo.exercicios44a46;

public class Cubo extends Figura3D implements DimensaoSuperficial, DimensaoVolumetrica {
    private double area;
    private double comprimento;
    private double volume;

    @Override
    public void calcularArea() {
        area = 6 * Math.pow(comprimento, 2);

    }

    @Override
    public void calcularVolume() {
        volume = comprimento * comprimento * comprimento;

    }

}
