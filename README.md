# AulaSerializacao

/*
 * 
 * SERIALIZAÇÃO: DIVIDIR UM DETERMINADO ARQUIVO/INFORMAÇÃO EM ALGUNS PEDAÇOS
 * DESERIALIZAÇÃO: MONTAR UM DETERMINADO ARQUIVO/INFORMAÇÃO OUTRORA SERIALIZADA
 * 
 * ESTUDAR: http://www.devmedia.com.br/introducao-a-serializacao-de-objetos/3050
 * 
 * 
 */

//Implements Serializable irá permitir que objetos da classe Cliente possam ser serializados
/*
 * ENTRE A SERIALIZAÇÃO E DESERIALIZAÇÃO HÁ UM DETERMINANTE O QUE É O TEMPO
 * NESTE TEMPO PODE SURGIR-SE NOVAS VERSÕES DO SOFTWARE DE LEITURA O QUAL DETERMINADA CLASSE
 * POSSUI ATRIBUTOS DIFERENTES DO PROGRAMA QUE SERIALIZOU AS INFORMAÇÕES
 * 
 * NESTE CASO SERÁ USADA UM SERIALVERSIONUID PARA COMPARAR SE CLASSE QUE FOI SERIALIZADA
 * É DA MESMA VERSÃO DA CLASSE PRESENTE NO SOFTWARE DE LEITURA
 * 
 */
 
 # Dentro Classe Cliente
 
 /**
	 * 
	 * private = atributo privado
	 * static = atributo statico
	 * final = declará que o atributo, método ou classe tem uma única atribuição que se mantém
	 * constante, ou seja, não poderá ser alterada no decorrer do processamento
	 * 
	 */
