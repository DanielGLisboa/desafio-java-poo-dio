

public class CartaoCc extends Cartao {

	public CartaoCc(Cliente cliente) {
		super(cliente);
		
	}
	
	public void exibeCartao() {
	System.out.println("===  Cart�o Conta corrente     ===");
	super.imprimirInfosCartao();
	}
}
