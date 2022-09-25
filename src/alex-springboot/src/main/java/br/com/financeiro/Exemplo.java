package br.com.financeiro;

public class Exemplo {
	
	private final long id;
	private final String content;
	
	public Exemplo(long id, String content) {
		this.id = id;
		this.content = content;
	}

	public long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}

}
