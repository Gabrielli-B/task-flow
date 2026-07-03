import "./FormAdd.css";

type FormAddProps = {
    onFechar: () => void;
}

export function FormAdd({onFechar}: FormAddProps) {
    return(
        <div className="form-add">
            <h2>Nova Tarefa</h2>

            <form>
                <label>Nome</label>
                <input type="text"
                       placeholder = "Nome"/>

                    
                <label>Descrição</label>
                <textarea placeholder="Descreva a Terefa..."></textarea>

                <button className="btn-salvar" type="submit">Salvar</button>

                <button type="button" onClick={onFechar}>
                    Cancelar
                </button>

            </form>
        </div>
    );
}