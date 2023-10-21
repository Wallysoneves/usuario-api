package br.com.usuarioapi.generics;

import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IResource<T, N> {

    ResponseEntity<T> criar(T entity);

    ResponseEntity<T> one(N id);

    ResponseEntity<List<T>> all(T entity);

    ResponseEntity<T> alterar(T entity) throws Exception;

    void deleteById(N id);

    void delete(T entity);
}
