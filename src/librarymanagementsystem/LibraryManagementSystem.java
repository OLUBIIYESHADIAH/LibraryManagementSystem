package librarymanagementsystem;
import java.util.ArrayList;
import java.util.Scanner;
public class LibraryManagementSystem {
	static ArrayList<String>
	libraryBooks = new ArrayList<>();
	static ArrayList<String>
	borrowedBooks= new ArrayList<>();

	public static void main(String[] args) {
		libraryBooks.add("Book A");
		libraryBooks.add("Book B");
		libraryBooks.add("Book C");
		libraryBooks.add("Book D");
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("\n1. Display Books 2. Borrow 3. Return 4. Exit");
			int choice =
					scanner.nextInt();
			scanner.nextLine();
			if (choice == 1) {
				System.out.println("Available Books:");
				for (int i = 0; i < libraryBooks.size(); i++) {
					System.out.println((i + 1) + "." + libraryBooks.get(i));
				}
			}
			else if (choice ==2) {
				System.out.print("Enter the book to borrow: ");
				String book = scanner.nextLine();
				boolean found = false;
				for(int i = 0; i <libraryBooks.size(); i++) {
					if
					(libraryBooks.get (i).equalsIgnoreCase(book)) {
						borrowedBooks.add(libraryBooks.remove(i));
						System.out.println("You borrowed:" + book);
						found = true;
						break;
						
					}
				}
				if (!found) {
					System.out.println("Book not available.");
				}
			}
			else if (choice == 3) {
				System.out.print("Enter the book to return: ");
				String book = scanner.nextLine();
				boolean found = false;
				for (int i = 0; i < borrowedBooks.size(); i++) {
					if
					(borrowedBooks.get(i).equalsIgnoreCase(book)) {
						libraryBooks.add(borrowedBooks.remove(i));
						System.out.println("You returned:" + book);
						found = true;
						break;
					}
					
				}
				if (!found) {
					System.out.println("Book not borrowed.");
				}
		}
			else if (choice == 4) {
				System.out.println("Exiting the system.");
				break;
			} else {
				System.out.println("Invalid choice please try again.");
			}
			
		}
		scanner.close();
		// TODO Auto-generated method stub

	}

}
