package templateMethod;

public class OrdenadorPorCantor extends OrdenadorTemplate {

	@Override
	public boolean isPrimeiro(Musica musica1, Musica musica2) {
		if (musica1.cantor.compareToIgnoreCase(musica2.cantor) <= 0) {
			return true;
		}
		return false;
	}

}
