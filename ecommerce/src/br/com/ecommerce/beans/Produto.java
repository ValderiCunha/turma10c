package br.com.ecommerce.beans;

public class Produto {

	private int id;
	private String descricao;
	private float valorVenda;
	private float valorCompra;
	private int quantidade;
	
	public float getDesconto(float porcentagem) {
		return valorVenda - valorVenda * (porcentagem/100);
	}
	
	public void ajustarValores(float valor) {
		valorVenda+=valor;
		valorCompra+=valor;
	}
	
	public float getDesconto() {
		return valorVenda * (float) 0.9;
	}
	
	public float totalCompra() {
		return valorCompra*quantidade;
	}
	
	public float totalVenda() {
		return valorVenda*quantidade;
	}
	
	public String getAll() {
		return
				"ID: " + id + "\n" +
				"Decri��o: " + descricao + "\n" +
				"Valor da Venda: " + valorVenda + "\n" +
				"Valor da Compra: " + valorCompra + "\n" +
				"Quantidade: " + quantidade;
	}
	
	
	
	public void setAll(int id, String descricao, float valorVenda, float valorCompra, int quantidade) {
		this.id = id;
		this.descricao = descricao;
		this.valorVenda = valorVenda;
		this.valorCompra = valorCompra;
		this.quantidade = quantidade;
	}
	public Produto() {
		super();
	}
	public Produto(int id, String descricao, float valorVenda, float valorCompra, int quantidade) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.valorVenda = valorVenda;
		this.valorCompra = valorCompra;
		this.quantidade = quantidade;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public float getValorVenda() {
		return valorVenda;
	}
	public void setValorVenda(float valorVenda) {
		this.valorVenda = valorVenda;
	}
	public float getValorCompra() {
		return valorCompra;
	}
	public void setValorCompra(float valorCompra) {
		this.valorCompra = valorCompra;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	
	
	
	
}
