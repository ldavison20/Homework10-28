import java.util.Scanner;
public class homework 
{

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
        System.out.println("Please input any string: ");
        String str = keyboard.nextLine();

        char firstLetter = str.charAt(0);
        char secondLetter = str.charAt(str.length() - 1);
        System.out.println("The First char is " + firstLetter + " and it is " + secondLetter + " and the length is " + str.length());

        String firstHalf = str.substring(0, str.length() / 2);
        System.out.println("The first half of the string " + firstHalf);

        System.out.println("Please input a char to search for");
        String bigChar = keyboard.nextLine();
        System.out.println("the index where this char is " + str.indexOf(bigChar));

        System.out.println("Please input a starting point: ");
        String startStr = keyboard.nextLine();
        int start = Integer.parseInt(startStr);
        System.out.println("Please input an end: ");
        String endStr = keyboard.nextLine();
        int end = Integer.parseInt(endStr);
        System.out.println("The string you selected is: " + str.substring(start, end));
	}

}
