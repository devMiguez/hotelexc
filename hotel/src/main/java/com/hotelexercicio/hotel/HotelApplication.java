package com.hotelexercicio.hotel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import classes.Menu;
import implementacao.Cadastro;

@SpringBootApplication
public class HotelApplication {

	public static void main(String[] args) {
		SpringApplication.run(HotelApplication.class, args);

		Cadastro menu = new Cadastro();
		menu.menuPrincipal();

	}

}
