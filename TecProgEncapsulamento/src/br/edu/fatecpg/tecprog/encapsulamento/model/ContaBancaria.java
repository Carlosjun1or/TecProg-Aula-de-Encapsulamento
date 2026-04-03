package br.edu.fatecpg.tecprog.encapsulamento.model;

public class ContaBancaria {

	private double saldo;
	private String titular;

	public ContaBancaria(String titular) {
		this.titular = titular;
		this.saldo = 0.0;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public boolean depositar(double valor) {
		if (valor > 0) {
			saldo += valor;
			return true;
		}
		return false;
	}

	public boolean sacar(double valor) {
		if (valor > 0 && valor <= saldo) {
			saldo -= valor;
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "ContaBancaria [saldo=" + saldo + ", titular=" + titular + "]";
	}

}
