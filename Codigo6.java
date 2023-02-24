//llena un array con valores random y te pide si deseas resaltar con []
//los multiplos de 5 o 7

package com.generation;

import java.util.Scanner;

public class Codigo6 {

	//se agrego metodo main
	public static void main(String[] args) {

		//se importo scanner para ingresar datos
		Scanner sc = new Scanner(System.in);
		
		//se arreglo el array
		int[] n = new int[20];

		//se agrego + al contador
		for (int i = 0; i < 20; i++) {
			n[i] = (int) (Math.random() * 381) + 20;
			//se agrego .out para poder imprimir en consola
			System.out.print(n[i] + " ");
		}

		//se agrego la n al final para que de un saldo de linea
		System.out.println("\n¿Qué números quiere resaltar? ");
		System.out.print("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
		//se modifico con scanner para que reciba el numero
		int opcion = sc.nextInt();

		//se modifico el comparador ternario ya que tenia mal sintaxis
		int multiplo = (opcion == 1) ? 5 : 7;
		// : 5 ? 7

		/*
		 * foreach (char e : n) { if (e % multiplo == 0) { System.out.print("[" + e +
		 * "] "); // se agrego } al final de if } else { System.in.print(e + " "); } }
		 */

		//se modifico el for
		for (int e : n) {
			if (e % multiplo == 0) {
				System.out.println("[" + e + "] ");
				// se agrego } para cerrar el bloque de instruccion del if
			} else {
				// se agrego y cambio in por el out en syso
				System.out.println(e + " ");
			}
		}

	}
}
