//Disciplina de Programação Orientada à Objetos
//Dcomp-UFS



//Escreva um programa em Java que leia o valor do raio e imprima a área do
//círculo.
import java.util.Scanner;
public class Circulo{

	public static void main(String[] args){


	//variaveis 
	final double PI=3.14;
	double area,raio;
	
	//lendo os dados
	Scanner ler = new Scanner(System.in);
        System.out.print("Qual o valor do raio: ");
         raio = ler.nextFloat();
		System.out.print("Qual o valor do area: ");
         raio = ler.nextFloat();
	//operação

		area=PI* (raio*raio) ;
        System.out.println("A área do Círculo é: " + area + "!");
	
		



	}





}