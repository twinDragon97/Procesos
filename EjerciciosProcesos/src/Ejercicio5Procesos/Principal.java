package Ejercicio5Procesos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String comando = "ls -";
		String linea;
		Process process;

		try {
			process = Runtime.getRuntime().exec(comando);
			BufferedReader reader = new BufferedReader(new InputStreamReader(process.getErrorStream()));
			while ((linea = reader.readLine()) != null) {
				System.out.println(linea);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
