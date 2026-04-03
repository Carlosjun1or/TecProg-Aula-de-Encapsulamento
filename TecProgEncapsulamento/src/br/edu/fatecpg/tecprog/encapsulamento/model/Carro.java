package br.edu.fatecpg.tecprog.encapsulamento.model;

public class Carro {

	private String marca;
	private String modelo;
	private int ano;
	private double capacidadeTanque;

	public Carro(String marca, String modelo, int ano, double capacidadeTanque) {
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.capacidadeTanque = capacidadeTanque;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public double getCapacidadeTanque() {
		return capacidadeTanque;
	}

	public void setCapacidadeTanque(double capacidadeTanque) {
		this.capacidadeTanque = capacidadeTanque;
	}

	public double calcularCustoAbastecer(double valorGasolina) {
		return capacidadeTanque * valorGasolina;
	}

	@Override
	public String toString() {
		return "Carro [marca=" + marca + ", modelo=" + modelo + ", ano=" + ano + ", capacidadeTanque="
				+ capacidadeTanque + "]";
	}

}