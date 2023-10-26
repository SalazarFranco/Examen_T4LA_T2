package servicio;

import java.util.List;
import modelo.Producto;

public interface ProductoService {
	List<Producto> obtenerTodos();
	 Producto obtenerPorId(Integer id);
	 void guardarProducto(Producto producto);

}
