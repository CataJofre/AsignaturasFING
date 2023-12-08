import React, { useState } from "react";
import infoService from "../Services/InformacionService";
import "../Styles/MallaInteractiva.css";
import AsignaturaDetalle from "./AsignaturaDetalle.jsx";

const MallaInteractiva = () => {
  const [codigoCarrera, setCodigoCarrera] = useState("");
  const [asignaturas, setAsignaturas] = useState([]);
  const [asignaturaSeleccionada, setAsignaturaSeleccionada] = useState(null);
  const [detallesAsignaturas, setDetallesAsignaturas] = useState({});

  const handleCodigoCarreraChange = (e) => {
    setCodigoCarrera(e.target.value);
  };

  const handleObtenerAsignaturas = async (e) => {
    e.preventDefault();
    try {
      const response = await infoService.obtenerAsignaturas(codigoCarrera);

      if (response) {
        setAsignaturas(response);
      } else {
        console.error("La respuesta o los datos no están definidos.");
      }
    } catch (error) {
      console.error("Error al obtener asignaturas:", error);
      // Manejar el error según tus necesidades
    }
  };

  const nivelesUnicos = [
    ...new Set(asignaturas.map((asignatura) => asignatura.nivel)),
  ];

  return (
    <div>
      <h2>Malla Interactiva</h2>
      <form onSubmit={handleObtenerAsignaturas}>
        <label>Código de Carrera:</label>
        <input
          type="text"
          value={codigoCarrera}
          onChange={handleCodigoCarreraChange}
        />
        <button type="submit">Obtener Asignaturas</button>
      </form>

      {nivelesUnicos.length > 0 && (
        <div>
          <h3>Asignaturas por Nivel</h3>
          <table className="malla-table">
            <thead>
              <tr>
                {nivelesUnicos.map((nivel) => (
                  <th key={nivel}>Nivel {nivel}</th>
                ))}
              </tr>
            </thead>
            <tbody>
              <tr>
                {nivelesUnicos.map((nivel) => (
                  <td key={nivel}>
                    {asignaturas
                      .filter((asignatura) => asignatura.nivel === nivel)
                      .map((asignatura) => (
                        <div
                          key={asignatura.codigo_asignatura}
                          className="asignatura-box"
                          onClick={() => setAsignaturaSeleccionada(asignatura)}
                        >
                          {asignatura.nombre_asignatura}
                        </div>
                      ))}
                  </td>
                ))}
              </tr>
            </tbody>
          </table>
        </div>
      )}

      {asignaturaSeleccionada && (
        <AsignaturaDetalle
          asignatura={asignaturaSeleccionada}
          onClose={() => setAsignaturaSeleccionada(null)}
        />
      )}
    </div>
  );
};

export default MallaInteractiva;