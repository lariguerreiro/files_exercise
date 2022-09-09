package app;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {

		String path = "C:\\Users\\Larissa\\Documents\\Udemy\\files\\resources\\in";
		String pathOut = "C:\\Users\\Larissa\\Documents\\Udemy\\files\\resources\\out.txt";
		List<String[]> in = new ArrayList<String[]>();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();
			while (line != null) {
				in.add(line.split(","));
				line = br.readLine();
			}

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());

		}
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(pathOut))) {
			for (String[] strings : in) {
				bw.write(strings[0] + ",");
				double total = Double.parseDouble(strings[1]) * Integer.parseInt(strings[2]);
				bw.write(Double.toString(total));
				bw.newLine();
			}
			
			
		} catch (IOException e) {

			e.printStackTrace();
		}

		
	}

}
