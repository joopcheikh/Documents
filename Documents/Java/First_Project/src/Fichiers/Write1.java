package Fichiers;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Write1 {

	public static void main(String[] args) throws IOException
	{
		File file = new File("C://Users/DELL/Desktop/fichiersJ/fichier1.txt");
		
		if(file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else {
			try {
				FileWriter writer = new FileWriter(file);
				BufferedWriter bwr = BufferedWriter(writer);
				
				bwr.write("Hello word");
				bwr.write("Bonjour tout le monde");
				
				bwr.close();
				writer.close();				
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	private static BufferedWriter BufferedWriter(FileWriter writer) {
		// TODO Auto-generated method stub
		return null;
	}

}
