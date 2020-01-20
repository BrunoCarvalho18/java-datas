package br.com.datas;

import java.text.DateFormat;
import java.util.Date;

public class Exemplo002 {
	
	public static void main(String[] args) {
		
		Date agora = new Date();
		
		String converterDataParaString = DateFormat.getInstance().format(agora);
		
		// data mais amigável
		System.out.println(converterDataParaString);
		
		
		
		
	}

}
