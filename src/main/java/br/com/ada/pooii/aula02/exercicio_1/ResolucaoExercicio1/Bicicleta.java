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
        int aceleracao = 2;
        velocidade = this.velocidade + aceleracao;
    }

    @Override
    public void frear(int velocidade) {
        int aceleracao = 2;
        velocidade = this.velocidade - aceleracao;
    }
}
