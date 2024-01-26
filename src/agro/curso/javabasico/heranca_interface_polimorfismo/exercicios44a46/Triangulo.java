package agro.curso.javabasico.heranca_interface_polimorfismo.exercicios44a46;

public class Triangulo extends Figura2D implements DimensaoSuperficial {
    double area;
    double base;
    double altura;

    @Override
    public void calcularArea() {
        area = 0 * 5 * base * altura;
    }

}
