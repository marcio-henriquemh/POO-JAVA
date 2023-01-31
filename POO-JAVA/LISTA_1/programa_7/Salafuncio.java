//Disciplina de Programação Orientada à Objetos

//Escreva um programa em Java que leia o valor do salário de um funcionário,
//calcule e mostre:
//a) O valor do salário,
//b) O valor do aumento, considerando que o aumento foi de 25%
//c) O novo salário




import java.util.Scanner;


public class Salafuncio{


	public static void main(String[] args){


	//variaveis
	double salario_func=0,novo_sala=0,valor_aumento=0;
	
	// Leitura de dados
	Scanner ler = new Scanner(System.in);
	System.out.println("Informe o salário do Funcionário:");
	double salario_fun = ler.nextFloat();
	
	//operação(ação) aumento do salario em 25%
	
	
	valor_aumento=salario_fun*0.25;
	novo_sala=valor_aumento+salario_fun;

	//saída de dados
		
	System.out.println("Salário Atual:"+salario_fun+"");
	System.out.println("Novo Salário :"+novo_sala+"");
	System.out.println("Valor do aumento:"+valor_aumento+"");	
	

	}



}