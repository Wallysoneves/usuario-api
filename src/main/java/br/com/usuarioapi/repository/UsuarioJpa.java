package br.com.usuarioapi.repository;

import br.com.usuarioapi.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioJpa extends JpaRepository<Usuario, Integer> {
}
