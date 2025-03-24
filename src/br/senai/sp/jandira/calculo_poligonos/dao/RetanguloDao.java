package br.senai.sp.jandira.calculo_poligonos.dao;

import java.util.Scanner;

import br.senai.sp.jandira.calculo_poligonos.model.Retangulo;
import br.senai.sp.jandira.calculo_poligonos.ui.Menu;

public class RetanguloDao {

	public static void criar() {
		Retangulo retangulo = new Retangulo();
		Scanner leitor = new Scanner (System.in);
		
		System.out.println();
		System.out.println("Criando um Retângulo...");
		
		System.out.print("Digite a medida da base do Retângulo: ");
		retangulo.setbase(leitor.nextDouble());
		
		System.out.print("Digite a medida da altura do Retângulo: ");
		
		retangulo.setaltura(leitor.nextDouble());
		
		retangulo.exibirDados();
		
		Menu.retornar();
		
		
		
		
	}
}
