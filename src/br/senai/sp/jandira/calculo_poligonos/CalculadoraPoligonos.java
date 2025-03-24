package br.senai.sp.jandira.calculo_poligonos;

import java.util.Scanner;

import br.senai.sp.jandira.calculo_poligonos.model.Quadrado;
import br.senai.sp.jandira.calculo_poligonos.model.Retangulo;
import br.senai.sp.jandira.calculo_poligonos.ui.Menu;

public class CalculadoraPoligonos {

	public static void main(String[] args) {

		// Looping / Laços de repetição
		int contador = 1;
		while (contador <= 15) {
			System.out.println("senai jandira! - " + contador);
			contador = contador + 1;
		}

		String resposta = "s";
		while (resposta.equals("s")) {
			System.out.println("Estamos dando voltas");
			System.out.println("Gostaria de dar uma volta (s/n)? ");
			Scanner leitor = new Scanner(System.in);
			resposta = leitor.next();

			
			
			System.out.println("----- Tabuada do 9 ------");
			System.out.println();
			
			contador = 0;
			while (contador <= 10) {
				int resultado = 9 * contador;
				System.out.println(" 9 * " + contador + " = " + (9 * resultado ));
				contador = contador + 1;

			}

		}

	}

	// Menu.criarMenu();

}
