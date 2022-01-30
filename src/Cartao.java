
public class Cartao {
	private static final int AGENCIA_PADRAO = 1;
	private static final String VALIDADE_PADRAO = "10-01-2028" ;
	private static final String NUMERO_PADRAO = "1545-4541-4546-4454";
	
	protected String numero;
	protected int agencia;
	protected String validade;
	protected Cliente cliente;
	
	public Cartao(Cliente cliente){
		this.agencia = AGENCIA_PADRAO;
		this.numero = NUMERO_PADRAO;
		this.cliente = cliente;
		this.validade = VALIDADE_PADRAO;
		
	}
	
	public int getAgencia() {
		return agencia;
	}

	public String getNumero() {
		return numero;
		
	}String getValidade() {
		return validade;
	}
	
	public void imprimirInfosCartao() {
		System.out.println(String.format("Cliente: %s", this.cliente.getNome()));
		System.out.println(String.format("Agência: %d", this.agencia));
		System.out.println(String.format("Número: %s", this.numero));
		System.out.println(String.format("Validade: %s", this.validade));
	}

}
