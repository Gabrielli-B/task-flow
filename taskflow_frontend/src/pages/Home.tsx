import { useEffect, useState } from "react";
import { listarTarefas } from "../services/tarefaService";
import type { Tarefa } from "../type/Tarefa";



function Home() {

    const [tarefas, setTarefas] = useState<Tarefa[]>([]);

      async function carregarTarefas() {
        const dados = await listarTarefas();
        setTarefas(dados);
    }

    useEffect(() => {
        carregarTarefas();
    }, []);


    return (
        <div>
            <h1>TaskFlow</h1>

             <ul>
                {tarefas.map((tarefa) => (
                    <li key={tarefa.id}>
                        {tarefa.nome}
                    </li>
                ))}
            </ul>

        </div>
    );
}

export default Home;