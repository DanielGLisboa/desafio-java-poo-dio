
public class Main {

	public static void main(String[] args) {
		Cliente daniel = new Cliente();
		daniel.setNome("Daniel");
		
		
		Conta cc = new ContaCorrente(daniel);
		Conta poupanca = new ContaPoupanca(daniel);
		CartaoCc cartaoCc = new CartaoCc(daniel);
		

		cc.depositar(300);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		cartaoCc.exibeCartao();
		
	}

}
