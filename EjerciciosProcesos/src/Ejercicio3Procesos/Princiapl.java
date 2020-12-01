package Ejercicio3Procesos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class Princiapl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String comando = "ls", linea;
		BufferedWriter output = null;
		Process process;
		try {
			process = Runtime.getRuntime().exec(comando);
			BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));

			output = new BufferedWriter(new FileWriter("./resultado.txt"));

			while ((linea = reader.readLine()) != null) {
				output.write(linea);
				output.newLine();
			}

		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} finally {
			try {
				output.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
