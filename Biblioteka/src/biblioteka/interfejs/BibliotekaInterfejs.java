package biblioteka.interfejs;

import java.util.LinkedList;

import biblioteka.Autor;
import biblioteka.Knjiga;

public interface BibliotekaInterfejs {

	public void dodajKnjigu(Knjiga k);
	public void obrisiKnjigu(Knjiga k);
	public LinkedList<Knjiga> vratiKnjige();
	public LinkedList<Knjiga> pronadjiKnjigu(Autor a,String isbn,String naslov,String izdavac);
	
}
