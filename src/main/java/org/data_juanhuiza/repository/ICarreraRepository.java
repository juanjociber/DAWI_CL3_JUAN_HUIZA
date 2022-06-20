package org.data_juanhuiza.repository;

import org.data_juanhuiza.model.Carrera;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICarreraRepository 
		extends JpaRepository<Carrera,Integer> {
	
	
}
