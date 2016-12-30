"# m-a-1" 
package auth;

public class Book extends Product {
	private Author author;
	private String genre;

	public void setAuthor(Author author) {
		this.author = author;
	}

	public Author getAuthor() {
		return author;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getGenre() {
		return genre;
	}
}
