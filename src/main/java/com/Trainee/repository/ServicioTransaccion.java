package com.Trainee.repository;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.Trainee.model.transaccionfinal;



public interface ServicioTransaccion extends JpaRepository<transaccionfinal, Integer>{
	
	@Query("SELECT u FROM transaccionfinal u WHERE u.id_banco = ?1")
	List<transaccionfinal> findUserByStatus(Integer id_banco);
	
	@Query("SELECT u FROM transaccionfinal u WHERE u.id_proveedor = ?1")
	List<transaccionfinal> findByProveedores(Integer id_proveedor);
	
	
}
