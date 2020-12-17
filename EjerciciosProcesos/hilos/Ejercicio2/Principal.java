package Ejercicio2;

import Ejercicio1.Tarea;

public class Principal {

	public static void main(String[] args) {

		
		Runnable runnable1 = new SeatLeon();
		Runnable runnable2 = new FordFiesta();

		Thread thread = new Thread(runnable1);
		Thread thread1 = new Thread(runnable2);
		thread.start();
		thread1.start();
	
		
		System.out.println("yo soy el hilo principal y sigo haciendo mi trabajo");
		System.out.println("Fin del hilo principal");
		
		
	}

}
