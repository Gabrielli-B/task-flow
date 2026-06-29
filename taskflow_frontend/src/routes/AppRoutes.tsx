import { BrowserRouter, Routes, Route } from "react-router-dom";
import Home  from "../pages/Home";
import Pendentes from "../pages/Pendentes";
import { Concluidas } from "../pages/Concluidas";

export function AppRoutes() {
  return (

    <BrowserRouter>
        <Routes>
            <Route path="/" element={<Home />} />
            <Route path="/Pendentes" element={<Pendentes />} />
            <Route path="/Concluidas" element={<Concluidas />} />
        </Routes>
    </BrowserRouter>
  );
}