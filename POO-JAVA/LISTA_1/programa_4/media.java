import java.util.Scanner;
import java.io.*;

public class media{
    
    
    public static void main(String[] args){
        
        //variaveis
        int numero=0,media=0;
        //variavel de controle
        int i=0;
        
            //lendo dados
            for(i=0;i<3;i++){
             Scanner sc = new Scanner(System.in);
             System.out.print("Digite um número:");
             numero=sc.nextInt();   
             media+=numero/3; 
         
            }
         

            System.out.println("A média dos número foi : "+media);
          
        
        
        
    }
    
    
    
    
}