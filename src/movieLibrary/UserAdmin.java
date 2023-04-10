package movieLibrary;

public class UserAdmin {
	public User[] allUsers;
	User currentUser;

	User user1 = new User(1, "nur", "nurr@gmail.com", "7915");
	User user2 = new User(2, "gencer", "gencerr@gmail.com", "5197");
	User user3 = new User(3, "ilayda", "ilayda@gmail.com", "789");
	User user4 = new User(4, "yunus", "yunus@gmail.com", "xyz");
	User user5 = new User(5, "özgür", "özgür@gmail.com", "0101");
	User user6 = new User(6, "ecem", "ecem@gmail.com", "ece12");

	public void initializeUser() {

		allUsers = new User[] { user1, user2, user3, user4, user5 };
	}

	public User searchByUsername(String username) {
		User searched = null;
		for (User user : allUsers) {
			if (user.getUsername().equalsIgnoreCase(username)) {
				searched = user;
				break;
			}
		}
		return searched;

	}

	public void listAllUsers() {
		for (User user : allUsers) {
			if (user != null) {
				System.out.println(user);
			}
		}
	}

	public boolean login(String username, String password) {
		for (User user : allUsers) {
			if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
				currentUser = user;
				return true;
			}
		}
		return false;
	}

	public void logout() {
		if (currentUser != null) {
			System.out.println("Logged out..." + currentUser.getUsername());
		} else
			System.out.println("Error!...");

	}

	public boolean crateUser(User newUser) {
		for (User user : allUsers) {
			if (user != null && user.getUsername().equalsIgnoreCase(newUser.getUsername())) {
				System.out.println("Error: Username is already taken.");
				return false;
			}
		}
		User[] newUserArray = new User[allUsers.length + 1];
		System.arraycopy(allUsers, 0, newUserArray, 0, allUsers.length);
		newUserArray[allUsers.length] = newUser;
		allUsers = newUserArray;
		System.out.println("User created successfully: " + newUser.getUsername());
		return true;
	}

	public boolean deleteUser(String username) {
		boolean isDeleted = false;
		User[] newUserArray = new User[allUsers.length - 1];
		int index = 0;
		for (User user : allUsers) {
			if (user != null && !user.getUsername().equalsIgnoreCase(username)) {
				newUserArray[index++] = user;
			} else if (user != null && user.getUsername().equalsIgnoreCase(username)) {
				isDeleted = true;
			}
		}
		allUsers = newUserArray;
		if (isDeleted) {
			System.out.println("Movie deleted successfully: " + username);
			return true;
		} else {
			System.out.println("Error: Movie not found.");
			return false;
		}
	}

}
