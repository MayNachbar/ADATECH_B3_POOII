package br.com.ada.pooii.aula02.exercicio_2.ResolucaoExercicio2;

public class Retangulo implements Shape{
    double ladoA;
    double ladoB;

    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    public Retangulo(double ladoA, double ladoB) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }

    @Override
    public double calcularArea() {
        double areaRetangulo = getLadoA() * getLadoB();
        System.out.printf("Área do Retângulo: %.2f m² %n", areaRetangulo);
        return areaRetangulo;
    }
}
