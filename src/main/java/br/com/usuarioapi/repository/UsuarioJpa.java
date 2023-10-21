package br.com.usuarioapi.repository;

import br.com.usuarioapi.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioJpa extends JpaRepository<Usuario, Integer> {

    Optional<Usuario> findByEmailAndSenha(String nome, String senha);
}
