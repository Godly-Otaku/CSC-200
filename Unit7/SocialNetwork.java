package Unit7;

/*
Byron Washington
Unit 7 Project
11/28/2020
Social Network
User input: Amount of friends and names of those friends
Output: The friends and how many friends each friend has
*/
import java.util.Scanner;

public class SocialNetwork {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int amountOfName;
		System.out.println("What is the total number of friends in the network:");
		do { // Check if user input is valid
			System.out.println("Please enter a positive integer");
			while (!scnr.hasNextInt()) {
				System.out.println(scnr.next() + " is not an intger! Please enter an integer.");
			}
			amountOfName = scnr.nextInt();
		} while (amountOfName < 1);
		String[] names = new String[amountOfName]; //Array to hold the names
		int[][] friends = new int[amountOfName][amountOfName]; //Array to hold the amount of friends for each friend
		for (int i = 0; i < amountOfName; i++) { // Enter friends into array
			System.out.println("Enter name #" + (i + 1) + ":");
			String name = scnr.next();
			names[i] = name;
		}
		for (int i = 0; i < amountOfName; i++) { //Add friends to each friend
			for (int j = 0; j < amountOfName; j++) { 
				char iLetter = names[i].toLowerCase().toCharArray()[0];
				char jLetter = names[j].toLowerCase().toCharArray()[0];
				if ((Math.abs(iLetter - jLetter) <= 12) && (names[i] != names[j])) { //Check if the two people are friends
					friends[i][j] += 1;
				}
			}
		}
		printFriends(friends, names); //Print the friends
		scnr.close();
	}

	public static void printFriends(int[][] friends, String[] names) { //Print the friends and the amount of friends they have
		for (String name : names) {
			System.out.print("\t" + name);
		}
		System.out.println();
		for (int i = 0; i < friends.length; i++) {
			System.out.print(names[i] + ":\t");
			for (int x : friends[i]) {
				System.out.print(x + "\t");
			}
			System.out.println();
		}
		System.out.println("\nTotal Friends Count: ");
		for (int i = 0; i < friends.length; i++) { //Add up the sum of friends for each friend
			int sum = 0;
			for (int x : friends[i]) {
				if (x != 0)
					sum += x;
			}
			System.out.println(names[i] + "\t" + sum);
		}
	}
}
/*
What is the total number of friends in the network:
f
f is an incorrect input! Please enter an integer
3
Enter name #1:
Jake
Enter name #2:
Jill
Enter name #3:
Bob
        Jake    Jill    Bob
Jake:   0       1       1
Jill:   1       0       1
Bob:    1       1       0

Total Friends Count:
Jake    2
Jill    2
Bob     2
*/