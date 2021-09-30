/**
 * Aula JAVA POO2 - Curso TI Senac Tatuap� - Encapsulamento
 * 
 *  Aluno: @author heder.lsantos
 */

package contas;

public class Conta {

	/** atributos */
	private double saldo;
	private String cliente;

	/**
	 * obter o saldo
	 * 
	 * @return saldo
	 */
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getCliente() {
		return cliente;
	}

	/**
	 * Atribuir um valor a variavel saldo
	 * 
	 * @param cliente
	 */

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public Conta() {
		System.out.println("Ag�ncia 0261");
		// TODO Auto-generated constructor stub
	}

	/**
	 * exibir o saldo da conta
	 */

	protected void exibirSaldo() {
		System.out.println("Saldo �: R$ " + saldo);
		
	}
	
	/**
	 * Debitar valor da conta corrente
	 * @param valor
	 */
	protected void sacar(double valor) {
		saldo -= valor;
		System.out.println("D�bito: " + valor);
	}
	/**
	 * Depositar Valor
	 * @param valor
	 */
	protected void depositar(double valor) {
		saldo += valor;
		System.out.println("Valor depositado �: " + valor);
	}


	/**
	 * Transferir valores
	 */
	protected void transfer (Conta destino, double valor) {
		this.sacar(valor);
		destino.depositar(valor);
		System.out.println("Transfer�ncia no valor de: R$ " + valor + " foi realizada com sucesso!!!");
		
	}
}

	
