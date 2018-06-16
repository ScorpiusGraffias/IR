package projetos;

import java.util.*;

public class IRJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double salario = 0, imposto = 0, taxa = 0;
		
		Scanner in = new Scanner (System.in);
		
		System.out.print("Informe o salário: ");
		salario = in.nextDouble();
		
		taxa = (salario > 1903.98 && salario < 2866.65) ? 7.5 :
					(salario > 2866.65 && salario < 3751.05) ? 15 :
						(salario > 3751.06 && salario < 4664.68) ? 22.5 :
							(salario > 4664.68) ? 27.5 :
								0;
		
		imposto = (taxa == 7.5) ? (((salario * taxa) / 100) - 142.8) :
			(taxa == 15) ? (((salario * taxa) / 100) - 354.8) :
				(taxa == 22.5) ? (((salario * taxa) / 100) - 636.13) :
					(taxa == 27.5) ? (((salario * taxa) / 100) - 869.36) : 
						0;
					
			System.out.println("O valor do imposto é: " + imposto);
		

	}

}
