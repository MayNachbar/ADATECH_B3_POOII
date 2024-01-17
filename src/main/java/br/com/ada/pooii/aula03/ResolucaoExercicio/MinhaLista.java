package br.com.ada.pooii.aula03.ResolucaoExercicio;

import java.util.ArrayList;
import java.util.List;

public class MinhaLista<T extends ObjetoComId<U>, U> {

    private final List<T> lista = new ArrayList<>();

    public void adicionar(T entidade) { //Adiciona um elemento à lista.
         this.lista.add(entidade);
    }

    public T obter(int indice){
        if (indice >= 0 && indice < lista.size()) {
            return this.lista.get(indice);
        } else {
            throw new IndexOutOfBoundsException("Índice fora dos limites da lista");
        }
    }

    public int indice(U identificador) {
        for (int i = 0; i < this.lista.size(); i++) {
             T elemento = this.lista.get(i);

             boolean isIgual = elemento.getId().equals(identificador);
             if (isIgual) {
                 return i;
             }
        }
        return -1;
    }

    public boolean contem(T elemento) {

        for (T item : lista) {
              if (item.equals(elemento)) {
                  return true;
              }
        }
        return false;
    }
}
