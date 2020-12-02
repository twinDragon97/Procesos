package Ejercicio6Procesos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Principal {

	public static void main(String[] args) {

		String linea, comando = "ls -";
		Process process;
		BufferedWriter writer = null;
		try {
			process = Runtime.getRuntime().exec(comando);
			BufferedReader reader = new BufferedReader(new InputStreamReader(process.getErrorStream()));
			writer = new BufferedWriter(new FileWriter("./resultadoEj6.txt"));
			while ((linea = reader.readLine()) != null) {
				writer.write(linea);
				writer.newLine();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
