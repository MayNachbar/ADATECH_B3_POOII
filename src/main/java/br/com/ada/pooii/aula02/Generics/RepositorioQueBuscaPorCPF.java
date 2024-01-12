package br.com.ada.pooii.aula02.Generics;

public interface RepositorioQueBuscaPorCPF<T> extends Repositorio<T> {

    T buscarPorCPF(String cpf);
}
