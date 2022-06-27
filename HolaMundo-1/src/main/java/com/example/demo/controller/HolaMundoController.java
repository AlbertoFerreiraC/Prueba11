package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Holas")
public class HolaMundoController {
	
@GetMapping
	public String HolaMundo() {
		return "Hola Mundo";
	}
	
@GetMapping("/calcular")
public int Calcular() {
	int a = 5*5;
	return (a*5);
}

@GetMapping("/multiplicar")
public int restar(@RequestParam(required = false) Integer a,@RequestParam Integer b) {
	System.out.println("SE INICIO LA MULTIPLICACIONXXXXXXXXX");
	int resultado = a*b;
	return resultado;
}

}
