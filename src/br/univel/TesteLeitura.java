package br.univel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TesteLeitura {

	
	public static void main(String[] args) {
		
		
		File file = new File("arquivo.dat");//O objeto file aponta para um determinado arquivo (refer�ncia) que esteja em uma determinada parti��o

		
		try(FileInputStream fis = new FileInputStream(file);
				ObjectInputStream ois = new ObjectInputStream(fis)){//A atribui��o das variaveis dos recursos dentro dos () define que este sera fechado automaticamente
			
			Cliente clido = (Cliente) ois.readObject();//Ser� usado um cast for�ado (estudar reflection neste caso)
			
			System.out.println("ID: " + clido.getId());
			System.out.println("NOME: "+ clido.getNome());
			
		}catch(FileNotFoundException e){//Ir� mostrar uma excess�o caso o arquivo n�o seja encontrado
			e.printStackTrace();
		}catch(IOException e){//Ir� mostrar uma excess�o caso ocorra alguma obje��o na compila��o do c�digo
			e.printStackTrace();
		} catch (ClassNotFoundException e) {//Ir� mostrar uma excess�o caso a classe n�o seja encontrada
			e.printStackTrace();
		}
		
	}
	
	
}