package servicio;

import java.util.List;
import modelo.Categoria;

public interface CategoriaService {
	List<Categoria> obtenerTodas();
	Categoria obtenerPorId(Integer id);
	void guardarCompra(Categoria categoria);
}
