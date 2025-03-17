package br.senai.sp.jandira.calculo_poligonos.dao;

import java.util.Scanner;

import br.senai.sp.jandira.calculo_poligonos.model.Retangulo;

public class RetanguloDao {

	public static void criar() {
		Scanner leitor = new Scanner (System.in);
		
		System.out.println("Criando um Retângulo...");
		
		Retangulo retangulo = new Retangulo();
		
		System.out.println("Digite a medida da base e altura do Retângulo: ");
		
		retangulo.setbase(leitor.nextDouble());
		retangulo.exibirDados();
	
		retangulo.setaltura(leitor.nextDouble());
		retangulo.exibirDados();
	}
}
