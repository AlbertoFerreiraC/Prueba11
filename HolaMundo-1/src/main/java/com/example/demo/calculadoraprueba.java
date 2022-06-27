package com.example.demo;

import java.io.Serializable;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.JOptionPane;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("calcular")
public class calculadoraprueba {

	private int resultado;

	@GetMapping
	public String Calculadora() {
		return "Calculadora de prueba";
	}

	@GetMapping("/suma")
	public int sumar() {
	System.out.println("PRUEBA DE SUMA EN CONSOLA");
		int a = 5;
		return (a + 10);
	}

	@GetMapping("/resta")
	public int resta() {
		System.out.println("PRUEBA DE RESTA EN CONSOLA");
		int a = 5;
		return (a - 10);
	}

	@GetMapping("/multi")
	public int restar(@RequestParam(required = true) Integer a) {
		System.out.println("PRUEBA DE MULTIPLICACION EN CONSOLA");
		int b1 = 10;
		int resultado = a * b1;
		return resultado;
	}

	
	@GetMapping("/div") 
		public String div(@RequestParam(required = true) Integer num1) {
		System.out.println("Prueba de div");
        int num2 = 0;
	        try {
	            int resu = num1 / num2;
	           return "La división de " + num1 + " / " + num2 + " es " + resu;
	        } catch (ArithmeticException ex) {
	           return "No se puede dividir por cero";
	        }
	    }
	}



