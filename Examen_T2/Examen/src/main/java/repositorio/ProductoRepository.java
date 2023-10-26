package repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import modelo.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Integer>{

}
