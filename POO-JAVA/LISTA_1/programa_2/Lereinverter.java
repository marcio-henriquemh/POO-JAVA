package programa_2;
import java.util.Scanner;
public class Lereinverter {

private Scanner dado=new Scanner(System.in)
    
    //funcao

    public void lernumero(){


        System.out.println("Digite o valor:");
        int valor=dado.nextInt();

        invertendo(valor);
    }
   //chamando funcao  
   /**
 * @param numero
 */
private void invertendo(int numero ){

        int i=0;

        while (numero>0) {
            
            i*=10;
            i+=(numero%10);
            numero/=10;
        }

       
        System.out.println("O valor invertido foi:&i",i);

   }



}
