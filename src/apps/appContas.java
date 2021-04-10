package apps;

import classes.Pessoa;
import contas.Conta;
import contas.ContaComum;
import contas.ContaEspecial;

public class appContas {

	public static void main(String[] args) {
		Pessoa p1= new Pessoa("Paulo", "fulano@gmail.com");
		ContaComum c1= new ContaComum(123456,p1, 150.00f);
		
		System.out.println("Número de contas instanciadas até o momento: "+ c1.getNumeroContas());
		
		ContaEspecial e1 = new ContaEspecial(145362, p1,2500.00f, 5500.00f);
		System.out.println("Número de contas instanciadas até o momento: "+ e1.getNumeroContas());
		
		if(c1.movimentar(1000.00f, Conta.SACAR)) 
			System.out.println("Saque realizado com sucesso. ");
			
			else 
				System.out.println("Impossivel realizar o saque. ");	
		        System.out.println("Nome do correntista: "+ c1.getCorrentista());
				
			
		}
	

	}


