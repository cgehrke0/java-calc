package files;

import java.io.*;
import java.util.Scanner;

public class ScannerTest {
	
	public static void main(String[] args) {
		Scanner scanner;
		try {
			scanner = new Scanner(new File("Data.txt"));
			
			while (scanner.hasNextLine()) {
				String name = scanner.nextLine();
				System.out.println("name: " + name);
			}
		} catch (IOException e) {
			// TODO Auto0generated catch block
			e.printStackTrace();
		}
	}

}
