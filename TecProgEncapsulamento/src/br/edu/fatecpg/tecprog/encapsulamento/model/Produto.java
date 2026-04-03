package br.edu.fatecpg.tecprog.encapsulamento.model;

public class Produto {

	private String nome;
	private double preco;
	private int quantidadeEstoque;

	public Produto(String nome, double preco, int quantidadeEstoque) {
		this.nome = nome;
		setPreco(preco);
		setQuantidadeEstoque(quantidadeEstoque);
	}

	public String getNome() {
		return nome;
	}

	public double getPreco() {
		return preco;
	}

	public int getQuantidadeEstoque() {
		return quantidadeEstoque;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean setPreco(double preco) {
		if (preco >= 0) {
			this.preco = preco;
			return true;
		}
		System.out.println("  [ERRO] Preco nao pode ser negativo. Valor ignorado.");
		return false;
	}

	public boolean setQuantidadeEstoque(int quantidade) {
		if (quantidade >= 0) {
			this.quantidadeEstoque = quantidade;
			return true;
		}
		System.out.println("  [ERRO] Estoque nao pode ser negativo. Valor ignorado.");
		return false;
	}

	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", preco=" + preco + ", quantidadeEstoque=" + quantidadeEstoque + "]";
	}

}
