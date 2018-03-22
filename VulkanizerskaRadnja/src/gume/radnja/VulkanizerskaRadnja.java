package gume.radnja;

import java.util.LinkedList;
import gume.AutoGuma;
/**
 * 
 * @author Dusko Milosevic
 * @version 1.0
 *
 */
public class VulkanizerskaRadnja {
	/**
	 * Lista guma
	 */
	private LinkedList<AutoGuma> gume = new LinkedList<AutoGuma>();
	/**
	 * Dodavanje nove gume na pocetak liste guma
	 * @param a nova guma
	 * @throws java.lang.RuntimeException ako je uneta guma koja
	 * <ul>
	 * <li>je null</li>
	 * <li>vec postoji u listi guma</li>
	 * </ul>
	 */
	public void dodajGumu(AutoGuma a) {
		if (a == null)
			throw new NullPointerException("Guma ne sme biti null");
		if (gume.contains(a))
			throw new RuntimeException("Guma vec postoji");
		gume.addFirst(a);
	}
	/**
	 * Pronalazi sve gume odredjenog modela
	 * @param markaModel model koji je potrebno pronaci u listi
	 * @return listu sa gumama koje su trazenog modela
	 */
	public LinkedList<AutoGuma> pronadjiGumu(String markaModel) {
		if (markaModel == null)
			return null;
		LinkedList<AutoGuma> novaLista = new LinkedList<AutoGuma>();
		for (int i = 0; i < gume.size(); i++)
			if (gume.get(i).equals(markaModel))
				novaLista.add(gume.get(i));
		return novaLista;
	}
}
