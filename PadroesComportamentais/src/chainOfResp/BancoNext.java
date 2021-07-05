package chainOfResp;

public class BancoNext extends BancoChain {

	public BancoNext() {
		super(IDBancos.bancoNext);
	}

	@Override
	protected void efetuaPagamento() {
		System.out.println("Pagamento efetuado no banco Next");
	}

}
