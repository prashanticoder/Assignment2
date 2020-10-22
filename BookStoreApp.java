package Lab2.question2;
import java.util.Scanner;
public class BookStoreApp {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter 1 for display books 2 order books 3 sell books 4 to exit");
	int n=sc.nextInt();
	Book[] books= {new Book("c","bala guru swamy","66",10)};
	switch(n)
	{
	case 1:displayBooks(books);
	       break;
	case 2:
		  
		 break;
	case 3:
		  
		 break;
	case 4:
		System.out.println("exit");
		  
		 break;
		 default:
			 break;
		 
	}
}
public static void displayBooks(Book[] books)
{
	System.out.println("title="+"author"+"ISBN"+"no of copies");
	for(int i=0;i<books.length;i++)
	{
		books[i].display();
	}
	
}
}
