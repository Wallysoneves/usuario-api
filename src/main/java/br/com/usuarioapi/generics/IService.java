package br.com.usuarioapi.generics;

import java.util.List;

public interface IService<T,N> {

    public T criar(T entity);

    public T buscarPorId(N id);

    public List<T> buscarTodos();

    public T alterar(T entity) throws Exception;

    public void deleteById(N id);

    public void delete(T entity);
}
