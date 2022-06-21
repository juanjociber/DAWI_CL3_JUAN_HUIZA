package org.data_juanhuiza.controller;

import org.data_juanhuiza.model.Reserva;
import org.data_juanhuiza.repository.ICarreraRepository;
import org.data_juanhuiza.repository.IReservaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ReservaController {
	
	@Autowired
	private ICarreraRepository repoCarrera;
	
	@Autowired
	private IReservaRepository repoReserva;
	
	@GetMapping("/reserva/cargar")
	public String cargaReserva(Model model) {
		model.addAttribute("reserva", new Reserva());
		model.addAttribute("lstCarreras",repoCarrera.findAll());
		return "reservaApellido";
	}
	
	@PostMapping("/reserva/grabar")
	public String grabaReserva(@ModelAttribute Reserva reserva,Model model) {
		System.out.println(reserva);
		model.addAttribute("lstCarreras",repoCarrera.findAll());
		try {
			repoReserva.save(reserva);
			model.addAttribute("success","Proceso realizado con éxito");
		}catch(Exception e){
			model.addAttribute("error","Error al registrar una reserva");
		}
		return "reservaApellido";
	}
	
	@GetMapping("/reserva/listar")
	public String listarReserva(Model model) {
		model.addAttribute("lstProductos",repoReserva.findAll());
		return "listado";
	}
}
