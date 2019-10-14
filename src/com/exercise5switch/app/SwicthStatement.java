package com.exercise5switch.app;

import java.util.Scanner;

public class SwicthStatement {

	public static void main(String[] args) {
		
		//Declaracion de constantes
		
		//Declaracion de variables
		int nMes=0;
		char respuesta='y';
		//Construccion de objetos
		Scanner input = new Scanner(System.in);
		
		
		do
		{
			nMes=0;
		//Validacion de los datos de entrada
			while(nMes<=0)
			{
		
				System.out.println("Dame un numero de mes");
				nMes = input.nextInt();
				if(nMes<=0)
				{
					System.out.println("Dato no valido!!");
				}
			}
		
		switch(nMes)
		{
			case 1: System.out.println("Enero");
			break;
			case 2: System.out.println("Febrero");
			break;
			case 3: System.out.println("Marzo");
			break;
			case 4: System.out.println("Abril");
			break;
			case 5: System.out.println("Mayo");
			break;
			case 6: System.out.println("Junio");
			break;
			case 7: System.out.println("Julio");
			break;
			case 8: System.out.println("Agosto");
			break;
			case 9: System.out.println("Septiembre");
			break;
			case 10: System.out.println("Octubre");
			break;
			case 11: System.out.println("Noviembre");
			break;
			case 12: System.out.println("Diciembre");
			break;
			default: System.out.println("No valido");
			break;
		}
		System.out.println("Deseas vizualizar otro mes?(y/n)");
		
		respuesta = input.next().charAt(0);
		
		}while (respuesta=='y');
	}

}
