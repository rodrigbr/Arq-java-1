package br.edu.infnet.vaterinario.model.domain;

public abstract class Atendimento {

	private Integer id;
	

	private String vet_responsavel;
	private Exame exame;
	private Higiene higiene;
	private Vacina vacina;
	private float valor;
	private int codigo;
	
	public Atendimento(String vet_responsavel, float valor, int codigo) {
		this.vet_responsavel = vet_responsavel;
		this.valor = valor;
		this.codigo = codigo;
	}
	
	public abstract float calcularValorAtendimento();

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append(vet_responsavel);
		sb.append(";");
		sb.append(valor);
		sb.append(";");
		sb.append(codigo);
		sb.append(";");
		sb.append(calcularValorAtendimento());
		sb.append(";");
		
		return sb.toString();
	}
		
	public String getVet_responsavel() {
		return vet_responsavel;
	}

	public Exame getExame() {
		return exame;
	}

	public Higiene getHigiene() {
		return higiene;
	}

	public Vacina getVacina() {
		return vacina;
	}

	public float getValor() {
		return valor;
	}

	public int getCodigo() {
		return codigo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setVet_responsavel(String vet_responsavel) {
		this.vet_responsavel = vet_responsavel;
	}

	public void setExame(Exame exame) {
		this.exame = exame;
	}

	public void setHigiene(Higiene higiene) {
		this.higiene = higiene;
	}

	public void setVacina(Vacina vacina) {
		this.vacina = vacina;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
}
