package br.senai.sp.jandira.calculo_poligonos.model;

public class Retangulo {
	
	private double base;
	private double altura;
	
	public void setbase(double base) {
		this.base = base;
		
	}
	public void setaltura (double altura) {
		this.altura = altura;
	}
	
	public double calcularArea() {
		double area = base * altura;
		return area;
	}
	public double calcularPerimetro() {
		double perimetro = 2 * base + altura;
		return perimetro;
	}
	
	public void exibirDados() {
		System.out.println("---------------");
		System.out.println("DADOS DO RETÂNGULO");
		System.out.println("------------------");
		System.out.println("Altura " + altura);
		System.out.println("Base "  + base);
		System.out.println("Área total:" + calcularArea());
		System.out.println("Perimetro:" + calcularPerimetro());
		System.out.println("---------------------");
	}
	
	


}
