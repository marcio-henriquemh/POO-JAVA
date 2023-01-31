//Disciplina de Programação Orientada à Objetos


//9. Sabe-se que o Kw de energia custa um quinto do salário-mínimo. Faça um
//programa em Java que receba o valor do salário-mínimo e a quantidade de Kw
//consumidos, calcule e mostre:
//a) O valor do Kw
//b) O valor a ser pago por essa residência
//c) O valor a ser pago com desconto de 15%





import java.util.Scanner;


public class Energiakw{


	public static void main(String[] args){


	//variaveis
	 double salario,kw_consumido,valor_kw,valor_pago,valor_desco;	
	
	// Leitura de dados
	Scanner ler = new Scanner(System.in);
	System.out.println("Informe o salário do Funcionário:");
	 salario = ler.nextFloat();
	System.out.println("Informe o valor consumido em Kwh:");
	 kw_consumido = ler.nextFloat();
	
	//operação(ação)
	valor_kw=salario/5;
	valor_pago=valor_kw*kw_consumido;
	valor_desco=valor_pago-(valor_pago*0.15)/100;
	

	
	
	

	//saída de dados
		
	System.out.println("De acordo com seu salário, cada kw consumido sera cobrado: R$"+valor_kw);
        System.out.println("O valor da sua conta será: R$"+valor_pago+". Tendo em vista seu consumo de "+kw_consumido);
        System.out.println("Com o desconto de 15%, o valor será de: R$"+valor_desco);
	

	}



}