package Ejercicio1Procesos;

import java.io.IOException;

public class Principal {

	public static void main(String[] args) {
		String comandoFirefox="firefox";
		try {
			Runtime.getRuntime().exec(comandoFirefox);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
