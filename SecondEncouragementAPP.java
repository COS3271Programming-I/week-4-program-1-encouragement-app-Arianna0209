package week4;

import java.util.Scanner;
public class SecondEncouragementAPP {
	
	// This program will encourage the user based on their age and how their day went.
	
	static Scanner userinput = new Scanner(System.in);
	public static void main(String[] args) {
		
		// Declare the variables for age and day status:
		Integer age;
		Boolean kid;
		Boolean adult;
		Boolean senior;
		Boolean goodDay;
		
		// Input user age:
		System.out.print("How old are you? ");
		age = userinput.nextInt();
		userinput.nextLine();
		
		// Label the user's age:
		kid = age < 18;
		adult = (age >= 18) && (age < 60);
		senior = age >= 60;
		
		// Input the status of the user's day:
		System.out.print("How are you doing today? Input \"true\" for good and \"false\" for bad: ");
		goodDay = userinput.nextBoolean();
		userinput.nextLine();
		
		// Respond to different ages for a good day:
		if (kid && goodDay) {
			System.out.println("I'm glad you're doing good today, kiddo!");}
		if (adult && goodDay) {
			System.out.println("Great job today! You got so much done!");}
		if (senior && goodDay) {
			System.out.println("That's lovely!");}
		
		// Respond to different ages for a bad day:
		if (kid && !goodDay) {
			System.out.println("I'm sorry your day didn't turn out too good; "
								+ "but tomorrow is a new day and you'll start fresh!");}
		if (adult && !goodDay) {
			System.out.println("Tomorrow will be better, I promise! Let yourself have a break today.");}
		if (senior && !goodDay) {
			System.out.println("Hey it could have been worse!");}
		
	}

}
