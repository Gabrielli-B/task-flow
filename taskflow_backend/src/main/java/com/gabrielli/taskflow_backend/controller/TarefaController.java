package com.gabrielli.taskflow_backend.controller;

import com.gabrielli.taskflow_backend.DTO.TarefaRequestDTO;
import com.gabrielli.taskflow_backend.DTO.TarefaResponseDTO;
import com.gabrielli.taskflow_backend.service.TarefaService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/tarefas")

public class TarefaController {
    private final TarefaService tarefaService;

    public TarefaController(TarefaService tarefaService) {
        this.tarefaService = tarefaService;
    }

    @Operation(summary = "Cadastrar tarefa")
    @PostMapping
    public ResponseEntity<TarefaResponseDTO> criarTarefa(@RequestBody TarefaRequestDTO tarefaRequest){
        TarefaResponseDTO tarefa = tarefaService.criarTarefa(tarefaRequest);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(tarefa);
    }

    @Operation(summary = "Deletar tarefa")
    @DeleteMapping({"/{id}"})
    public ResponseEntity<Void> deletarTarefa(@PathVariable Long id){
        tarefaService.deletarTarefa(id);

        return ResponseEntity.noContent().build();
    }

    @Operation(summary = "Mudar status tarefa")
    @PatchMapping({"/{id}"})
    public  ResponseEntity<Void> mudarEstadoTarefa(@PathVariable Long id, @RequestBody Boolean status){
        tarefaService.mudarEstadoTarefa(id, status);

        return ResponseEntity.ok().build();
    }

    @Operation(summary = "Listar todas as tarefa")
    @GetMapping
    public ResponseEntity<List<TarefaResponseDTO>> listarTodasTarefas(){
        return ResponseEntity.ok(
                tarefaService.listarTodasTarefas()
        );
    }

    @Operation(summary = "Listar todas as tarefa concluídas")
    @GetMapping("/tarefasConcluidas")
    public ResponseEntity<List<TarefaResponseDTO>> listarTarefasConcluidas(){
        return ResponseEntity.ok(
                tarefaService.listarTarefasConcluidas()
        );
    }

    @Operation(summary = "Listar todas as tarefa pendentes")
    @GetMapping("/tarefasPendentes")
    public ResponseEntity<List<TarefaResponseDTO>> listarTarefasPendentes(){
        return ResponseEntity.ok(
                tarefaService.listarTarefasPendentes()
        );
    }

    @Operation(summary = "Atualizar tarefa")
    @PutMapping("/{id}")
    public ResponseEntity<TarefaResponseDTO> atualizarTarefa(@PathVariable Long id, @RequestBody TarefaRequestDTO tarefaRequest){
        TarefaResponseDTO tarefaAtualizada = tarefaService.atualizarTarefa(id, tarefaRequest);
        return ResponseEntity.ok(tarefaAtualizada);
    }
}
