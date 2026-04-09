package com.gabrielli.taskflow_backend.model;


import com.gabrielli.taskflow_backend.DTO.TarefaRequestDTO;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "tarefas")
@Entity
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(of = "id")

public class Tarefa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private String nomeTarefa;
    private String descricao;

    @Column(nullable = false)//coluna não pode receber valor nulo do banco
    private Boolean concluida;


    public Tarefa(TarefaRequestDTO tarefaResquest){
        this.nomeTarefa = tarefaResquest.nome();
        this.descricao=tarefaResquest.descricao();
        this.concluida = false;
    }

}
