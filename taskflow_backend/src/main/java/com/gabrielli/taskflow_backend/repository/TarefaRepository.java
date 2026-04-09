package com.gabrielli.taskflow_backend.repository;

import com.gabrielli.taskflow_backend.model.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TarefaRepository extends JpaRepository<Tarefa,Long> {

    List<Tarefa> findByConcluidaTrue();
    List<Tarefa> findByConcluidaFalse();
}
