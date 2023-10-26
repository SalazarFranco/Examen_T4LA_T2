package servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import modelo.Categoria;
import repositorio.CategoriaRepository;

@Service
public class CategoriaServiceImpl implements CategoriaService{

	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@Override
	public List<Categoria> obtenerTodas() {
		return categoriaRepository.findAll();
	}
	
	@Override
	public Categoria obtenerPorId(Integer id) {
		return categoriaRepository.findById(id).orElse(null);
	}
	
	@Override
	public void guardarCompra(Categoria categoria) {
		 categoriaRepository.save(categoria);
	}

}
