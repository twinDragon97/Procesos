package Ejercicio1Files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Principal {

	public static void main(String[] args) {
		// Variables
		BufferedReader br = null;
		BufferedWriter bw = null;
		String linea;

		// Inicio

		try {
			br = new BufferedReader(new FileReader("src/Ejercicio1/original.txt"));
			bw = new BufferedWriter(new FileWriter("src/Ejercicio1/copia.txt"));

			while ((linea = br.readLine()) != null) {
				bw.write(linea);
				bw.newLine();
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				br.close();
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
