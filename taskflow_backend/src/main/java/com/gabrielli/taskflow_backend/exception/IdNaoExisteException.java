package com.gabrielli.taskflow_backend.exception;

public class IdNaoExisteException extends RuntimeException {
    public IdNaoExisteException(long id) {
        super(id + " não existe");
    }
}
