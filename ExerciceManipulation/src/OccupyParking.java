import java.util.Scanner;
/*
*Author : noure-d-zobiri
*Date : Jan. 11, 2021
*/

public class OccupyParking
	{

		public static void main(String[] args)
			{
				Scanner sc=new Scanner(System.in);
				int nb=sc.nextInt();
				sc.nextLine();
				String hier=sc.nextLine();
				String aujour=sc.nextLine();
				
				for(int i=0; i<nb; i++)
				{
					System.out.println(hier.charAt(i));
				}
				sc.close();
			}

	}
