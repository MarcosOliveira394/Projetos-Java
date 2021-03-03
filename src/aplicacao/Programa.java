package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta conta;
		
		System.out.print("Digite o número da conta: ");
		int numero = sc.nextInt();
		System.out.print("Digite o nome do titular: ");
		sc.nextLine();
		String titular = sc.nextLine();
		System.out.print("Deposito inicial (s/n)? ");
		char resposta = sc.next().charAt(0);
		
		if(resposta == 's') {
			System.out.print("Digite o valor do deposito inicial: ");
			double depositoInicial = sc.nextDouble();
			conta = new Conta(numero, titular, depositoInicial);
		} else {
			conta = new Conta(numero, titular);
		}
		
		System.out.println();
		System.out.println("Dados da conta:");
		System.out.println(conta.toSring());
		
		System.out.println();
		System.out.print("Digite um valor de depósito: ");
		double valorDoDeposito = sc.nextDouble();
		conta.deposito(valorDoDeposito);
		System.out.println("Dados da conta atualizados: ");
		System.out.println(conta.toSring());
		
		System.out.println();
		System.out.print("Digite um valor de saque: ");
		double valorDoSaque = sc.nextDouble();
		conta.sacar(valorDoSaque);
		System.out.println("Dados da conta atualizados: ");
		System.out.println(conta.toSring());
		
		
		sc.close();
	}

}
