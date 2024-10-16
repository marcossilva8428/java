package br.com.geekuniversity.secao19;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//	Mapa /Map

/*
 * Os mapas são representados em Java pela interface Map
 * e mapeia seus elementos utilizando o conceito de chave/valor
 * 
 * - Mapas são conhecidos como se fossem/Representassem 3 coleções
 * 	- Coleção de chaves
 * 	- Coleção de valores
 * 	- Coleção de asssociações
 */

public class Programa50 {

	public static void main(String[] args) {
		Map<Integer, String> pessoas = new HashMap<Integer, String>();
		
		pessoas.put(21,"Janaina Baldarenas");
		pessoas.put(53, "Beraldo Luiz");
		pessoas.put(87, "Silvestre Camargo");
		
		
		//	Coleção de chaves
		System.out.println("Chaves: "+ pessoas.keySet());
		
		// Coleção de valores
		System.out.println("Valores: "+pessoas.values());
		
		//	Coleção de associações
		System.out.println("Associação: "+pessoas.entrySet());
		

		
		//	Iterar na coleção de chaves
		
		//	Forma 1
		//	Disponibilizado a partir do Java 8
		pessoas.keySet().forEach(idade -> {
			System.out.println(pessoas.get(idade));
		});
		
		//	Forma 2
		Set<Integer> chaves = pessoas.keySet();
		for(Integer idade: chaves) {
			System.out.println(pessoas.get(idade));
		}
		
		//	Forma 1
		//Iterar na coleção de valores
		Collection<String> valores = pessoas.values();
		for(String nome : valores) {
			System.out.println(nome);
		}
		
		//	Forma 2
		pessoas.values().forEach(nome -> {
			System.out.println(nome);
		});
		
		//	Iterar a coleção de associações
		
		//	Forma 1
		Set<Entry<Integer, String>> associacoes = pessoas.entrySet();
		for(Entry<Integer, String> associacao: associacoes) {
			System.out.println(associacao.getKey() + " - " + associacao.getValue());
		}
		
		//	Forma 2
		pessoas.entrySet().forEach(associacao ->{
			System.out.println(associacao.getKey() + " - " + associacao.getValue());
		});

	}

}
