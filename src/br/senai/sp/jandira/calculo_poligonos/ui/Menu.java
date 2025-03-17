package br.senai.sp.jandira.calculo_poligonos.ui;

import java.util.Scanner;

import br.senai.sp.jandira.calculo_poligonos.dao.QuadradoDao;

public class Menu {

	public static void criarMenu() {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("----------------------");
		System.out.println("CALCULADORA DE POLÍGONOS");
		System.out.println("----------------------");
		System.out.println("1- QUADRADO");
		System.out.println("2- RETÂNGULO");
		System.out.println("3- TRIÂNGULO");
		System.out.println("4- TRAPÉZIO");
		System.out.println("5- CIRCUNFERÊNCIA");
		System.out.println("----------------------");
		System.out.println("Escolha uma opção (1-5): ");
		
		int opcao = leitor.nextInt();
		
		if (opcao == 1) {
			QuadradoDao.criar();
		} else if (opcao == 2) {
			//Chamar o RetanguloDao
		}else if (opcao == 3) {
			//Chamar o TrianguloDao
		}else if (opcao == 4) {
			//Chamr o TrapezioDao
		}else if (opcao == 5) {
			//Chamar a CircunferenciaDao
		}else {
			System.out.println("Opção inválida! Você deve escolher um número entre 1 e 5!");
		}
		
	}
	
}
