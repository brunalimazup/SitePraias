package br.com.praias.models;

public class PraiaModel {

	private String nome;
	private String foto;
	private String descricao;

	public PraiaModel() {
	}

	public PraiaModel(String nome, String foto, String descricao) {
		this.nome = nome;
		this.foto = foto;
		this.descricao = descricao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		StringBuilder modelo = new StringBuilder();

		modelo.append("Nome da Praia:" + this.nome);
		modelo.append("Usuario: " + this.foto);
		modelo.append("Descrição:" + this.descricao);

		return modelo.toString();
	}
	
}
