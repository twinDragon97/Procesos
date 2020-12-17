package Ejercicio1;

public class Ejercicio1 {
	
	public static void main(String[] args) {

		Tarea tarea = new Tarea();
		tarea.start();
		System.out.println("yo soy el hilo principal y sigo haciendo mi trabajo");
		System.out.println("Fin del hilo principal");
	}

}
