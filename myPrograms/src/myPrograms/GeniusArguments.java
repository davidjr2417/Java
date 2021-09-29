/*
 * Add At Least 1 New Argument In The Main Function 
 * Should Have At Least 5 Total Parameters Being Passed Into Program)
 * Apply At Least 1 parameter for each team method (Each Teammate Is Responsible For Their Own Method)
 * 
 */
package myPrograms;

public class GeniusArguments {
	
		
	 public static void main(String[] args) {
		 
		 gotBrothers(args[0]); // Call The Method gotJokes() To Run The Block Of Code In That Method
		 gotJokes(args[0], args[1], args[2]); // Call The Method gotJokes() To Run The Block Of Code In That Method
		 gotCommunityNorms(args); // Call The Method gotJokes() To Run The Block Of Code In That Method

	 }
	 
	 public static void gotBrothers(String name) {
		 
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
