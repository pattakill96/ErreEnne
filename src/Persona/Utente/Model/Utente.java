package it.oop.erreenne.persona.utente.model;

public class Utente {

  private int id;
  private String nome;
  private String cognome;
  private String email;
  private String password;

	public Utente(int id, String nome, String cognome, String email, String password) {
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
		this.password = password;
	}

  public String getNome() {
		return nome;
	}
  public String getCognome() {
		return cognome;
	}
  public String getEmail() {
		return email;
	}
  public String getPassword() {
		return password;
	}

  public void setNome(nome) {
		this.nome = nome;
	}
  public void setCognome(cognome) {
		this.cognome = cognome;
	}
  public void setEmail(email) {
		this.email = email;
	}
  public void setPassword(password) {
		this.password = password;
	}

}
