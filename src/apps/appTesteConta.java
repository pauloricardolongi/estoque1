package apps;

import contas.Conta;
import contas.ContaComum;
import classes.Pessoa;

public class appTesteConta {

	public static void main(String[] args) {
		Conta contacomum = new ContaComum(109874, new Pessoa("Fulano", "fulano@gmail.com"), 150.00f);
		System.out.println("Correntista"+ contacomum.getCorrentista().getNome());
		System.out.println("Saldo inicial da conta: "+contacomum.getSaldo());
		
		contacomum.depositar(350.00f);
		System.out.println("Saldo atual da conta: "+ contacomum.getSaldo());

	}

}
