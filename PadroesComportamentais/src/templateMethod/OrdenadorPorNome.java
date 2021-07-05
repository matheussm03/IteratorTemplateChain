package templateMethod;

public class OrdenadorPorNome extends OrdenadorTemplate {

	@Override
	public boolean isPrimeiro(Musica musica1, Musica musica2) {
		if (musica1.nome.compareToIgnoreCase(musica2.nome) <= 0) {
			return true;
		}
		return false;
	}

}
