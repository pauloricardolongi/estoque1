package apps;

import classes.Pessoa;

import contas.ContaEspecial;

public class appContaEspecial {

	public static void main(String[] args) {
		ContaEspecial e1;
		Pessoa p1= new Pessoa("Ciclano", "ciclano@gmail.com");
		
		e1= new ContaEspecial (123456,p1, 0.00f, -1000.00f);
          
		System.out.println("Saldo inicial da conta "+ e1.getSaldo());
		System.out.println("Limite da conta é "+ e1.getLimite());
		if(e1.sacar(1500.00f))
			System.out.println("Operação realizada com sucesso");
		else
			System.out.println("Limite insuficiente para saque");
		System.out.println("Saldo atual da conta "+ e1.getSaldo());
		e1.descontarTaxaManutencao();
		System.out.println("Saldo após desconto da taxa de manutenção"+ e1.getSaldo());
	}

}
