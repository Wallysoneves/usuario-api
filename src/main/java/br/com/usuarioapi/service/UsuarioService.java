package br.com.usuarioapi.service;

import br.com.usuarioapi.domain.Usuario;
import br.com.usuarioapi.generics.IService;
import br.com.usuarioapi.repository.UsuarioJpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService implements IService<Usuario, Integer> {

    @Autowired
    private UsuarioJpa usuarioJpa;

    @Override
    public Usuario criar(Usuario entity) {
        return usuarioJpa.save(entity);
    }

    @Override
    public Usuario login(String email, String senha) throws Exception {
        return usuarioJpa.findByEmailAndSenha(email, senha).orElseThrow(()-> new Exception("Usuario não cadastrado, favor faça seu cadastro!"));
    }


    @Override
    public Usuario buscarPorId(Integer id) {
        return usuarioJpa.findById(id).orElse(null);
    }

    @Override
    public List<Usuario> buscarTodos() {
        return usuarioJpa.findAll();
    }

    @Override
    public Usuario alterar(Usuario entity) throws Exception {

        if (usuarioJpa.existsById(entity.getId())) {
            usuarioJpa.save(entity);
        }

        throw new Exception("Usuário não encontrado!");
    }

    @Override
    public void deleteById(Integer id) {
        usuarioJpa.deleteById(id);
    }

    @Override
    public void delete(Usuario entity) {
        usuarioJpa.delete(entity);
    }
}
