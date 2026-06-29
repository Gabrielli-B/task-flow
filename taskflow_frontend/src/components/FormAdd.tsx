
type FormAddProps = {
    onFechar: () => void;
}

export function FormAdd({onFechar}: FormAddProps) {
    return(
        <div className="form-add">
            <h2>Nova Tarefa</h2>

            <form>
                <input type="text"
                       placeholder = "Nome"/>

                    
                <label>Descrição</label>
                <textarea placeholder="Descreva a Terefa..."></textarea>

                <button type="submit">Salvar</button>

                <button type="button" onClick={onFechar}>
                    Cancelar
                </button>

            </form>
        </div>
    );
}