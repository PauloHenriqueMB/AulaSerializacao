package br.univel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TesteLeitura {

	
	public static void main(String[] args) {
		
		
		File file = new File("arquivo.dat");//O objeto file aponta para um determinado arquivo (referência) que esteja em uma determinada partição

		
		try(FileInputStream fis = new FileInputStream(file);
				ObjectInputStream ois = new ObjectInputStream(fis)){//A atribuição das variaveis dos recursos dentro dos () define que este sera fechado automaticamente
			
			Cliente clido = (Cliente) ois.readObject();//Será usado um cast forçado (estudar reflection neste caso)
			
			System.out.println("ID: " + clido.getId());
			System.out.println("NOME: "+ clido.getNome());
			
		}catch(FileNotFoundException e){//Irá mostrar uma excessão caso o arquivo não seja encontrado
			e.printStackTrace();
		}catch(IOException e){//Irá mostrar uma excessão caso ocorra alguma objeção na compilação do código
			e.printStackTrace();
		} catch (ClassNotFoundException e) {//Irá mostrar uma excessão caso a classe não seja encontrada
			e.printStackTrace();
		}
		
	}
	
	
}