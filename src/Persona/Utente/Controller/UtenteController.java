package it.oop.erreenne.persona.utente.controller;

import it.oop.erreenne.persona.utente.controller.JDBCUtenteController;


public class UtenteController {

  public UtenteController() {
    JDBCUtenteController jdbcUtente = JDBCUtenteController();
  }

	public boolean login(email, password) {

		return true;
	}

	public void play() {
	}

	public void getReview() {
	}

  public boolean setReview(String idG, String recensione) {
    //aggiorno la recensione nel database
  }

  public boolean setRating(int punteggio) {
	}

	public void rating() {
	}


}
