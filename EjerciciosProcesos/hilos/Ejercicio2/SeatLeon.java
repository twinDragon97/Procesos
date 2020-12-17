package Ejercicio2;

public class SeatLeon extends Coche implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("seatLeon "+i);
		}
	}

	


	
	

}
