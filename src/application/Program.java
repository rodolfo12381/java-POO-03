package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Banco;

public class Program {

	public static void main(String[] args) {
			
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter account number: ");
		int id = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String nome = sc.nextLine();
		System.out.print("Is there any initial deposit (y/n)? ");
		char aux = sc.next().charAt(0);
		Banco b = new Banco(id);
		if (aux == 'y') {
			System.out.print("Enter initial deposit value: ");
			double depositoInicial = sc.nextDouble();
			b = new Banco(id,nome,depositoInicial);
		} else if (aux == 'n' ) {
			b = new Banco (id,nome);
		} 
		System.out.println("");
		System.out.println("Account data:");
		System.out.println("Account "
									+b.getIdConta()
									+", Holder: "
									+b.getNomeTitular()
									+", Balance: $ "
									+String.format("%.2f",b.getSaldoInicial())
						);
		System.out.println("");
		System.out.print("Enter a deposit value: ");
		b.realizaDeposito(sc.nextDouble());
		System.out.println("Updated account data: ");
		System.out.println("Account "
									+b.getIdConta()
									+", Holder: "
									+b.getNomeTitular()
									+", Balance: $ "
									+b.getSaldoInicial()
						);
		System.out.println("");
		System.out.print("Enter a withdraw value: ");
		b.realizaSaque(sc.nextDouble());
		System.out.println("Updated account data: ");
		System.out.println("Account "
									+b.getIdConta()
									+", Holder: "
									+b.getNomeTitular()
									+", Balance: $ "
									+b.getSaldoInicial()
						);
		
		sc.close();
	}

}
