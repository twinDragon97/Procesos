package Ejercicio2Procesos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Pricipal {

	public static void main(String[] args) {
		String comando = "ls -l /";
		String linea;
		try {
			Process process = Runtime.getRuntime().exec(comando);
			BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
			while ((linea=reader.readLine())!= null) {
				System.out.println(linea);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
