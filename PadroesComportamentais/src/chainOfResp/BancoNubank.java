package chainOfResp;

public class BancoNubank extends BancoChain {

	public BancoNubank() {
		super(IDBancos.bancoNubank);
	}

	@Override
	protected void efetuaPagamento() {
		System.out.println("Pagamento efetuado no banco Nubank");
	}
}
