package br.edu.infnet.vaterinario.model.domain;

public class Exame extends Atendimento{
	
	private int cod_exame;
	private String nome;
	private String descricao;
	private float valor_exame;
	
	public Exame(String vet_responsavel, float valor, int codigo) {
		super(vet_responsavel, valor, codigo);
	}

	@Override
	public float calcularValorAtendimento() {
		return getValor() + valor_exame;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append(super.toString());
		sb.append(";");		
		sb.append(cod_exame);
		sb.append(";");
		sb.append(nome);
		sb.append(";");
		sb.append(descricao);
		sb.append(";");
		sb.append(valor_exame);
		sb.append(";");
		
		return sb.toString();
	}
	
	public int getCodigo() {
		return cod_exame;
	}

	public void setCodigo(int codigo) {
		this.cod_exame = codigo;
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
		return valor_exame;
	}

	public void setValor(float valor) {
		this.valor_exame = valor;
	}

	
}
