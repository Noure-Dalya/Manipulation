import java.util.Scanner;
/*
*Author : noure-d-zobiri
*Date : Jan. 12, 2021
*/

public class HappySad
	{

		public static void main(String[] args)
			{
				 Scanner in = new Scanner(System.in);
			        String input = in.nextLine();
			       
			        int hs = 0;
			        boolean has = false;

			        for(int i = 0; i < input.length(); i++){
			            if(input.charAt(i) == ':' && input.charAt(i + 1) == '-' ){
			                if(input.charAt(i + 2) == ')'){
			                  hs++;  
			                  has = true;
			                }else if(input.charAt(i + 2) == '('){
			                hs--;
			                has = true;
			                }
			        }

			        }

			        if(hs > 0){
			            System.out.println("happy");
			        }else if(hs < 0){
			            System.out.println("sad");
			        }else if(hs == 0 && has){
			            System.out.println("unsure");   
			        }else{
			            System.out.println("none");
			         
			        }
			       
			}
		
	}
