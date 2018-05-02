
/*
 * Lab 8 by Victoria Rush and Tim Pieniazek
 * -- May 1, 2018
 */
import java.util.Scanner;


public class GetStudentInfo {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String[] names = {"Amy Tan", "Kim Kardashian", "Carrie Fisher", "Angela Lansbury", "Eleanor Roosevelt",
				"Fannie Brice", "Debbie Reynolds", "Elizabeth Taylor", "Shirley MacLaine", "Kim Driscoll",
				"Peter Parker", "Tony Stark", "Stan Lee", "Ayn Rand", "Rand Paul", "Al Franken", 
				"Mike Huckabee", "Mary Jones", "Tim Smith", "Jimmy Johnson"};
		String[] homeTowns = {"Dayton, OH", "Los Angeles, CA", "Portland, ME", "Boston, MA", "Seattle, WA",
				"Chicago, IL", "New York, NY", "Albequerque, NM", "Atlanta, GA", "Dayton, OH", "Los Angeles, CA",
				"Portland, ME", "Boston, MA", "Seattle, WA", "Chicago, IL", "New York, NY", "Albequerque, NM",
				"Atlanta, GA", "Dayton, OH", "Los Angeles, CA" };
		String[] favoriteFoods = {"Pad Thai", "Mac & Cheese", "Chicken Soup", "Beef Tartare", "Grilled Cheese",
				"PopTarts", "Ramen", "Sauerkraut", "Fruit Snacks", "Sandwiches", "Pad Thai", "Mac & Cheese",
				"Chicken Soup", "Beef Tartare", "Grilled Cheese", "PopTarts", "Ramen", "Sauerkraut", "Fruit Snacks",
				"Sandwiches" };
		
		String cont = "yes";
		int studentID;
		String prompt, studentIDError;
		studentIDError = "That student does not exist. Please try again. (enter a number 1-20): ";

		do {
			prompt = "Welcome to our Java class. Which student would you like to learn more about? (enter a number 1-20):";
			studentID = Validator.getInt(scan, prompt, 1, 20, studentIDError);
			System.out.println();

			prompt = "Student " + studentID + " is " + names[studentID - 1] + ". What would you like to know about "
					+ names[studentID - 1].split(" ")[0] + "? (enter \"hometown\" or \"favorite food\"): ";
			String topic = Validator.getString(scan, prompt);
			System.out.println();

			if (topic.equalsIgnoreCase("Hometown")) {

				prompt = names[studentID - 1].split(" ")[0] + " is from " + homeTowns[studentID - 1]
						+ ". Would you like to know more? (enter \"yes\" or \"no\"): ";

				cont = Validator.getString(scan, prompt);
				System.out.println();

			} else if (topic.equalsIgnoreCase("Favorite")) {

				prompt = names[studentID - 1].split(" ")[0] + " likes " + favoriteFoods[studentID - 1]
						+ ". Would you like to know more? (enter \"yes\" or \"no\"): ";

				cont = Validator.getString(scan, prompt);
				System.out.println();
			} else {

				prompt = "Invalid entry.  Please enter \"hometown\" or \"favorite food\": ";

				topic = Validator.getString(scan, prompt);
				System.out.println();
			}
		} while (cont.equalsIgnoreCase("yes"));

		System.out.println("Thanks!");

	}

}


