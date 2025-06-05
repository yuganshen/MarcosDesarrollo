package com.example.demoNuevo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
@Controller
public class ControllerCliente {
	@GetMapping("/")
	public String iniciar() {
		return "Reserv";
	}
	@PostMapping("/registrar")
	public String registrar(DtoCliente dto) {
		System.out.println("registrar");
		System.out.println("Nombre: "+ dto.getNombre());
		System.out.println("Apellidos: " + dto.getApellidos());
		System.out.println("Email: "+ dto.getEmail());
		System.out.println("Telefono" + dto.getTelefono());
		System.out.println("Numero Targeta: "+ dto.getNumTargeta());
		System.out.println("Nombre Titular" + dto.getNomTitular());
		System.out.println("fecha caducidad: " + dto.getFecha());
		System.out.println("CVV: "+ dto.getCvv());
		System.out.println("Terminos: "+ dto.getTerminos());
		return "Reserv";
	}
	@PostMapping("/contactar")
	public String contactar(DtoContactar dto) {
		System.out.println("Nombre: " + dto.getNombre());
		System.out.println("Correo: "+ dto.getCorreo());
		System.out.println("Sujeto: "+ dto.getSujeto());
		System.out.println("Mensaje: " + dto.getMensaje());
	return "contact";	
	}
}

