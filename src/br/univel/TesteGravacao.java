package br.univel;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TesteGravacao {
	
	
	public static void main(String[] args) {
		
		Cliente cloriginal = new Cliente();
		cloriginal.setId(2);
		cloriginal.setNome("Paulo Barbosa");
		
		File file = new File("arquivo.dat");
		
		try (FileOutputStream fos = new FileOutputStream(file); 
				ObjectOutputStream oos = new ObjectOutputStream(fos)){

			oos.writeObject(cloriginal);
			
		}catch(FileNotFoundException e){
			e.printStackTrace();
			
		}catch(IOException e){
			e.printStackTrace();
			
		}
		
	}
	
	
}