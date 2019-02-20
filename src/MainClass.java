import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigInteger;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBException;

import magazzino.Magazzino;
import magazzino.TipoProdotto;

public class MainClass 
{

	public static void main(String[] args) throws JAXBException, IOException 
	{
		Magazzino magazzino;
		String categoria;
		magazzino=(Magazzino) XMLunmarshaller.unmarshal("magazzino.xml", "magazzino");
		System.out.println(magazzino.toString());
		ConsoleInput tastiera= new ConsoleInput();
		List<TipoProdotto> prodottiInEsaurimento= new ArrayList<TipoProdotto>();
		System.out.println("Inserisci la categoria");
		categoria=tastiera.readLine();
		creaListaProdottiInEsaurimento(prodottiInEsaurimento, magazzino, categoria);
		System.out.println("Prodotti da ordinare per la categoria " + categoria+":");
		if (prodottiInEsaurimento.size()!=0)
		{
			for (int i = 0; i < prodottiInEsaurimento.size(); i++) 
			{
				System.out.println("Codice: " + prodottiInEsaurimento.get(i).getCodice().toString());
				System.out.println("Marca: " +prodottiInEsaurimento.get(i).getMarca().toString());
				System.out.println("Modello: " +prodottiInEsaurimento.get(i).getModello().toString()+"\n");
			}
		}
		else
			System.out.println("nessuno");
	}

	private static void creaListaProdottiInEsaurimento(List<TipoProdotto> prodottiInEsaurimento, Magazzino magazzino, String categoria) 
	{
		int numeroProdotti;
		
		
		numeroProdotti=magazzino.getNumeroElementi();
		TipoProdotto p;
		
		
		for (int i = 0; i < numeroProdotti; i++) 
		{
			p=magazzino.getSingoloProdotto(i);
			if (p.getQuantita().compareTo(BigInteger.valueOf(1))<0 && p.getCategoria().compareToIgnoreCase(categoria)==0)
			{
				prodottiInEsaurimento.add(p);
			}
		}
		
		
	}

}
