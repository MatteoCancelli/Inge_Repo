package progettoInge;

public class Scrutatore {
	private String nome;
	private String cognome;
	private String cartaIdentita;
	
	public Scrutatore(String nome, String cognome, String cartaIdentita) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.cartaIdentita = cartaIdentita;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getCartaIdentita() {
		return cartaIdentita;
	}

	public void setCartaIdentita(String cartaIdentita) {
		this.cartaIdentita = cartaIdentita;
	}
	
	
}
