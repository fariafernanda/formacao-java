package com.banco;

import java.util.Scanner;

public class ContaTerminal {

		
	public static void main(String[] args) {
		
		Conta conta = new Conta();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Por favor, digite o número da agência: ");		
		conta.setAgencia(scan.next());
		
		System.out.println("Por favor, digite o número da conta: ");		
		conta.setNumero(scan.nextInt());
		
		System.out.println("Por favor, digite o nome do cliente: ");	
		conta.setNomeCliente(scan.next());

		System.out.println("Por favor, digite o saldo da conta: ");	
		conta.setSaldo(scan.nextDouble());
		
		System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco. Sua agência é %s, número da conta: %d. "
				+ "Seu saldo de R$%.2f já está disponível para saque.", 
				conta.getNomeCliente(), conta.getAgencia(), conta.getNumero(), conta.getSaldo());
		
		
		scan.close();

	}

}
