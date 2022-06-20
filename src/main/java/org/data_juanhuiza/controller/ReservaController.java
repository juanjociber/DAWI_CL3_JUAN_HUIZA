package org.data_juanhuiza.controller;

import org.data_juanhuiza.model.Reserva;
import org.data_juanhuiza.repository.ICarreraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class ReservaController {
	
	@Autowired
	private ICarreraRepository repoCarrera;
	
	@GetMapping("reserva/cargar")
	public String cargaReserva(Model model) {
		model.addAttribute("reserva", new Reserva());
		model.addAttribute("lstCarreras",repoCarrera.findAll());
		return "reservaApellido";
	}
	
	@GetMapping("reserva/grabar")
	public String grabaReserva(@ModelAttribute Reserva reserva) {
		System.out.println(reserva);
		return "reservaApellido";
	}
}
