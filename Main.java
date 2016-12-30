package auth;

public class Main {
	public static void main(String[] args) {
		Author bill = new Author();
		bill.setName("Bill");
		bill.setEmail("bill@bill.com");
		bill.setGender('m');

		System.out.println(bill);

		Author kate = new Author();
		kate.setName("Kate");
		kate.setEmail("kate@cunt.com");
		kate.setGender('f');

		System.out.println(kate);

		Book book = new Book();
		book.setGenre("Horror");
		book.setAuthor(bill);
		book.setName("Horror Book");
		book.setCost(50);
		book.setPrice(50);
		book.setInventory(90);

		Book bookScifi = new Book();
		bookScifi.setGenre("Scifi");
		bookScifi.setAuthor(kate);
		bookScifi.setName("Scifi Book");
		bookScifi.setCost(100);
		bookScifi.setPrice(100);
		bookScifi.setInventory(29);

		Book bookFiction = new Book();
		bookFiction.setGenre("Fiction");
		bookFiction.setAuthor(bill);
		bookFiction.setName("Fiction Book");
		bookFiction.setCost(20);
		bookFiction.setPrice(20);
		bookFiction.setInventory(80);

		Book[] Book = { book, bookScifi, bookFiction };
		for (int i = 0; i < Book.length; i++) {
			System.out.println("This book is called " + Book[i].getName() + ". It was written by " + Book[i].getAuthor().getName()  
					+ ". It costs " + Book[i].getCost() + ".");
		}
	}
	
}
