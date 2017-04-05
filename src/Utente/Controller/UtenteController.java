public class UtenteController {
	
	String[] datiUtente = new String[0];
	Utente modelUtente;
	
	public boolean login(String[] dati) {
		datiUtente = dati;
		modelUtente = new Utente(datiUtente);
		return true;
	}
	
	public void play() {
	}
	
	public void getReview() {
	}
	
	public void rating() {	
	}
	
	
}