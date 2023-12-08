import axios from 'axios'; 

const API_URL = "http://localhost:8989/informacion";

const informacionService = {
    obtenerAsignaturas: async (codigoCarrera) => {
        try {
          const response = await axios.get(`${API_URL}/carrera/${codigoCarrera}/asignaturas`);
          return response.data;
        } catch (error) {
          throw new Error(error.response.data.message || 'Error en la solicitud');
        }
      },
    };
    export default informacionService;