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
		
		File file = new File("arquivo.dat");//O objeto file aponta para um determinado arquivo (referência) que esteja em uma determinada partição
		
		try (FileOutputStream fos = new FileOutputStream(file); 
				ObjectOutputStream oos = new ObjectOutputStream(fos)){//A atribuição das variaveis dos recursos dentro dos () define que este sera fechado automaticamente

			oos.writeObject(cloriginal);//Envia os atributos do objeto 'cloriginal' para o 'oos' e este grava no 'fos'
			
		}catch(FileNotFoundException e){//Irá mostrar uma excessão caso o arquivo não seja encontrado
			
			e.printStackTrace();
			
		}catch(IOException e){//Irá mostrar uma excessão caso ocorra alguma objeção na compilação do código
			
			e.printStackTrace();
			
		}
		
	}
	
	
}