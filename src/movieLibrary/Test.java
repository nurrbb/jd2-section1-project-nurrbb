package movieLibrary;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		int choice2 = 0;
		MovieAdmin admin1 = new MovieAdmin();
		UserAdmin admin2 = new UserAdmin();
		admin1.initializeMovies();
		admin2.initializeUser();

		System.out.println("Welcome to movie archive.");
		printMenu();

		while (choice != -1) {

			System.out.print("Choise: ");
			choice = sc.nextInt();

			switch (choice) {

			case 1 -> {
				System.out.println("✦•······················•✦•······················•✦");
				sc.nextLine();
				System.out.println("Username: ");
				String username = sc.nextLine();
				System.out.println("Password: ");
				String password = sc.nextLine();
				Boolean user = admin2.login(username, password);
				if (user == true) {
					System.out.println("Login successful.");
				} else {
					System.out.println("Username or password is wrong.");
					System.out.println("✦•······················•✦•······················•✦");
					break;
				}
			}
			case 2 -> {
				System.out.println("✦•······················•✦•······················•✦");
				sc.nextLine();
				System.out.println("Id:(please enter a number greater than 10) ");
				int id = sc.nextInt();
				sc.nextLine();
				System.out.println("Username: ");
				String username = sc.nextLine();
				System.out.println("email: ");
				String email = sc.nextLine();
				System.out.println("Password: ");
				String password = sc.nextLine();
				User user = new User(id, username, email, password);
				admin2.crateUser(user);

				System.out.println("✦•······················•✦•······················•✦");
				break;
			}

			case 3 -> {
				System.out.println("✦•······················•✦•······················•✦");
				System.out.println("1. Search user");
				System.out.println("2. List all users");
				choice2 = sc.nextInt();
				sc.nextLine();
				switch (choice2) {
				case 1:
					sc.nextLine();
					System.out.println("Username: ");
					String username = sc.nextLine();
					User user = admin2.searchByUsername(username);
					System.out.println(user);
					break;
				case 2:
					admin2.listAllUsers();
					break;
				default:
					System.out.println("Invalid choice.");
					break;
				}
				System.out.println("✦•······················•✦•······················•✦");
				break;
			}
			case 4 -> {
				System.out.println("✦•······················•✦•······················•✦");
				sc.nextLine();
				System.out.println("Username: ");
				String username = sc.nextLine();
				admin2.deleteUser(username);
				System.out.println("✦•······················•✦•······················•✦");
				break;
			}

			case 5 -> {

				System.out.println("✦•······················•✦•······················•✦");
				System.out.println("How do you want to search?");
				System.out.println("1. By Director");
				System.out.println("2. By Title");
				choice2 = sc.nextInt();
				sc.nextLine();
				switch (choice2) {
				case 1:
					System.out.println("Director: ");
					String director = sc.nextLine();
					Movie movieByDirector = admin1.searchByDirector(director);
					System.out.println(movieByDirector);
					break;
				case 2:
					System.out.println("Title: ");
					String title = sc.nextLine();
					Movie movieByTitle = admin1.searchByTitle(title);
					System.out.println(movieByTitle);
					break;
				default:
					System.out.println("Invalid choice.");
					break;
				}
				System.out.println("✦•······················•✦•······················•✦");
				break;
			}

			case 6 -> {
				sc.nextLine();
				System.out.println("Id: (please enter a number greater than 10)");
				int id = sc.nextInt();
				sc.nextLine();
				System.out.println("Title: ");
				String title = sc.nextLine();
				System.out.println("Director: ");
				String director = sc.nextLine();
				System.out.println("Actors: (comma-separated)");
				String[] actors = sc.nextLine().split(",");
				System.out.println("Genre: ");
				String genre = sc.nextLine();
				System.out.println("Imdb Rate: ");
				String imdbRate = sc.nextLine();
				System.out.println("Storyline: ");
				String storyline = sc.nextLine();
				System.out.println("Release Date: ");
				String releaseDate = sc.nextLine();
				Movie movie = new Movie(id, title, director, actors, genre, imdbRate, storyline, releaseDate);
				admin1.addMovie(movie);

				break;
			}
			case 7 -> {
				System.out.println("✦•······················•✦•······················•✦");
				admin1.listMovies();
				System.out.println("✦•······················•✦•······················•✦");
				break;
			}

			case 8 -> {
				System.out.println("✦•······················•✦•······················•✦");
				sc.nextLine();
				System.out.println("Title: ");
				String title = sc.nextLine();
				admin1.deleteMovie(title);
				System.out.println("✦•······················•✦•······················•✦");
			}

			case 9 -> {
				System.out.println("✦•······················•✦•······················•✦");
				admin2.logout();
				System.out.println("✦•······················•✦•······················•✦");
			}

			case -1 -> {
				System.out.println("✦•······················•✦•······················•✦");
				System.out.println("Have a nice day! ヾ(＾ ∇ ＾)");
				System.out.println("✦•······················•✦•······················•✦");
			}
			default -> printMenu();

			}
		}
	}

	private static void printMenu() {
		System.out.println("✦•········· Menu ········•✦");
		System.out.println("1: Login.");
		System.out.println("2: Create new user.");
		System.out.println("3: Search user / List all users.");
		System.out.println("4: Delete user.");
		System.out.println("5: Search movie by director or by title.");
		System.out.println("6: Create new movie.");
		System.out.println("7: List all Movies");
		System.out.println("8: Delete movie.");
		System.out.println("9: Log out");
		System.out.println("-1: Quit.");

	}

}
