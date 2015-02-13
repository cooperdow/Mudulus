import java.util.Scanner;
public class challenge1 {
static int numb;
static int yr;
static Scanner userInput= new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Please type a number between 1-100");
		numb=userInput.nextInt();
		
		if (numb%2==0)
		{
		System.out.println("even");	
		}
		else
		{
		System.out.println("odd");
		}
	
		System.out.println("Please type a year");
		yr=userInput.nextInt();
		
		if (yr%4==0)
		{
		System.out.println("leap year");
		}
		else
		{
		System.out.println("cool");
		}
		
		int [] numbs= {2,8,6,4,10,14,18,16,20,12};
		for (int i=0; i<numbs.length; i++)
			{
			if ((i+1)%3==0)
			{
			System.out.println(numbs[i]);
			}
		}
		
		for (int i=1;i<101;i++)
			{
			if (i%3==0)
			{
			System.out.println("fizz");
			}
			if (i%5==0)
			{
			System.out.println("buzz");
			}
			if (i%3==0 && i%5==0)
			{
			System.out.println("fizzbuzz");
			}
			else
			{
			System.out.println(i);
			}
		}
	}
}
