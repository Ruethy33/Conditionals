import java.util.Scanner;
public class Conditionals 
{
	public static void main(String[] args) 
	{
		Scanner userInput = new Scanner(System.in);

		System.out.println("Lets go on an adventure!");
		String answer = userInput.nextLine();
		if (answer.equals("ok"))
		{
			System.out.println("ooh yay! Where should we start? The golden Pathway?");
			String answer2 = userInput.nextLine();
			if (answer2.equals("yes"))
			{
				System.out.println("Ok, let's go!");
			}
			if (answer2.equals("sure"))
			{
				System.out.println("Ok, let's go!");
			}
			else
			{
				System.out.println("well then,. i don't want to go on an adventure with you anymore, goodbye.");
			}
		}
		else
		{
			System.out.println("Ah bummer ok..");
		}
	}
}
	
