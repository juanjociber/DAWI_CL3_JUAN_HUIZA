package org.data_juanhuiza.repository;

import org.data_juanhuiza.model.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IReservaRepository 
		extends JpaRepository<Reserva, Integer> {

}
