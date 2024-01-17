package br.com.ada.pooii.aula04.generics;

import java.util.List;
import java.util.Random;

public class SorteadorGenerico<T> {

    private List<T> array;

    public SorteadorGenerico(List<T> array) {
        // prefira listas a array
        // sempre tentar eliminar os alertas
        //this.array = array;
        this.array = array;
    }

    public T escolhe() {
        // obtendo um numero randomico
        Random random = new Random();
        int numeroRandomico = random.nextInt(array.size());

        // escolhi, baseado no numero randomico, um valor no array
        T retorno = this.array.get(numeroRandomico);

        // retornei o objeto escolhido
        return retorno;
    }
}