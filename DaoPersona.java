package modelo.persistencia.interfaces;

import java.util.List;

import modelo.entidad.Persona;

public interface DaoPersona {

		public boolean alta(Persona p);
		public boolean baja(int id);
		public Persona obtener(int id);
		public List<Persona> listar();
	
}
