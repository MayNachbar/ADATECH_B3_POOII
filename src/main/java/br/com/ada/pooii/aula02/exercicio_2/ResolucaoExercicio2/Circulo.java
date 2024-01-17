package br.com.ada.pooii.aula02.exercicio_2.ResolucaoExercicio2;

public class Circulo implements Shape{
    double raio;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        double areaCirculo = Math.PI * Math.pow(getRaio(), 2);
        System.out.printf("Área do Círculo: %.2f m² %n", areaCirculo);
        return areaCirculo;
    }
}
