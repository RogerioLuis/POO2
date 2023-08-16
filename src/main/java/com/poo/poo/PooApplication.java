package com.poo.poo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import Veiculo;

@SpringBootApplication
public class PooApplication {

	public static void main(String[] args) {
		SpringApplication.run(PooApplication.class, args);

		Veiculo carroDoRogerio = new Veiculo();
		carroDoRogerio.proprietario = "Rogerio";
		carroDoRogerio.renavam	= "123456";
		carroDoRogerio.marca = "uno";
		carroDoRogerio.modelo = "ep";
		carroDoRogerio.ano = 1985;
		carroDoRogerio.cor = "cinza";
		carroDoRogerio.quilometragem = 8000;

		System.out.println(carroDoRogerio.quilometragem);


	}

}
