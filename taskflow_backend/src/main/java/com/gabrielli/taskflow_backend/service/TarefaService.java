package com.gabrielli.taskflow_backend.service;

import com.gabrielli.taskflow_backend.DTO.TarefaRequestDTO;
import com.gabrielli.taskflow_backend.DTO.TarefaResponseDTO;
import com.gabrielli.taskflow_backend.exception.IdNaoExisteException;
import com.gabrielli.taskflow_backend.exception.ListaTarefaVaziaException;
import com.gabrielli.taskflow_backend.model.Tarefa;
import com.gabrielli.taskflow_backend.repository.TarefaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TarefaService {

    private final TarefaRepository tarefaRepository;

    public TarefaService(TarefaRepository tarefaRepository) {
        this.tarefaRepository = tarefaRepository;
    }

    public TarefaResponseDTO criarTarefa(TarefaRequestDTO tarefaRequest){
        Tarefa tarefa = new Tarefa(tarefaRequest);
        tarefaRepository.save(tarefa);
        return new TarefaResponseDTO(tarefa);
    }

    public void deletarTarefa(Long id){
        if(!tarefaRepository.existsById(id)){
            throw new IdNaoExisteException(id);
        }
        tarefaRepository.deleteById(id);
    }

    public void mudarEstadoTarefa(Long id, Boolean status){
        Tarefa tarefa = tarefaRepository.findById(id).orElseThrow(()-> new IdNaoExisteException(id));
        tarefa.setConcluida(status);
        tarefaRepository.save(tarefa);
    }

    public List<TarefaResponseDTO> listarTodasTarefas(){
        if(tarefaRepository.count() == 0){
            throw new ListaTarefaVaziaException();
        }
        return tarefaRepository.findAll()
                .stream()
                .map(TarefaResponseDTO::new)
                .toList();
    }
}
