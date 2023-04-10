package movieLibrary;

public class MovieAdmin {

	private Movie[] allMovies;

	Movie movie1 = new Movie(1, "The Shawshank Redemption", "Frank Darabont",
			new String[] { "Tim Robbins", "Morgan Freeman" }, "Drama", "9.3",
			"Two imprisoned men bond over a number of years, finding solace and eventual redemption through acts of common decency.",
			"1994");
	Movie movie2 = new Movie(2, "The Godfather", "Francis Ford Coppola",
			new String[] { "Marlon Brando", "Al Pacino", "James Caan" }, "Crime", "9.2",
			"The aging patriarch of an organized crime dynasty transfers control of his clandestine empire to his reluctant son.",
			"1972");
	Movie movie3 = new Movie(3, "Twilight", "Catherine Hardwicke",
			new String[] { "Kristen Stewart", "Robert Pattinson" }, "Romance", "5.2",
			"A teenage girl risks everything when she falls in love with a vampire.", "2008");
	Movie movie4 = new Movie(4, "Inception", "Christopher Nolan",
			new String[] { "Leonardo DiCaprio", "Tom Hardy", "Ellen Page" }, "Sci-Fi", "8.8",
			"A thief who steals corporate secrets through the use of dream-sharing technology is given the inverse task of planting an idea into the mind of a CEO.",
			"2010");
	Movie movie5 = new Movie(5, "Forrest Gump", "Robert Zemeckis",
			new String[] { "Tom Hanks", "Robin Wright", "Gary Sinise" }, "Romance", "8.8",
			"The presidencies of Kennedy and Johnson, the Vietnam War, and the civil rights movement shape the lives of a young man from Alabama.",
			"1994");
	Movie movie6 = new Movie(6, "The Matrix", "Lilly Wachowski",
			new String[] { "Keanu Reeves", "Laurence Fishburne", "Carrie-Anne Moss" }, "Action", "8.7",
			"A computer hacker learns from mysterious rebels about the true nature of his reality and his role in the war against its controllers.",
			"1999");
	Movie movie7 = new Movie(7, "Searching", "Aneesh Chaganty", new String[] { "John Cho", "Debra Messing" },
			"Mystery/Thriller", "7.6",
			"After his 16-year-old daughter goes missing, a desperate father breaks into her laptop to look for clues to find her.",
			"2018");
	Movie movie8 = new Movie(8, "The Silence of the Lambs", "Jonathan Demme",
			new String[] { "Jodie Foster", "Anthony Hopkins", "Scott Glenn" }, "Crime", "8.6",
			"A young F.B.I. cadet must receive the help of an incarcerated and manipulative cannibal killer to help catch another serial killer, a madman who skins his victims.",
			"1991");
	Movie movie9 = new Movie(9, "Pulp Fiction", "Quentin Tarantino",
			new String[] { "John Travolta", "Samuel L. Jackson", "Uma Thurman" }, "Drama", "8.9",
			"The lives of two mob hitmen, a boxer, a gangster and his wife, and a pair of diner bandits intertwine in four tales of violence and redemption.",
			"1994");
	Movie movie10 = new Movie(10, "The Twilight Saga: New Moon", "Chris Weitz",
			new String[] { "Kristen Stewart", "Robert Pattinson", "Taylor Lautner" }, "Fantasy/Romance", "4.7",
			"Edward leaves Bella after an attack that nearly claimed her life, and in her depression she falls into yet another paranormal relationship - this time with werewolf Jacob Black.",
			"2009");

	public void initializeMovies() {

		allMovies = new Movie[] { movie1, movie2, movie3, movie4, movie5, movie6, movie7, movie8, movie9 };

	}

	public Movie searchByTitle(String title) {
		Movie searched = null;
		for (Movie movie : allMovies) {
			if (movie.getTitle().equalsIgnoreCase(title)) {
				searched = movie;
				break;
			}
		}
		return searched;

	}

	public Movie searchByDirector(String director) {
		Movie searched = null;
		for (Movie movie : allMovies) {
			if (movie.getDirector().equalsIgnoreCase(director)) {
				searched = movie;

			}
		}
		return searched;

	}

	public void listMovies() {
		for (Movie movie : allMovies) {
			if (movie != null) {
				System.out.println(movie + "\n");
			}
		}
	}

	public boolean addMovie(Movie newMovie) {
		for (Movie movie : allMovies) {
			if (movie != null && movie.getTitle().equalsIgnoreCase(newMovie.getTitle())) {
				System.out.println("Error: This movie is already added.");
				return false;
			}
		}
		Movie[] newMovieArray = new Movie[allMovies.length + 1];
		System.arraycopy(allMovies, 0, newMovieArray, 0, allMovies.length);
		newMovieArray[allMovies.length] = newMovie;
		allMovies = newMovieArray;
		System.out.println("Movie added successfully: " + newMovie.getTitle());
		return true;
	}

	public boolean deleteMovie(String title) {
		boolean isDeleted = false;
		Movie[] newMovieArray = new Movie[allMovies.length - 1];
		int index = 0;
		for (Movie movie : allMovies) {
			if (movie != null && !movie.getTitle().equalsIgnoreCase(title)) {
				newMovieArray[index++] = movie;
			} else if (movie != null && movie.getTitle().equalsIgnoreCase(title)) {
				isDeleted = true;
			}
		}
		allMovies = newMovieArray;
		if (isDeleted) {
			System.out.println("Movie deleted successfully: " + title);
			return true;
		} else {
			System.out.println("Error: Movie not found.");
			return false;
		}
	}

}
