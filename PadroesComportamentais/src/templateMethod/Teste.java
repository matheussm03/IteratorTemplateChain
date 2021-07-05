package templateMethod;

public class Teste {
	public static void main(String[] args) {

		PlayList minhaPlayList = new PlayList(ModoDeReproducao.porNome);
		minhaPlayList.adicionarMusica("Times Like These", "Foo Fighters", "2002");
		minhaPlayList.adicionarMusica("Uptown Funk", "Bruno Mars", "2014");
		minhaPlayList.adicionarMusica("Apologize", "One Republic", "2007");
		minhaPlayList.adicionarMusica("In The End", "Linkin Park", "2001");
		minhaPlayList.adicionarMusica("Naive", "The Kooks", "2006");

		System.out.println("== Lista ordenada por Nome Musica ==");
		minhaPlayList.mostrarListaDeReproducao();

		System.out.println("\n== Lista ordenada por Cantor ==");
		minhaPlayList.setModoDeReproducao(ModoDeReproducao.porCantor);
		minhaPlayList.mostrarListaDeReproducao();

		System.out.println("\n== Lista ordenada por Ano ==");
		minhaPlayList.setModoDeReproducao(ModoDeReproducao.porAno);
		minhaPlayList.mostrarListaDeReproducao();
	}
}
