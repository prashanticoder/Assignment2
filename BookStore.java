package Lab2.question2;



public class BookStore  {
private Book books[];
private int SIZE;


public BookStore()
{
	SIZE=10;
	books=new Book[SIZE];
}

public BookStore(Book[] books) {
	super();
	this.books = books;
	
}

public Book[] getBooks() {
	return books;
}

public void setBooks(Book[] books) {
	this.books = books;
}
public void sell(String bookTitle, int noOfCopies)
{
	int index=-1;
	for(int i=0;i<books.length;i++)
	{
		if(bookTitle.equalsIgnoreCase(books[i].getBookTitle())&&books[i].getNumOfCopies()!=0&&noOfCopies<=books[i].getNumOfCopies())
		{
			int copies=books[i].getNumOfCopies()-noOfCopies;
			books[i].setNumOfCopies(copies);
			index=i;
		}
	}
	if(index!=1)
	{
		System.out.println("remain books");
		books[index].display();
	}
	else
	{
		System.out.println("books not found");
	}
}
public void order(String ISBN,int noOfCopies)
{
	int index=-1;
	for(int i=0;i<books.length;i++)
	{
		if(ISBN.equals(books[i].getISBN()))
		{
			books[i].setNumOfCopies(books[i].getNumOfCopies()+noOfCopies);
			index=i;
		}
	}
	if(index!=-1)
	{
		System.out.println("added books");
	}
	else
	{
		System.out.println("books not found");
	}
}
public void displayDetails()
{
	for(int i=0;i<books.length;i++)
	{
		books[i].display();
		
	}
}


}
