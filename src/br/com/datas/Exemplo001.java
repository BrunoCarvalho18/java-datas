package br.com.datas;

import java.util.Calendar;

public class Exemplo001 {

	public static void main(String[] arguments) {
		// Usando o Calendar
		Calendar agora = Calendar.getInstance();

		System.out.println("A data corrente �: " + agora.getTime());

		// Adicionando menos 15 dias
		agora.add(Calendar.DATE, -15);
		System.out.println("15 dias atr�s: " + agora.getTime());

		// Adicionando menos 15 dias
		agora.add(Calendar.MONTH, 4);
		System.out.println("4 meses atr�s: " + agora.getTime());

		// Adicionando menos 15 dias
		agora.add(Calendar.YEAR, -2);
		System.out.println("2 anos atr�s: " + agora.getTime());

	}

}
