package br.com.ada.pooii.aula02.exercicio_2.ResolucaoExercicio2;

public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(10.5);
        circulo.calcularArea();

        Retangulo retangulo = new Retangulo(10.2, 20.5);
        retangulo.calcularArea();

        Triangulo triangulo = new Triangulo(8.5, 10.2);
        triangulo.calcularArea();
    }
}
