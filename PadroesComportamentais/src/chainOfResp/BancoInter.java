package chainOfResp;

public class BancoInter extends BancoChain {

	public BancoInter() {
		super(IDBancos.bancoInter);
	}

	@Override
	protected void efetuaPagamento() {
		System.out.println("Pagamento efetuado no banco Inter");
	}

}
