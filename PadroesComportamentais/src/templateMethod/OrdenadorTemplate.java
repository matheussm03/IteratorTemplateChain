package templateMethod;

import java.util.ArrayList;

public abstract class OrdenadorTemplate {
	public abstract boolean isPrimeiro(Musica musica1, Musica musica2);

	protected ArrayList<Musica> ordenarMusica(ArrayList<Musica> lista) {
		ArrayList<Musica> novaLista = new ArrayList<Musica>();
		for (Musica musica : lista) {
			novaLista.add(musica);
		}

		for (int i = 0; i < novaLista.size(); i++) {
			for (int j = i; j < novaLista.size(); j++) {
				if (!isPrimeiro(novaLista.get(i), novaLista.get(j))) {
					Musica temp = novaLista.get(j);
					novaLista.set(j, novaLista.get(i));
					novaLista.set(i, temp);
				}
			}
		}

		return novaLista;
	}
}
