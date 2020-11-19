package Ejercicio6;

import java.io.IOException;

public class Ejercicio6 {

	public static void main(String[] args) {

		String comando = "sensible-browser";
		String url = "www.google.es";

		try {
			ProcessBuilder builder = new ProcessBuilder(comando, url);
			builder.start();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
