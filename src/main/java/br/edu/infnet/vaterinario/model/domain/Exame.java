package br.edu.infnet.vaterinario.model.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TExame")
public class Exame extends Atendimento{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private int cod_exame;
	private String nome;
	private String descricao;
	private float valor_exame;
	
	public Exame() {
		 super();
	}
	
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

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getCod_exame() {
		return cod_exame;
	}

	public void setCod_exame(int cod_exame) {
		this.cod_exame = cod_exame;
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

	public float getValor_exame() {
		return valor_exame;
	}

	public void setValor_exame(float valor_exame) {
		this.valor_exame = valor_exame;
	}
}
