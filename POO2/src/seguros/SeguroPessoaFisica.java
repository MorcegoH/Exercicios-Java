package seguros;

import contas.Conta;

public class SeguroPessoaFisica extends Conta  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SeguroPessoaFisica cc3 = new SeguroPessoaFisica();
		cc3.setCliente("Maria S�rie B");
		cc3.setSaldo(9000);
		System.out.println("Cliente: " + cc3.getCliente());
		cc3.exibirSaldo();
		System.out.println("---->--->>----->>>");
		System.out.println("");
		
		
	}

}


