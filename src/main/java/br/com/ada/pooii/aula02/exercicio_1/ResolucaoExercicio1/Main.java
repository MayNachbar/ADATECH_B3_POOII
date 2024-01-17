package br.com.ada.pooii.aula02.exercicio_1.ResolucaoExercicio1;

public class Main {
    public static void main(String[] args) {
        // Exercicio 1:
        Carro carro1 = new Carro(10, true);
        System.out.println("O carro está ligado? " + carro1.getLigado());
        System.out.println("Velocidade do carro: " + carro1.getVelocidade());

        carro1.acelerar(20);
        carro1.frear(20);
        carro1.desligar();
        carro1.frear(10);
        carro1.desligar();

        System.out.println("Velocidade máxima permitida do carro: " + carro1.getVelocidadeMaximaPermitida());

        System.out.println("---------------------------------------------------------");

        Moto moto1 = new Moto(0, false);
        System.out.println("A moto está ligada? " + moto1.getLigado());
        System.out.println("Velocidade da moto: " + moto1.getVelocidade());

        moto1.acelerar(10);
        moto1.ligar();
        moto1.acelerar(10);
        moto1.frear(5);
        moto1.desligar();
        moto1.frear(5);
        moto1.desligar();

        System.out.println("Velocidade máxima permitida da moto: " + moto1.getVelocidadeMaximaPermitida());

        System.out.println("---------------------------------------------------------");

        Bicicleta bike1 = new Bicicleta(20);
        System.out.println("Velocidade da bicicleta: " + bike1.getVelocidade());

        bike1.acelerar(10);
        bike1.frear(5);
    }
}
