//crea una lista de numero aleatorios y en cierra entre parentesis los multiplos 5 o 7 dependiendo la elección del usuario9
import java.util.Scanner;

public class codigo6 {
	  // se agrego me metodo main
	public static void main(String[] args) {
		//se agrego un scanner
		Scanner sc = new Scanner(System.in);
		//se le agrego la palabra new
	    int[] n = new int[20];
	    //se agrego el + faltante al i ++
	    for (int i = 0; i < 20; i++) {
	      n[i] = (int)(Math.random() * 381) + 20;
	      //se agrego el out. faltante
	      System.out.print(n[i] + " ");
	    }
	    //se le agrego n faltante al println
	    System.out.println("\n¿Qué números quiere resaltar? ");
	    System.out.print("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
	    //se cambio la lectura para que se haga mediante el sacnner
	    int opcion = sc.nextInt();
	    //se corrigio lso simbolos del operador ternario
	    int multiplo = (opcion == 1) ? 5 : 7;
	    //se corrigio la escritura del for each
	    for (int num : n) {
	    	if (num % multiplo == 0) {
		        System.out.print("[" + num + "] ");
	    	}else {
	    		//se cambio el in por el out
		        System.out.print(num + " ");
		      }
		}
	   
	      
  	}
	    
	     
}