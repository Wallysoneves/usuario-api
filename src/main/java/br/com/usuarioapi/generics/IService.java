package br.com.usuarioapi.generics;

import br.com.usuarioapi.exception.UsuarioException;

import java.util.List;

public interface IService<T,N> {

    public T criar(T entity);

    public T login(String email, String senha) throws UsuarioException;

    public T buscarPorId(N id);

    public List<T> buscarTodos();

    public T alterar(T entity) throws Exception;

    public void deleteById(N id);

    public void delete(T entity);
}
