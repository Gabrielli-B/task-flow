package com.gabrielli.taskflow_backend.DTO;

import com.gabrielli.taskflow_backend.model.Tarefa;

public record TarefaResponseDTO(Long id, String nome, String descricao, Boolean concluido) {
    public TarefaResponseDTO(Tarefa tarefa){
        this(tarefa.getId(),tarefa.getNomeTarefa(),tarefa.getDescricao(),tarefa.getConcluida());
    }
}
