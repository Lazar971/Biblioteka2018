package biblioteka;

import java.util.LinkedList;

import biblioteka.interfejs.BibliotekaInterfejs;

public class Biblioteka implements BibliotekaInterfejs  {

	private LinkedList<Knjiga> knjige=new LinkedList<Knjiga>();
	
	
	@Override
	public void dodajKnjigu(Knjiga k) {
		if(k==null || knjige.contains(k))throw new RuntimeException("Knjiga je null ili vec postoji");
		knjige.add(k);
		
	}

	@Override
	public void obrisiKnjigu(Knjiga k) {
		if(k==null || !knjige.contains(k))throw new RuntimeException("Knjiga je null ili ne postoji u listi");
		knjige.remove(k);
		
	}

	@Override
	public LinkedList<Knjiga> vratiKnjige() {
		
		return knjige;
	}

	@Override
	public LinkedList<Knjiga> pronadjiKnjigu(Autor a, String isbn, String naslov, String izdavac) {
		if(naslov==null)throw new RuntimeException("naslov null");
		
		
		LinkedList<Knjiga> nova=new LinkedList<Knjiga>();
		for(Knjiga i:knjige) {
			if(i.getNaslov().contains(naslov))nova.add(i);
		}
		return nova;
	}
	
	
}
