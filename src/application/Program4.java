package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program4 {

	public static void main(String[] args) {

		String[] lines = new String[] { "VRUUUM CARALHO!!!", "toubu", "AI CARALHOOOOOOOO" };
		
		String path = "/home/bostafull/Documentos/in.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {  //Se adicionar o parametro true junto ao path o arquivo não
			for (String line : lines) {                                       //é recriado e as linhas são adicionadas continuamente.
				bw.write(line);                                               //try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true)))
				bw.newLine();
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}
