package it.oop.erreenne;

import it.oop.erreenne.persona.utente.controller.UtenteController;
import it.oop.erreenne.persona.moderatore.controller.ModeratoreController; // TODO

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.List;

public class GamingPlatform {

		public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		public static void main(String[] args) throws IOException {

			System.out.print("(1) Login\n(2) Sign Up\n (3) Esci");

      // TODO Nel login verrà chiesto se si è un moderatore e quindi switchera controller e model

			String line = reader.readLine();

			if( line.equals("1") ) {
        System.out.println("Sei un moderatore? y/n");
        String moderator = reader.readLine();

        System.out.println("Inserisci l'email");
    		String email = reader.readLine();

        System.out.println("Inserisci la password");
        String password = reader.readLine();

        if (moderator == n) {
          UtenteController utente = new UtenteController();
          utente.login(email, passsword);
        } else {
          ModeratoreController moderatore = new ModeratoreController();
          moderatore.login();
        }

			} else if( line.equals("2") ){
				Title title = createTitle(reader);
				manager.createTitle(title); //inserimento
			} else if( line.equals("3") ){

      }
		}

	private static void viewTitles(List<Title> titles) {
			// TODO Auto-generated method stub

		Iterator<Title> i = titles.iterator();
		while(i.hasNext()){
			Title title = i.next();
		}

		/*for(Title title : titles){ //for(Type t: elements) {}
			System.out.println("Titolo: " + title.getName() +
					", Autore: " + title.getAuthor() +
					", Descrizione: " + title.getDescription() +
					", ISBN: " + title.getIsbn() +
					", Anno di pubblicazione: " + title.getPublicationYear() +
					", Editore: " + title.getEditor() +
					", Tipo: " + title.getTitleKind().getName()
		);
		}*/

		/*for(Iterator<Title> i = titles.iterator();i.hasNext();){
			Title title = i.next();
		}*/
		/*
		for(int i = 0; i < titles.length; i ++){
			System.out.println( "Titolo: " + titles[i].getName()+ "Autore: " + titles[i].getAuthor() );
			}
		 */
		}

	public static Title createTitle(BufferedReader reader) throws IOException{

		System.out.println("Inserisci il nome");
		String name = reader.readLine();
		System.out.println("Inserisci l'autore");
		String author = reader.readLine();
		System.out.println("Inserisci la descrizione");
		String description = reader.readLine();
		System.out.println("Inserisci l'ISBN");
		String isbn = reader.readLine();
		System.out.println("Inserisci l'anno");
		int year  = Integer.parseInt(reader.readLine());
		System.out.println("Inserisci l'editore");
		String editor = reader.readLine();
		System.out.println("Inserisci il tipo (1:libro, 2:rivista)");
		int kind = Integer.parseInt(reader.readLine());

		TitleKind titleKind = new TitleKind(kind, "libro");
		Title title = new Title(name, author, description, isbn, year, editor, titleKind);

		return title;
	}
}
