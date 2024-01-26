package agro.curso.javabasico.heranca_interface_polimorfismo.exercicios44a46;

public class Cilindro extends Figura3D implements DimensaoSuperficial, DimensaoVolumetrica {
    private double raio;
    private double altura;
    private double area;
    private double volume;

    @Override
    public void calcularArea() {
        area = 2 * Math.PI * (raio * raio) + 2 + 2 * Math.PI * raio * altura;
    }

    @Override
    public void calcularVolume() {
        volume = Math.PI * (raio * raio) * altura;

    }

}
