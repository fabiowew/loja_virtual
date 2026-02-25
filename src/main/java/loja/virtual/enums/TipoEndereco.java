package loja.virtual.enums;

public enum TipoEndereco {
	
	COBRANCA("Cobrança"),
	ENTREGA("Entrega");
	
	
	private String descricao;
	
	private TipoEndereco(String descricao) {
		this.descricao = descricao;
	}
	
	@SuppressWarnings("unused")
	private String getDescricao() {
		return descricao;
	}
	
	public String toString() {
		return this.descricao;
	}

}
