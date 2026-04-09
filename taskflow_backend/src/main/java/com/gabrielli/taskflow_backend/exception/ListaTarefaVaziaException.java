package com.gabrielli.taskflow_backend.exception;

public class ListaTarefaVaziaException extends RuntimeException {
    public ListaTarefaVaziaException(String mensagem) {
        super(mensagem);
    }
}
