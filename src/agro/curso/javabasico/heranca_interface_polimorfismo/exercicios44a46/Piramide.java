package agro.curso.javabasico.heranca_interface_polimorfismo.exercicios44a46;

public class Piramide extends Figura3D implements DimensaoSuperficial, DimensaoVolumetrica {
    double area, areaBase, perimetro, arestaLateral, volume, altura;

    @Override
    public void calcularArea() {
        area = areaBase + 0 * 5 * perimetro * arestaLateral;
    }

    @Override
    public void calcularVolume() {
        volume = 0.33 * areaBase * altura;

    }

}
