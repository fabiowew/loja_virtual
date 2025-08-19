package dev.lojavirtual.enums;

public enum TipoEndereco {

	COBRANCA("Cobrança"),
	ENTREGA("Entrega");
	
	private String descricao;
	
	private TipoEndereco(String descricao) {
		this.descricao = descricao;		
	}
	
	public String toString() {
		return this.descricao;
	}
	
}
