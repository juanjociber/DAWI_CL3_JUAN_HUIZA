package org.data_juanhuiza.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Table(name="tb_carreras")
@Data
public class Carrera {
	@Id
	private int cod_carrera;
	
	private String des_carrera;

}
