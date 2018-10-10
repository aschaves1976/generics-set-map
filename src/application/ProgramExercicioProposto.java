package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ProgramExercicioProposto {

	public static void main(String[] args) {

		String path = "C:\\ASChaves\\JAVA\\temp\\election.csv";
		Map<String, Integer> candidato = new HashMap<>();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				if (candidato.containsKey(fields[0])) {
					int soma = Integer.parseInt(fields[1]) + candidato.get(fields[0]);
					candidato.put(fields[0], soma);
				} else {
					candidato.put(fields[0], Integer.parseInt(fields[1]));
				}
				line = br.readLine();
			}

			for (String key : candidato.keySet()) {
				System.out.println(key + ": " + candidato.get(key));
			}

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

}
