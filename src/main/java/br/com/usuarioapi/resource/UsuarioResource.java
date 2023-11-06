package br.com.usuarioapi.resource;

import br.com.usuarioapi.domain.Usuario;
import br.com.usuarioapi.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(name = "/usuarios")
public class UsuarioResource {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("cadastrar")
    public ResponseEntity<Usuario> criar(@RequestBody Usuario entity) {
        return new ResponseEntity<>(usuarioService.criar(entity), HttpStatus.OK);
    }

    @GetMapping("/login")
    public ResponseEntity<Usuario> login(@RequestParam("email") String email, @RequestParam("senha") String senha) {

        return new ResponseEntity<>(usuarioService.login(email, senha), HttpStatus.OK);
    }

    @GetMapping(name = "/todos-usuarios")
    public ResponseEntity<List<Usuario>> all() {
        return new ResponseEntity<>(usuarioService.buscarTodos(), HttpStatus.OK);
    }

    @GetMapping("/um")
    public ResponseEntity<Usuario> one(@RequestParam("id") Integer id) {
        return new ResponseEntity<>(usuarioService.buscarPorId(id), HttpStatus.OK);
    }

    @PutMapping("alterar-usuario")
    public ResponseEntity<Usuario> alterar(@RequestBody Usuario entity) throws Exception {
        return new ResponseEntity<>(usuarioService.alterar(entity), HttpStatus.OK);
    }

    @DeleteMapping("/deletar-por-id")
    public void deleteById(@RequestParam("id") Integer id) {
        usuarioService.deleteById(id);
    }

    @DeleteMapping("deletar")
    public void delete(@RequestBody Usuario entity) {
        usuarioService.delete(entity);
    }
}
