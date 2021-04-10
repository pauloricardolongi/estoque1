package apps;

import java.text.SimpleDateFormat;
import java.util.Date;

import classes.Movimento;
import classes.Pessoa;

import classes.Transacao;
import contas.Conta;
import contas.ContaComum;

public class appTransacoes {

	public static void main(String[] args) {
		Transacao transacoes= new Transacao();
		Pessoa pessoa= new Pessoa("Fulanano", "fulano@gmail.com");
		Conta contacomum= new ContaComum(102030, pessoa, 450.00f);
		
		float saldoanterior= contacomum.getSaldo();
		
		transacoes.realizarTransacao(new Date(), contacomum, "Depósito em dinheiro",100.00f, Conta.DEPOSITAR);
		transacoes.realizarTransacao(new Date(), contacomum, "Pagamento conta de luz",50.00f,Conta.SACAR);
		transacoes.realizarTransacao(new Date(), contacomum,"Pagamento conta telefone",120.00f,Conta.SACAR);
		transacoes.realizarTransacao(new Date(), contacomum, "Transferência entre contas", 850.00f,Conta.DEPOSITAR);
		
		System.out.println("Emitindo extrato da Conta Comum número: "+ contacomum.getNumero());
		System.out.println(" Correntista: "+ contacomum.getCorrentista().getNome());
		System.out.println("Sando Anterior: "+ saldoanterior);
		System.out.println("---------------------------------------");
		for (Movimento movimento: transacoes.getMovimentos()) {
			System.out.println("Data: "+ new SimpleDateFormat("dd/MM/yyyy").format(movimento.getData()));
			System.out.println("Histórico: "+ movimento.getHistorico());
			System.out.println("Valor: "+ movimento.getValor());
			System.out.println("Operação: "+ (movimento.getOperacao()== Conta.DEPOSITAR ? "Depósito": "Saque"));
			System.out.println("---------------------------------------");
			
		}
		System.out.println("Saldo atual:"+ contacomum.getSaldo());
	
		

	}

}
