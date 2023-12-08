import React from "react";

const AsignaturaDetalle = ({ asignatura, onClose }) => {
    return (
      <div className="asignatura-detalle">
        {/* Mostrar los detalles de la asignatura aquí */}
        <p>Nombre: {asignatura.nombre_asignatura}</p>
        <p>Nivel: {asignatura.nivel}</p>
        {/* Otros detalles de la asignatura */}
        <button onClick={onClose}>Cerrar</button>
      </div>
    );
  };
  
  export default AsignaturaDetalle;