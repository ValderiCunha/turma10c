package br.com.unixyz.modelo;

public class Professor {

	private String id;
	private String nome;
	private String formacao;
	private Endereco endereco;
	
	
		public String geAll () {
			return
					"ID: " + id + "\n" +
					"Nome: " + nome + "\n" +
					"Forma��o: " + formacao + "\n" +
					"Endere�o: " + endereco;
		}
	
	public void setAll(String id, String nome, String formacao, Endereco endereco) {
		this.id = id;
		this.nome = nome;
		this.formacao = formacao;
		this.endereco = endereco;
	}
	public Professor() {
		super();
	}
	public Professor(String id, String nome, String formacao, Endereco endereco) {
		super();
		this.id = id;
		this.nome = nome;
		this.formacao = formacao;
		this.endereco = endereco;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getFormacao() {
		return formacao;
	}
	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
}