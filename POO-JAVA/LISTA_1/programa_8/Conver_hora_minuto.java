//Disciplina de Programação Orientada à Objetos

//Elabore um programa em Java que receba uma hora (uma variável para hora e
//outra para minutos), calcule e mostre
//a) A variável hora digitada convertida em minutos
//b) O total de minutos, ou seja, os minutos digitados mais a conversão anterior
//c) O total de minutos convertidos em segundos



import java.util.Scanner;


public class Conver_hora_minuto{


	public static void main(String[] args){


	//variaveis
	int hora,minuto,convert_hora,tot_minutos,tot_segund;
	
	
	// Leitura de dados
	Scanner ler = new Scanner(System.in);
	System.out.println("Informe a Hora:");
	hora=ler.nextInt();
	System.out.println("Informe a Minuto:");
	minuto=ler.nextInt();
	
	//operação(ação) aumento do salario em 25%
	convert_hora=hora*60;
	tot_minutos=convert_hora+minuto;
	tot_segund=tot_minutos*60;
	
	
	

	//saída de dados
		
	System.out.println("Hora convertida em minutos:"+convert_hora+"");
	System.out.println("Total digitado mais a conversão :"+tot_minutos+"");
	System.out.println("total de minutos convertido em segundo:"+tot_segund+"");	
	



	}



}