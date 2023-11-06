package br.com.usuarioapi.exception;

public class UsuarioException extends RuntimeException {

    public UsuarioException (String erro) {
        super(erro);
    }
}
