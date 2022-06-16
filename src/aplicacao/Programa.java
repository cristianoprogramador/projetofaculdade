package aplicacao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import entidades.Pessoa;

public class Programa {

	public static void main(String[] args) {

		String path = "C:\\temp\\importFiles\\DataBase.txt";
		
		List<Pessoa> list = new ArrayList<Pessoa>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String line = br.readLine();
			line = br.readLine();
			while (line != null) {
				
				String[] vetor = line.split("-");
				String nome = vetor[0];
				Integer idade = Integer.parseInt(vetor[1]);
				String email = vetor[2];
				String status = vetor[3];
				
				Pessoa prod = new Pessoa(nome, idade, email, status);
				list.add(prod);
				
				line = br.readLine();
			}
			
			// Aqui você escreve o codigo de verdade depois da primeira importacao
			
			System.out.println("Pessoas cadastradas: ");
			for (Pessoa p : list) {
				System.out.println(p);
			}
			
			
			
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

}
