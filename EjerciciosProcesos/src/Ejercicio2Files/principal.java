package Ejercicio2Files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class principal {

	public static void main(String[] args) {

		BufferedReader reader = null;
		BufferedWriter writer = null;
		String linea;
		String lineaCodificada;

		try {
			reader = new BufferedReader(new FileReader("Archivos/fichero_a_cifrar.txt"));
			writer = new BufferedWriter(new FileWriter("Archivos/fichero_cifrado.txt"));
			
			while ((linea = reader.readLine()) != null) {
				lineaCodificada=Codificador.codifica(linea);
				writer.write(lineaCodificada);
				writer.newLine();
				
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				reader.close();
				writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

}
