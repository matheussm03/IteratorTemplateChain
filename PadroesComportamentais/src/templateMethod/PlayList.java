package templateMethod;

import java.util.ArrayList;

public class PlayList {
	protected ArrayList<Musica> musicas;
	protected OrdenadorTemplate ordenador;

	public PlayList(ModoDeReproducao modo) {
		musicas = new ArrayList<Musica>();
		switch (modo) {
		case porAno:
			ordenador = new OrdenadorPorAno();
			break;
		case porCantor:
			ordenador = new OrdenadorPorCantor();
			break;
		case porNome:
			ordenador = new OrdenadorPorNome();
			break;
		default:
			break;
		}
	}

	public void setModoDeReproducao(ModoDeReproducao modo) {
		ordenador = null;
		switch (modo) {
		case porAno:
			ordenador = new OrdenadorPorAno();
			break;
		case porCantor:
			ordenador = new OrdenadorPorCantor();
			break;
		case porNome:
			ordenador = new OrdenadorPorNome();
			break;
		default:
			break;
		}
	}

	public void adicionarMusica(String nome, String cantor, String ano) {
		musicas.add(new Musica(nome, cantor, ano));
	}

	public void mostrarListaDeReproducao() {
		ArrayList<Musica> novaLista = new ArrayList<Musica>();
		novaLista = ordenador.ordenarMusica(musicas);

		for (Musica musica : novaLista) {
			System.out.println(musica.nome + " - " + musica.cantor + "\n Ano: "
					+ musica.ano + "\n");
		}
	}
}
