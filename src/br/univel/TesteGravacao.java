package br.univel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TesteGravacao {

	
	public static void main(String[] args) {
		
		
		File file = new File("arquivo.dat");
		FileInputStream fis;
		
		try{
			fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Cliente clido = (Cliente) ois.readObject();
			
			System.out.println("ID: " + clido.getId());
			System.out.println("NOME: "+ clido.getNome());

			ois.close();
			fis.close();
			
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
	
}