package br.com.ada.pooii.aula02.exercicio_1.ResolucaoExercicio1;

public class Moto implements VeiculoMotorizado {

    Integer velocidade;
    Boolean ligado;

    public Moto(Integer velocidade, Boolean ligado) {
        this.velocidade = velocidade;
        this.ligado = ligado;
    }

    public Integer getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(Integer velocidade) {
        this.velocidade = velocidade;
    }

    public Boolean getLigado() {
        return ligado;
    }

    public void setLigado(Boolean ligado) {
        this.ligado = ligado;
    }

    @Override
    public void acelerar(int velocidade) {
        if (ligado) {
            this.velocidade += velocidade;
            System.out.println("Acelerando " + velocidade);
            System.out.println("Velocidade atual: " + this.velocidade);
        } else {
            System.out.println("A moto está desligada, precisa ligar antes para acelerar!");
        }
    }

    @Override
    public void frear(int velocidade) {
        if (ligado) {
            this.velocidade -= velocidade;
            System.out.println("Freando " + velocidade);
            System.out.println("Velocidade atual: " + this.velocidade);
        } else {
            System.out.println("A moto está desligada!");
        }
    }

    @Override
    public void ligar() {
        if (!ligado){
            ligado = true;
            System.out.println("Ligando moto!");
        } else {
            System.out.println("A moto já está ligada!");
        }
    }

    @Override
    public void desligar() {
        if (ligado && velocidade == 0) {
            ligado = false;
            System.out.println("Desligando moto!");
        } else if (ligado) {
            System.out.println("A velocidade precisa ser zero para desligar a moto!");
        } else {
            System.out.println("A moto já está desligada!");
        }
    }

    @Override
    public Integer getVelocidadeMaximaPermitida() {
        return 200;
    }
}
