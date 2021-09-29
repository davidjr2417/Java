/*
 * Create A New Method That Collects User Input and Passes that Data To The Methods From Last Time
 * Do Not Change Any Of The Other Methods, Must Have New Method Work With Existing Methods
 */
package myPrograms;
import java.util.Scanner;

public class GeniusInput {


	public static void main(String[] args) {
		getUserInput();

	}
	public static void getUserInput() {
		/* Create Scanner*/
		Scanner scanInput = new Scanner(System.in);

		/* Get Name*/
		System.out.println("What Is Your Name?");  //Print Genius Name
		String name = scanInput.nextLine();

		/* Get Joke*/
		System.out.println("What Is The Joke Setup?");  //Print Genius Name
		String jokeSetup = scanInput.nextLine();

		System.out.println("What Is The Joke Punchline?");  //Print Genius Name
		String jokePunch= scanInput.nextLine();


		/* Get Joke*/
		System.out.println("What Is Your Community Norm?");  //Print Genius Name
		String commNorm = scanInput.nextLine();

		String[] userInputArr = {name, jokeSetup, jokePunch, commNorm};

		gotNames(name); // Call The Method gotJokes() To Run The Block Of Code In That Method
		gotJokes(name, jokeSetup, jokePunch); // Call The Method gotJokes() To Run The Block Of Code In That Method
		gotCommunityNorms(userInputArr); // Call The Method gotJokes() To Run The Block Of Code In That Method


	}

	public static void gotNames(String name) {

		/* GENIUS NAMES - SAY OUR NAMES */
		System.out.println("My Name Is " + name);  //Print Genius Name
		System.out.println("My Brother's Name Is Perry Irving.");  //Print Genius Name
		System.out.println("My Brother's Name Is Kevin Butler.");  //Print Genius Name
		System.out.println("----------------------");
		System.out.println("");  //Extra Line
		System.out.println("");  //Extra Line
	}

	/*gotJokes Method Declaration */
	public static void gotJokes(String name, String jokeSetup, String jokePunchLine) {

		/* GENIUS JOKES - WE GOT JOKES */	
		System.out.println("Welcome, My Name Is " + name + "!");  //Print My Name
		System.out.println(jokeSetup);  //Joke Setup 
		System.out.println(jokePunchLine);  //Joke Punch Line
		System.out.println("----------------------");
		System.out.println("");  //Extra Line
		System.out.println("");  //Extra Line

	}

	public static void gotCommunityNorms(String[] allUserInfo) {
		
		/* GENIUS COMMUNITY NORMS - KEEP US ACCOUNTABLE */
		System.out.println("1 OF OUR COMMUNITY NORMS IS:");
		System.out.println("----------------------");
		System.out.println("1. " + allUserInfo[3]);
		System.out.println("----------------------");
		System.out.println("");  //Extra Line
		System.out.println("");  //Extra Line

	}


}
