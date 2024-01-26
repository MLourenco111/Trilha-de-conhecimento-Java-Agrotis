package agro.curso.javabasico.heranca_interface_polimorfismo.exercicios44a46;

public class Circulo extends Figura2D implements DimensaoSuperficial {
    private double area;
    private double raio;

    @Override
    public void calcularArea() {
        area = Math.PI * (raio * raio);
    }

}
