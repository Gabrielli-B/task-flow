package com.gabrielli.taskflow_backend.exception;

public class ListaTarefaVaziaException extends RuntimeException {
    public ListaTarefaVaziaException() {
        super("Lista de tarefas vazia!");
    }
}
