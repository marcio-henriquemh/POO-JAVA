//Disciplina : Programação Orientada á Objetos
import java.util.Scanner;

public class Aprovacao{

/**
 * @param args
 */
public static void main(String[] args){

    //variaveis
    float media=0, nota,soma=0;
    int contador;
    //nota- recebe um valor do usuário que é referente a nota
    //media - é calculada fazendo a divisão da soma pela quantidade de notas
    //soma- valor total da soma das notas

        Scanner ler= new Scanner(System.in);
    //lendo dados
        for(contador=0;contador<3;contador++){
        System.out.println("Informe a nota "+contador+":");
            nota=ler.nextFloat();
            soma+=nota;
           
        }
        media=soma/contador;
        
   
        //condicional

        //- 00<=3.0 Reprovado
        //3.<=7.0 prova final
        // 7<=10 -aprovado

        if (media<=3.0) {
            System.out.println("Reprovado");
            
        }else if(media<=7.0){

            System.out.println("Prova Final");

        }else if(media>7.0){
            System.out.println("Aprovado");



        }


}





}