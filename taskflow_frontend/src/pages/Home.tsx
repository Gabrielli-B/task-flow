import { useEffect, useState } from "react";
import { listarTarefas } from "../services/tarefaService";
import type { Tarefa } from "../type/Tarefa";
import { Navbar } from "../components/Navbar";
import { FormAdd } from "../components/FormAdd";



function Home() {

    const [tarefas, setTarefas] = useState<Tarefa[]>([]);
    const [mostrarFormulario, setMostrarFormulario] = useState(false);
    
      async function carregarTarefas() {
        const dados = await listarTarefas();
        setTarefas(dados);
    }

    useEffect(() => {
        carregarTarefas();
    }, []);


    return (
        <>

        <Navbar
            onAdicionar={() => setMostrarFormulario(true)}
        />

        {mostrarFormulario &&(
            <FormAdd
                onFechar={() => setMostrarFormulario(false)}
            />
        )}

        <div>

             <ul>
                {tarefas.map((tarefa) => (
                    <li key={tarefa.id}>
                        {tarefa.nome}
                        {tarefa.concluida ? " (Concluída)" : " (Pendente)"}
                        {tarefa.descricao}
                        {tarefa.id}
                    </li>
                ))}
            </ul>

        </div>
    
    </>
    );
}
    

export default Home;