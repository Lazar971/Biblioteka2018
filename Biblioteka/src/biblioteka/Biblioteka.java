package biblioteka;

import java.util.LinkedList;

import biblioteka.interfejs.BibliotekaInterfejs;

public class Biblioteka implements BibliotekaInterfejs  {

	private LinkedList<Knjiga> knjige=new LinkedList<Knjiga>();
	
	
	@Override
	public void dodajKnjigu(Knjiga k) {
		knjige.add(k);
		
	}

	@Override
	public void obrisiKnjigu(Knjiga k) {
		knjige.remove(k);
		
	}

	@Override
	public LinkedList<Knjiga> vratiKnjige() {
		
		return knjige;
	}

	@Override
	public LinkedList<Knjiga> pronadjiKnjigu(Autor a, String isbn, String naslov, String izdavac) {
		if(naslov==null)
			return null;
		
		LinkedList<Knjiga> nova=new LinkedList<Knjiga>();
		for(Knjiga i:knjige) {
			if(i.getNaslov().contains(naslov))nova.add(i);
		}
		return nova;
	}
	
	
}
