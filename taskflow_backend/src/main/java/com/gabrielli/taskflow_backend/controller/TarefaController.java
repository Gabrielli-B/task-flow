package com.gabrielli.taskflow_backend.controller;

import com.gabrielli.taskflow_backend.DTO.TarefaRequestDTO;
import com.gabrielli.taskflow_backend.DTO.TarefaResponseDTO;
import com.gabrielli.taskflow_backend.service.TarefaService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController

public class TarefaController {
    private final TarefaService tarefaService;

    public TarefaController(TarefaService tarefaService) {
        this.tarefaService = tarefaService;
    }

    @Operation(summary = "Cadastrar tarefa")
    @PostMapping
    public TarefaResponseDTO criarTarefa(@RequestBody TarefaRequestDTO tarefaRequest){return tarefaService.criarTarefa(tarefaRequest);}

    @Operation(summary = "Deletar tarefa")
    @DeleteMapping({"/{id}"})
    public void deletarTarefa(@PathVariable Long id){tarefaService.deletarTarefa(id);}

    @Operation(summary = "Mudar status tarefa")
    @PatchMapping({"/{id}"})
    public void mudarEstadoTarefa(@PathVariable Long id, @RequestBody Boolean status){tarefaService.mudarEstadoTarefa(id,status);}

    @Operation(summary = "Listar todas as tarefa")
    @GetMapping
    public List<TarefaResponseDTO> listarTodasTarefas(){return tarefaService.listarTodasTarefas();}
}
