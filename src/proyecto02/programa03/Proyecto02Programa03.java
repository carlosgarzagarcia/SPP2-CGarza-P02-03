/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto02.programa03;
import java.util.Scanner;
/**
 *
 * @author carlos
 */
public class Proyecto02Programa03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      System.out.println("Programa 3");
        matriz();
    }
    public static void matriz(){
        int f,c;
        
        System.out.println("Introduzca el tamaño de la matriz");
       
                 f=solicitaTamaño(" número de filas");
                 c=solicitaTamaño("número de columnas");
        
        System.out.println("\nValores de la matriz: \n");
        int[][]arreglo=solicitarValores(f,c);
        System.out.println("\nCaracteres *:");
        for (int i = 0; i < arreglo.length; i++){
            System.out.println();
            for (int j = 0; j < arreglo[0].length; j++){
                for(int k=1;k<=arreglo[i][j];k++){
                    System.out.print("*");
                }
                if(!(j==(arreglo[0].length-1)))System.out.print(" - ");
            }
            System.out.print("\n");
        }
        
        }
        public static int solicitarEntero(){
    Scanner entrada= new Scanner (System.in);
        boolean flag;
        int n=0;
        do{
            System.out.println("Introducir un número entero");
            try{
                n=entrada.nextInt();
                flag=false;
                
            }
            catch(Exception er){
                System.out.println("Lo que introdujo no es un entero, Inténtalo de nuevo");
                flag=true;
                entrada.nextLine();
            }
        }while (flag);
        
        return n;
        }
        public static int[][] solicitarValores(int m, int n){
            int[][] arreglo = new int [m][n];
            for (int i = 0; i < arreglo.length; i++) {
                for (int j = 0; j < arreglo[i].length; j++) {
                    System.out.println("Introduzca el valor para "+i+", "+j);
                    arreglo [i][j]=solicitarEntero();
                }    
            }

            return arreglo;
        }
    
    
        public static int solicitaTamaño(String tamaño){
            int x;
            boolean flag;
            System.out.println("Valor del "+tamaño);
            do{
                x=solicitarEntero();
                flag=true;
                if(x<1){
                    System.out.println("Introducir un valor entero positivo");
                    flag=false;
                }
            }while(flag==false);

            return x; 
}
}
