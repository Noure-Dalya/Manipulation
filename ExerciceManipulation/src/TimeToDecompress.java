import java.util.Scanner;
/*
*Author : noure-d-zobiri
*Date : Jan. 11, 2021
*/

public class TimeToDecompress
	{

		public static void main(String[] args)
			{
					{
						Scanner sc=new Scanner(System.in);
						
						int nmbre=sc.nextInt();
						int[]n=new int[nmbre];
						String[]s=new String[nmbre];
						sc.nextLine();
						for(int i=0;i<nmbre;i++)
						{
						n[i]=sc.nextInt();
						s[i]=sc.nextLine();
						}
						for(int i=0; i<nmbre; i++)
						{
							for(int j=0; j<nmbre; j++)
							{
								System.out.println(s[i]);
							}
							System.out.println();
						}
						for(int i=0; i<nmbre;i++)
						{
							System.out.println(s[i]);
						}
						System.out.println();
						sc.close();
					}

			}


			}

	
