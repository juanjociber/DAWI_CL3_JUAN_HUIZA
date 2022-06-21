package org.data_juanhuiza.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Table(name="tb_reservas")
@Data
public class Reserva {
	@Id
	private int cod_reserva;
	
	private String nom_reserva;
	private String ape_reserva;
	
	@ManyToOne
	@JoinColumn(name="cod_carrera", insertable=false,updatable=false)
	private Carrera carrera;
	private int cod_carrera;
	
	private String fecha_reserva;
}
