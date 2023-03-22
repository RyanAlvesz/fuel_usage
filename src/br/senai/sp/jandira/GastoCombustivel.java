package br.senai.sp.jandira;

import java.util.Scanner;

public class GastoCombustivel {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("------------------------------------------");
		System.out.println("          CONSUMO DE COMBUSTÍVEL");
		System.out.println("------------------------------------------");
		System.out.println("");
		
		System.out.print("Modelo do carro? ");
		String nomeCarro = teclado.nextLine();
		
		System.out.print("Autonomia do carro? ");
		double autonomiaCarro = teclado.nextDouble();
		
		System.out.print("Distância da viagem? ");
		double distanciaViagem = teclado.nextDouble();
		
		System.out.print("Preço do combustível? ");
		double precoCombustivel = teclado.nextDouble();
		
		System.out.println("");
		System.out.println("-------------------------------------------");
		System.out.println("             R E S U L T A D O");
		System.out.println("-------------------------------------------");
		System.out.println("");
		
		System.out.println("Modelo do veículo: " + nomeCarro);
		System.out.println("Autonomia do Veículo: " + autonomiaCarro + "Km/l");
		System.out.println("Distância percorrida: " + distanciaViagem + "Km");
		System.out.println("Valor do combustível: R$:"+ precoCombustivel);
		System.out.println("");
		
		double combustivelGasto = distanciaViagem / autonomiaCarro;
		double totalGasto = combustivelGasto * precoCombustivel;
		
		System.out.println("-------------------------------------------");
		System.out.println("Quantidade de combustível utilizado: " + combustivelGasto + "l");
		System.out.println("Total gasto com a viagem: R$" + totalGasto);
		System.out.println("-------------------------------------------");
		
	}
	
}
