package movieLibrary;

import java.util.Arrays;

public class Movie {

	private final int id;
	private String title;
	private String director;
	private String[] actors;
	private String genre;
	private String imdbRate;
	private String storyline; // instead of explanation. Makes more sense.
	private String releaseDate;

	public Movie(int id, String title, String director, String[] actors, String genre, String imdbRate,
			String storyline, String releaseDate) {
		this.id = id;
		this.title = title;
		this.director = director;
		this.actors = actors;
		this.genre = genre;
		this.imdbRate = imdbRate;
		this.storyline = storyline;
		this.releaseDate = releaseDate;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String[] getActors() {
		return actors;
	}

	public void setActors(String[] actors) {
		this.actors = actors;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getImdbRate() {
		return imdbRate;
	}

	public void setImdbRate(String imdbRate) {
		this.imdbRate = imdbRate;
	}

	public String getStoryline() {
		return storyline;
	}

	public void setStoryline(String storyline) {
		this.storyline = storyline;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Movie [id=" + id + ", title=" + title + ", director=" + director + ", actors=" + Arrays.toString(actors)
				+ ", genre=" + genre + ", imdbRate=" + imdbRate + ", storyline=" + storyline + ", releaseDate="
				+ releaseDate + "]";
	}

}
