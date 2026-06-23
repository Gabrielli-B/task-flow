import {api} from "./api";

export async function listarTarefas(){
    const response = await api.get("/tarefas");
    return response.data;
}


