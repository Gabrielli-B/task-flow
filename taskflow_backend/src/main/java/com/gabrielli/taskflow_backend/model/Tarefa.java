package com.gabrielli.taskflow_backend.model;


import jakarta.persistence.*;
import lombok.EqualsAndHashCode;

@Table(name = "tarefas")
@Entity
@EqualsAndHashCode(of = "id")

public class Tarefa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private String nomeTarefa;
    private String descricao;
    private Boolean concluida;



}
