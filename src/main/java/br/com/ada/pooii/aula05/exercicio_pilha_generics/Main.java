package br.com.ada.pooii.aula05.exercicio_pilha_generics;

public class Main {
    public static void main(String[] args) {

        Stack<String> minhaStack = new StackImpl<>();

        minhaStack.push("Laura");
        minhaStack.push("Bia");
        minhaStack.push("Erica");
        minhaStack.push("Paula");

        //POP
        System.out.println("-------------POP------------");
        String nome = minhaStack.pop();
        System.out.println(nome);

        nome = minhaStack.pop();
        System.out.println(nome);

        //PEEK
        System.out.println("-------------PEEK------------");
        nome = minhaStack.peek();
        System.out.println(nome);

        //IS EMPTY
        System.out.println("------------Is Empty---------");
        boolean empty = minhaStack.isEmpty();
        System.out.println(empty);
    }
}
