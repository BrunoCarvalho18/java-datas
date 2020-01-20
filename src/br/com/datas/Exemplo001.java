package br.com.datas;

import java.util.Calendar;

public class Exemplo001 {

	public static void main(String[] arguments) {
		// Usando o Calendar
		Calendar agora = Calendar.getInstance();

		System.out.println("A data corrente é: " + agora.getTime());

		// Adicionando menos 15 dias
		agora.add(Calendar.DATE, -15);
		System.out.println("15 dias atrás: " + agora.getTime());

		// Adicionando menos 15 dias
		agora.add(Calendar.MONTH, 4);
		System.out.println("4 meses atrás: " + agora.getTime());

		// Adicionando menos 15 dias
		agora.add(Calendar.YEAR, -2);
		System.out.println("2 anos atrás: " + agora.getTime());

	}

}
