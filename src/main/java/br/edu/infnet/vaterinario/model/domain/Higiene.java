package br.edu.infnet.vaterinario.model.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "THigiene")
public class Higiene extends Atendimento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private int cod_higiene;
	private String nome;
	private String descricao;
	private float valor_higiene;
	
	public Higiene() {
		 super();
	}	
	
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

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getCod_higiene() {
		return cod_higiene;
	}

	public void setCod_higiene(int cod_higiene) {
		this.cod_higiene = cod_higiene;
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

	public float getValor_higiene() {
		return valor_higiene;
	}

	public void setValor_higiene(float valor_higiene) {
		this.valor_higiene = valor_higiene;
	}
}
