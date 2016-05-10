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
		
		File file = new File("arquivo.dat");//O objeto file aponta para um determinado arquivo (refer�ncia) que esteja em uma determinada parti��o
		
		try (FileOutputStream fos = new FileOutputStream(file); 
				ObjectOutputStream oos = new ObjectOutputStream(fos)){//A atribui��o das variaveis dos recursos dentro dos () define que este sera fechado automaticamente

			oos.writeObject(cloriginal);//Envia os atributos do objeto 'cloriginal' para o 'oos' e este grava no 'fos'
			
		}catch(FileNotFoundException e){//Ir� mostrar uma excess�o caso o arquivo n�o seja encontrado
			
			e.printStackTrace();
			
		}catch(IOException e){//Ir� mostrar uma excess�o caso ocorra alguma obje��o na compila��o do c�digo
			
			e.printStackTrace();
			
		}
		
	}
	
	
}