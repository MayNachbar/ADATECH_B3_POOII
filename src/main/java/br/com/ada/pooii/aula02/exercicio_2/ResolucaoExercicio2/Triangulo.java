package br.com.ada.pooii.aula02.exercicio_2.ResolucaoExercicio2;

public class Triangulo implements Shape{
    double base;
    double altura;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        double areaTriangulo = ( base * altura ) / 2.0;
        System.out.printf("Área do Triângulo: %.2f m² %n", areaTriangulo);
        return areaTriangulo;
    }
}
