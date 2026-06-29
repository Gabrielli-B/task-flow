import {api} from "./api";


//listar tarefas
export async function listarTarefas(){
    const response = await api.get("/tarefas");
    return response.data;
}


//criar tarefa
export async function criarTarefa(
    nome:string, 
    descricao:string
){
    const response = await api.post("/tarefas",{ 
        nome, 
        descricao 
    });
    return response.data;
}


//excluir tarefa
export async function excluirTarefa(id: number) {
    await api.delete(`/tarefas/${id}`);
}


//atualizar tarefa
export async function atualizarTarefa(
    id: number,
    nome: string,
    descricao: string
) {
    const response = await api.put(`/tarefas/${id}`, {
        nome,
        descricao
    });

    return response.data;
}



//mudar status da tarefa
export async function mudarStatus(
    id: number,
    status: boolean
) {
    await api.patch(`/tarefas/${id}`, status);
}