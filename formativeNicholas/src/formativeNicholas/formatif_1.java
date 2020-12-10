package formativeNicholas;
import java.util.Scanner;
/*
* Author : nicopicko
* Date : Dec. 10, 2020
*/
public class formatif_1
	{

		public static void main(String[] args)
			{
				Scanner sc = new Scanner(System.in);
				int []tab = {12, 45, 33, 11};
				System.out.println(somme(tab));
				
				System.out.println("Quelle nombre est ce que vous cherche?");
				int element = sc.nextInt();
				if(findElement(tab, element))
					System.out.println(element + " est present");
				else
					System.out.println(element + "est absent");
				

			}
		
		static int somme(int []myTab) 
			{
			int somme = 0;
			int resultat = 0;
			for(int i = 0; i < myTab.length; i++)
			{
				somme+=myTab[i];
			
			}
			return somme;
			}
		
		static boolean findElement(int []Array, int x)
			{
			for(int i = 0; i < Array.length; i++)
				{
				if(Array[i] == x)
					return true;
				}
			return false;
			}
	}
