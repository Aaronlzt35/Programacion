/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;
import java.util.Scanner;//importar clase scanner para leer datos por pantalla
/*
 * @author AaronFloresTarajano
 */
public class Factorial {
    double num;
    double factorial;
    /*
     * @param args the command line arguments
     */
public static void main(String[] args) {
         Scanner sc=new Scanner (System.in);
              //Se piden los datos por pantalla
             System.out.print("Introduce el numero");
            double num= sc.nextInt(); //lee el dato por pantalla
             double factorial=1; //inicializa a 1 y lo declara
               while(num!=0){
                   factorial*=num;
                   num--;
               }
System.out.print("El factorial es:" + factorial);
System.out.println("este");
}
}
