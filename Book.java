package Lab2.question2;

public class Book {
private String bookTitle;
private String author;
private String ISBN;
private int numOfCopies;
public Book(String bookTitle, String author, String iSBN, int numOfCopies) {
	super();
	this.bookTitle = bookTitle;
	this.author = author;
	ISBN = iSBN;
	this.numOfCopies = numOfCopies;
}
public Book()
{
	super();
}
public String getBookTitle() {
	return bookTitle;
}
public void setBookTitle(String bookTitle) {
	this.bookTitle = bookTitle;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public String getISBN() {
	return ISBN;
}
public void setISBN(String iSBN) {
	ISBN = iSBN;
}
public int getNumOfCopies() {
	return numOfCopies;
}
public void setNumOfCopies(int numOfCopies) {
	this.numOfCopies = numOfCopies;
}
public void display()
{
	System.out.println("title="+bookTitle+"author"+author+"ISBN"+ISBN+"no of copies"+numOfCopies);
}
@Override
public String toString() {
	return "Book [bookTitle=" + bookTitle + ", author=" + author + ", ISBN=" + ISBN + ", numOfCopies=" + numOfCopies
			+ "]";
}

}
