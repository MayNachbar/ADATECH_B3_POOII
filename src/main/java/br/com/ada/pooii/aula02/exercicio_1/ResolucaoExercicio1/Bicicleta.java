package br.com.ada.pooii.aula02.exercicio_1.ResolucaoExercicio1;

public class Bicicleta implements Veiculo {

    Integer velocidade;

    public Bicicleta(Integer velocidade) {
        this.velocidade = velocidade;
    }

    public Integer getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(Integer velocidade) {
        this.velocidade = velocidade;
    }

    @Override
    public void acelerar(int velocidade) {
        this.velocidade += velocidade;
        System.out.println("Acelerando bicicleta " + velocidade);
        System.out.println("Velocidade atual: " + this.velocidade);
    }

    @Override
    public void frear(int velocidade) {
        this.velocidade -= velocidade;
        System.out.println("Freando bicicleta " +velocidade);
        System.out.println("Velocidade atual: " + this.velocidade);
    }
}
