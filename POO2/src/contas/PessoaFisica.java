package contas;

public class PessoaFisica {

	public static void main(String[] args) {
		Conta cc1 = new Conta();
		cc1.setCliente("Leandro Ramos");
		cc1.setSaldo(10000);
		System.out.println("Cliente: " + cc1.getCliente());
		cc1.exibirSaldo();
		cc1.sacar(1145);
		cc1.depositar(100);
		cc1.exibirSaldo();
		
	
		
		System.out.println("---->--->>------>>>");

		Conta cc2 = new Conta();
		cc2.setCliente("Ayrlton Js");
		cc2.setSaldo(00.15);
		System.out.println("Cliente: " + cc2.getCliente());
		cc2.exibirSaldo();
		cc2.sacar(0.10);
		cc2.depositar(10);
		cc2.exibirSaldo();
		
		System.out.println("---->--->>----->>>");
		
		System.out.println("Transferencia");
		System.out.println("Cliente: " + cc1.getCliente());
		cc1.exibirSaldo();
		System.out.println("Favorecido: " + cc2.getCliente());
		cc2.exibirSaldo();
		cc1.transfer(cc2, 1500);
		
	}

}
