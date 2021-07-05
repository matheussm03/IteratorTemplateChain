package chainOfResp;

public class Teste {
	public static void main(String[] args) {
		BancoChain bancos = new BancoNubank();
		bancos.setNext(new BancoInter());
		bancos.setNext(new BancoNext());
		
		try {
			bancos.efetuarPagamento(IDBancos.bancoNext);
			bancos.efetuarPagamento(IDBancos.bancoNubank);
			bancos.efetuarPagamento(IDBancos.bancoInter);
			bancos.efetuarPagamento(IDBancos.bancoNubank);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
