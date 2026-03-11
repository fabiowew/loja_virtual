package loja.virtual.enums;

public enum StatusContaReceber {

	COBRANCA("Pagar"), 
	Vencida("Vencida"),
	Aberta("Aberta"), 
	Quitada("Quitada");

	private String descricao;

	private StatusContaReceber(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
