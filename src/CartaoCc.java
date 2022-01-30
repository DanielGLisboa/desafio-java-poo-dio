

public class CartaoCc extends Cartao {

	public CartaoCc(Cliente cliente) {
		super(cliente);
		
	}
	
	public void exibeCartao() {
	System.out.println("===  Cartão Conta corrente     ===");
	super.imprimirInfosCartao();
	}
}
