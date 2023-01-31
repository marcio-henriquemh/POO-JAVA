//Disciplina de Programação Orientada à Objetos


//Elabore um programa que receba o valor do salário-mínimo e o valor do
//salário de um funcionário. Calcule e mostre a quantidade de salários-mínimos
//que esse funcionário ganha.

import java.util.Scanner;

public class Quantsala{

	public static void main(String[] args){
	//variaveis
	float salamin,salafun;
	float total;

	//lendo dados
 	Scanner ler = new Scanner(System.in);
        System.out.print("Qual o salário do funcionario: ");
         salafun = ler.nextFloat();
	System.out.println("Qual o  valor do salário minímo");
		 salamin=ler.nextFloat();


	//operação
	total=salamin/salafun;
        System.out.println("A quantidade de salario foi " + total + "!");
    }



}



