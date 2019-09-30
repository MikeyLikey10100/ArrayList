import java.util.ArrayList;
import java.util.Collections;

public class ArrayListChallenges
	{
		static ArrayList<String> sneakers = new ArrayList<String>();

		public static void main(String[] args)
			{
				sneakers();
				System.out.println(" ");
				alpha();
				System.out.println(" ");
				firstAndLast();
			}

		public static void sneakers()
			{

				sneakers.add("Yeezy 350 V2 Zebras");
				sneakers.add("Jordan 11 Bred");
				sneakers.add("Gucci Ace Embroidered Sneakers");
				sneakers.add("Off White/ Air Jordan 1 Universal Blue");
				sneakers.add("Jordan 1 Chicago");
				sneakers.add("Pharrell Williams NMD Human Races Scarlet");
				sneakers.add("Jordan 4 Retro Bred");
				sneakers.add("Nike Air Force 1");
				sneakers.add("Vans x Supreme red Checker box logo ");
				sneakers.add("Converse Comme de Garcons");

				for (String s : sneakers)
					{
						System.out.println(s);
					}
			}

		public static void alpha()
			{
				Collections.sort(sneakers);
				System.out.println("Here are the List of Shoes");
				for (String s : sneakers)
					{
						System.out.println(s);
					}
			
			}
		public static void firstAndLast()
		{
			String firstItem = sneakers.get(0);
			String lastItem = sneakers.get(sneakers.size() - 1); 
			System.out.println(firstItem);
			System.out.println(lastItem);
			
		}
		
		public static void getRidOfFirstLetter()
		{
			for(int i = sneakers.size() - 1; i >=0; i-- )
				{
				
			if(sneakers)
				}
		}

	}
