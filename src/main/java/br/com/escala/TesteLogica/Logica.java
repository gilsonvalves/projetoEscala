package br.com.escala.TesteLogica;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Logica {

	public static void main(String[] args) {

		String[] nomes = { "Lidiane Lima Dias dos Santos", "Daniel Ferreira de Jesus", "Vanessa Alves Rodrigues",
				"Vitoria Regia Morais Bezerra", "Alexandre Henrique Fonseca", "Ana Amélia da Conceição",
				"Ana Paula Ferreira de Araujo", "Allany de Souza Neves", "Sheila de Souza Ferreira",
				"Aline Helen da Silva Rocha", "Carlos Henrique Sousa e Silva", "Anselmo Bomfim dos Reis",
				"Michel Fonseca da Silva", "Gilson Vieira Alves", "Juliana Martins da Silva", "Marcelo Pires Campos",
				"Tatiane Nunes Machado", "Weslley Joaquim Gomes", "Jaqueline Pereira dos Santos",
				"Paulo Henrique Cunha Santos", "Igor Souza Fonseca", "Isabela dos Santos Martins Coimbra",
				"Katiana Moreira Figueredo", "Rodrigo Magalhaes Nunes", "Gilson da Silva Oliveira",
				"Wiliam Neves Amorim", "Nayra Macedo Alves", "Paulo Henrique Pereira Silva",
				"Celso Francisco da Silva Filho", "Lucas Henrique Dutra", "Roberta Elaina A Sales Marques",
				"Wallan Daniel Duarte Santana", "Fábio Guida de Miranda", "Rafael de Souza Pereira",
				"Jéssica de Oliveira Silva", "Márcia Montalvão dos Santos", "Fernando Ubirajara Nogueira",
				"Raissa Eleuterio Mesquita Maia", "Luan Junior Coutinho", "Jennifer de Souza Maximo",
				"Daniel da Costa Vilarins", "Pamella Pires Martins", "Lyane Silveira Santos",
				"José Nilton de Souza Cabral", "Leonice Silva Morais", "Felipe Alves Cardozo",
				"Valdelucia Maria dos Santos", "Renata Sousa Marques", "Bruno César Tavares Amaral",
				"Helaine Lino Cabral", "Perceus Hudson Costa e Silva", "Marco José Ramos de Sousa",
				"Ricardo Teles Ferreira da Silva", "Francisco Ramos Bisneto", "Leandro Marcos Sousa Rodrigues",
				"Ayrton Rodrigues Alves", "Crysellen Cardoso da Fonseca", "Caio Cesar Viegas de Almeida",
				"Erick Alves Depollo", "Janio Tomé Correia Andrade", "Francisca Natália Augusta",
				"Geovany da Silva Galletti", "Manoel Victor da Costa", "Aristácio Clemente Palmeira",
				"Juliana Sales de Sousa", "Jenifer Alves de Oliveira", "Cynthia Lino Cabral",
				"Kamyla Stephanie  L. Santos", "Edson Furtado Dias", "Lucas Alves de Souza" };

		List<String> lista = new ArrayList<String>();

		for (String x : nomes) {
			lista.add(x);
		}
		Collections.shuffle(lista);
		List<String> dia = lista.subList(0, 15);
		Collections.sort(dia);
		for (String dias : dia) {
			// System.out.println(" "+dias);
		}
		// Dia Sabado quant = 1 a 16
		System.out.println("06 às 12 – Cedente/IB " + dia.get(0));
		System.out.println("07 às 13 – SDG " + dia.get(1));
		System.out.println("07 às 13 – Cedente/IB " + dia.get(2));
		System.out.println("08 às 14 – SDG " + dia.get(3));
		System.out.println("08 às 14 – Cedente/IB " + dia.get(4));
		System.out.println("08 às 14 – Cedente/IB " + dia.get(5));
		System.out.println("08 às 14 – Cedente/IB " + dia.get(6));
		System.out.println("08 às 14 – Cedente/IB " + dia.get(7));
		System.out.println("08 às 14 – Cedente/IB " + dia.get(8));
		System.out.println("13 às 19 – SDG " + dia.get(9));
		System.out.println("14 às 20 – SDG " + dia.get(10));
		System.out.println("14 às 20 – Cedente/IB " + dia.get(11));
		System.out.println("14 às 20 – Cedente/IB " + dia.get(12));
		System.out.println("14 às 20 – Cedente/IB " + dia.get(13));
		System.out.println("14 às 20 – Cedente/IB " + dia.get(14));

	}

}
