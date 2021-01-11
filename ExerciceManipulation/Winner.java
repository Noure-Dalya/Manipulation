import java.util.Scanner;
/*
*Author : noure-d-zobiri
*Date : Jan. 8, 2021
*/

public class Winner
	{
public static void main(String[]args) {
		
		Scanner sc=new Scanner(System.in);
		
int a=(sc.nextInt()*3) + (sc.nextInt()*2) + (sc.nextInt());

int b=(sc.nextInt()*3) + (sc.nextInt()*2) + (sc.nextInt());

if(a>b)
	{System.out.println("Winner is Apple");}

else if(b>a)
	{System.out.println("Winner is Banana");}

else
	{System.out.println("Tie, No Winner");}

sc.close();
		
}
	}
