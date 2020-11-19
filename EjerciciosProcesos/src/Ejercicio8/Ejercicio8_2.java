package Ejercicio8;

import java.util.Map;
import java.util.Set;

public class Ejercicio8_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ProcessBuilder pb = new ProcessBuilder();
		Map<String, String> envMap = pb.environment();
		Set<String> keys = envMap.keySet();
		for (String key : keys) {
			System.out.println(key + " ==> " + envMap.get(key));
		}
	}

}
