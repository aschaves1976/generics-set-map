package application;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import model.entities.Product;
import model.service.CalculationService;

public class ProgramGenericoDelimitado {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Locale.setDefault(Locale.US);
		String path = "C:\\ASChaves\\JAVA\\temp\\productAndPrice.csv";
		List<Product> list = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				list.add(new Product(fields[0], Double.parseDouble(fields[1])));
				line = br.readLine();
			}

			Product p = CalculationService.max(list);
			System.out.println("Most Expensive: ");
			System.out.println(p);

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

}
