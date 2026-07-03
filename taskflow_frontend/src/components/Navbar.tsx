import { Link } from "react-router-dom";
import "./Navbar.css";


type NavbarProps = {
    onAdicionar: () => void;
}

export function Navbar({ onAdicionar }: NavbarProps) {

return (
    <header className="navbar">
        <h1>Task Flow</h1>

        <nav>
            <Link to = "/Home" className="page-home">
                Todas
            </Link>

            <Link to="/Pendentes" className="page-pendentes">
                Pendentes
            </Link>

            <Link to = "/Concluidas" className="page-concluidas">
                Concluídas
            </Link>
        </nav>

        <button type="button" onClick={onAdicionar}> + Nova Tarefa</button>

    </header>

    );
}
