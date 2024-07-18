package Classes_And_Objects;

public class Movie {
	private String title;
	private double lengthMinutes;
	private String genre;
	
	
	public Movie (String title, double lengthMinutes, String genre) {
		this.title = title;
		this.lengthMinutes = lengthMinutes;
		this.genre = genre;
	
	}
	
	public void genreComparison (Movie movie) {
		if (this.genre.trim().equalsIgnoreCase(movie.genre.trim())) {
			System.out.println("Genres of movies '" + this.title + "' and '" + movie.title + "' are the same - " + this.genre + ".");
		} else {
			System.out.println("Genres of movies '" + this.title + "' and '" + movie.title + "' are not the same.");
		}
	}
	
	void getLongestMovie (Movie[] movies) {
		double longestMinutes = 0;
		String title = movies[0].title;
		for (int i = 0; i < movies.length; i++) {
			if (movies[i].lengthMinutes > longestMinutes) {
				longestMinutes = movies[i].lengthMinutes;
				title = movies[i].title;
			}
		}
		System.out.println("The longest movie is '" + title +  "' and it is " + longestMinutes + " minutes long.");
	}
	
	void getComedyCount (Movie[] movies) {
		int count = 0;
		for (int i = 0; i < movies.length; i++) {
			if (movies[i].genre.trim().equalsIgnoreCase("Comedy")) {
				count++;
			} else {
				continue;
			}
		}
		System.out.println("In the list of given movies, there are " + count + " comedies.");
	}
	
	void printGenreMovies (Movie[] movies, String genre) {
		int movieCount = 0;
		System.out.println("Names of the movies from chosen genre:");
		for (int i = 0; i < movies.length; i++) {
			if (movies[i].genre.trim().equalsIgnoreCase(genre.trim())) {
				movieCount++;
				System.out.println(" - " + movies[i].title);
			} else {
				continue;
			}
		}
		if (movieCount > 1) {
			System.out.println("In the list there are " + movieCount + " movies of the chosen genre - " + genre + ".");
		} else if (movieCount == 1) {
			System.out.println("In the list there is 1 movie of the chosen genre - " + genre + ".");
		} else {
			System.out.println("Oops, there are no movies with a genre - " + genre + ".");
		}
	}

}
