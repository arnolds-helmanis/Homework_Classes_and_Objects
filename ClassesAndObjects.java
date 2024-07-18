package Classes_And_Objects;

public class ClassesAndObjects {

	public static void main(String[] args) {
		Movie movie1 = new Movie ("The Shawshank Redemption", 142, "Drama");
		Movie movie2 = new Movie ("Get Hard", 100, "Comedy");
		Movie movie3 = new Movie ("The Hills Have Eyes", 107, "Horror");
		Movie movie4 = new Movie ("Allied", 124, "Action");
		Movie movie5 = new Movie ("Home Alone", 103, "Comedy");
		Movie[] array = {movie1, movie2, movie3, movie4, movie5};
		
		movie2.genreComparison(movie5);
		movie3.getLongestMovie(array);
		movie5.getComedyCount(array);
		movie1.printGenreMovies(array, "action");
	}

}
