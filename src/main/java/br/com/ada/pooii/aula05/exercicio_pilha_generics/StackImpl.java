package br.com.ada.pooii.aula05.exercicio_pilha_generics;

import java.util.ArrayList;
import java.util.List;

public class StackImpl <E> implements Stack<E> {

    private final List<E> internList;
    public StackImpl() {
        this.internList = new ArrayList<>();
    }
    @Override
    public void push(E elemento){
        internList.add(elemento);
    }

    @Override
    public E pop() {
        if(!isEmpty())
            return internList.remove(internList.size() -1);
        return null;
    }

    @Override
    public E peek() {
        if(!isEmpty())
            return internList.get(internList.size() -1);
        return null;
    }

    @Override
    public boolean isEmpty() {
        return internList.isEmpty();
    }
}

