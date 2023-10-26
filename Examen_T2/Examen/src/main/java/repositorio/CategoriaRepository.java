package repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import modelo.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer>{

}
