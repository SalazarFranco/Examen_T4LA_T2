package servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import modelo.Producto;
import repositorio.ProductoRepository;

@Service
public class ProductoServiceImpl implements ProductoService{
	
	@Autowired
	private ProductoRepository productoRepository;
	
	@Override
	public List<Producto> obtenerTodos() {		
		return productoRepository.findAll();
	}
	
	@Override
	public Producto obtenerPorId(Integer id) {
		return productoRepository.findById(id).orElse(null);
	}
	
	@Override
	public void guardarProducto(Producto producto) {
		productoRepository.save(producto);
	}
}
