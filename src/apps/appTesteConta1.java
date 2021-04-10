package apps;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import contas.Conta;
import contas.ContaComum;
import classes.Pessoa;


public class appTesteConta1 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		teclado.useLocale(Locale.FRENCH);
		int numero = 0 ;
		String nome, email;
		float saldo=0 , valordeposito=0 ;
		
		
		System.out.print("Número da conta.......");
		try {
		numero= teclado.nextInt();
		}
		catch(InputMismatchException e) {
			System.out.println(" Informe um valor numérico  válido para o Saldo inicial da  conta, exemplo: 12345");
			System.exit(0);
		}
		System.out.print("Correntista.......");
		nome= teclado.next();
		System.out.print("Email.......");
		email= teclado.next();
		System.out.print("Saldo inicial.......");
		try {
		saldo= teclado.nextFloat();
		}
		catch (InputMismatchException e) {
			System.out.println(" Informe um valor monetário para o Saldo inicial da  conta, exemplo: 123,89");
			System.exit(0);
		}
		
		Conta contacomum= new ContaComum(numero , new Pessoa(nome, email), saldo);
		
		System.out.println("Valor do depósito.......");
		try {
		valordeposito= teclado.nextFloat();
		}
		catch(InputMismatchException e) {
			System.out.println(" Informe um valor monetário usando vírgula 1para o valor do depósito, ex: 150,89 ");
			System.exit(0);
		}
		contacomum.depositar(valordeposito);
		System.out.printf("Saldo atual: %.2f \n", contacomum.getSaldo());
		
	
		
		
		
		
	

	}

}
