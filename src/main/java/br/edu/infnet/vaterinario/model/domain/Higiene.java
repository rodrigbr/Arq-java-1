package br.edu.infnet.vaterinario.model.domain;

public class Higiene extends Atendimento {
	
	private int cod_higiene;
	private String nome;
	private String descricao;
	private float valor_higiene;
	
	public Higiene(String vet_responsavel, float valor, int codigo) {
		super(vet_responsavel, valor, codigo);
	}

	@Override
	public float calcularValorAtendimento() {
		return getValor() + valor_higiene;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append(super.toString());
		sb.append(";");		
		sb.append(cod_higiene);
		sb.append(";");
		sb.append(nome);
		sb.append(";");
		sb.append(descricao);
		sb.append(";");
		sb.append(valor_higiene);
		sb.append(";");
		
		return sb.toString();
	}
	
	public int getCodigo() {
		return cod_higiene;
	}

	public void setCodigo(int codigo) {
		this.cod_higiene = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public float getValor() {
		return valor_higiene;
	}

	public void setValor(float valor) {
		this.valor_higiene = valor;
	}
}
