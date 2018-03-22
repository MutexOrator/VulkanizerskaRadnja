package gume;
/**
 * 
 * @author Dusko Milosevic
 * @version 1.0
 *
 */
public class AutoGuma {
	/**
	 * Marka modela
	 */
	private String markaModel = null;
	/**
	 * Precnik gume
	 */
	private int precnik = 0;
	/**
	 * Sirina gume
	 */
	private int sirina = 0;
	/**
	 * Visina gume
	 */
	private int visina = 0;
	/**
	 * Vraca vrednost atributa za marku modela
	 * @return marku modela kao string
	 */
	public String getMarkaModel() {
		return markaModel;
	}
	/**
	 * Postavlja novu vrenost za atribut marka modela
	 * @param markaModel nova marka modela
	 * @throws java.lang.RuntimeExeption ako je unet
	 * <ul>
	 * <li>null</li>
	 * <li>String kraci od 3 karaktera</li>
	 * </ul>
	 */
	public void setMarkaModel(String markaModel) {
		if (markaModel == null || markaModel.length() < 3)
			throw new RuntimeException("Morate uneti marku i model");
		this.markaModel = markaModel;
	}
	/**
	 * Vraca vrednost za precnik gume
	 * @return precnik gume kao String
	 */
	public int getPrecnik() {
		return precnik;
	}
	/**
	 * Postavlja novu vrednost za atribut precnik gume
	 * @param precnik novi precnik gume
	 * @throws java.lang.RuntimeExeption ako je unet
	 * <ul>
	 * <li>null</li>
	 * <li>String kraci od 3 karaktera</li>
	 * </ul>
	 */
	public void setPrecnik(int precnik) {
		if (precnik < 13 && precnik > 22)
			throw new RuntimeException("Precnik van opsega");
		this.precnik = precnik;
	}
	/**
	 * Vraca vrednost za sirinu gume
	 * @return sirina gume kao String
	 */
	public int getSirina() {
		return sirina;
	}
	/**
	 * Postavlja novu vrednost za atribut sirina gume
	 * @param sirina nova sirina gume
	 * @throws java.lang.RuntimeExeption ako je unet
	 * <ul>
	 * <li>null</li>
	 * <li>String kraci od 3 karaktera</li>
	 * </ul>
	 */
	public void setSirina(int sirina) {
		if (sirina < 135 && sirina > 355)
			throw new RuntimeException("Sirina van opsega");
		this.sirina = sirina;
	}
	/**
	 * Vraca vrednost za visinu gume
	 * @return visina gume kao String
	 */
	public int getVisina() {
		return visina;
	}
	/**
	 * Postavlja novu vrednost za atribut visina gume
	 * @param visina nova visina gume
	 *  @throws java.lang.RuntimeExeption ako je unet
	 * <ul>
	 * <li>null</li>
	 * <li>String kraci od 3 karaktera</li>
	 * </ul>
	 */
	public void setVisina(int visina) {
		if (visina < 25 || visina > 95)
			throw new RuntimeException("Visina van opsega");
		this.visina = visina;
	}

	@Override
	public String toString() {
		return "AutoGuma [markaModel=" + markaModel + ", precnik=" + precnik + ", sirina=" + sirina + ", visina="
				+ visina + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AutoGuma other = (AutoGuma) obj;
		if (markaModel == null) {
			if (other.markaModel != null)
				return false;
		} else if (!markaModel.equals(other.markaModel))
			return false;
		if (precnik != other.precnik)
			return false;
		if (sirina != other.sirina)
			return false;
		if (visina != other.visina)
			return false;
		return true;
	}
}
