package kapitel7;

import java.util.List;
import java.util.stream.Collectors;
import java.util.Comparator;

public class HP7_1 
{
	public static void main(String[] args)
	{
		List<Article> articles = List.of(
				new Article("A",1500), 
				new Article("B",700), 
				new Article("C",1200), 
				new Article("D",600) );
	
		List<String> cheapArticleNames =
			articles.stream()
			.filter(a -> a.art_Preis < 1000.0)
			.sorted(Comparator.comparingDouble((Article a) -> a.art_Preis))
			.map(a -> a.art_Bez)
			.collect(Collectors.toList());

		System.out.println(cheapArticleNames);
	}		
}

