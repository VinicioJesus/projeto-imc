package br.senai.sp.jandira.model;

public class Imc {

	private double peso;
	private double altura;

	// quem chamar o método Peso, vai ter que falar o (peso)
	public void setPeso(String peso) {
		this.peso = Double.parseDouble(peso);
	}

	public double getPeso() {
		return this.peso;
	}

	public void setAltura(String altura) {
		this.altura = Double.parseDouble(altura);
	}

	public double getAltura() {
		return this.altura;
	}

	public double calcularImc() {
		double imc = peso / Math.pow(altura, 2);
		return imc;
	}
	
	public String mostrarImcComoString() {
		return String.valueOf(calcularImc());
	}

	public String mostrarStatusImc() {
		if (calcularImc() < 18.5) {
			return "Abaixo do Peso!";
		} else if (calcularImc() >= 18.5 && calcularImc() < 25) {
			return "Peso Ideal!";
		} else if (calcularImc() >= 25 && calcularImc() < 30) {
			return "Levemente acima do Peso!";
		} else if (calcularImc() >= 30 && calcularImc() < 35) {
			return "Obesidade grau I";
		} else if (calcularImc() >= 35 && calcularImc() < 40) {
			return "Obesidade grau II (severa)";
		} else {
			return "Obesidade grau III(mórbida)";
		}
	}

}
