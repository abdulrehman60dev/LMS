import java.util.Scanner;
public class Librarian{
	private String name;
	private String password;
	private Book book;
	private BookLibrary lib;
	public void searchBook(){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter book name that you want to search  : ");
		String key = input.nextLine();
		boolean isFound = false;
		if(isFound){
			System.out.println("The specific book is found");
		}else{
			System.out.println("The specific book is not found");
		}
	}//searchBook
	public void addBook(){
		Scanner input = new Scanner(System.in);
		Scanner in    = new Scanner(System.in);
		Scanner i     = new Scanner(System.in);
		System.out.print("Enter Id of the book  : ");
		int bookId = i.nextInt();
		System.out.print("Enter author of the book  : ");
		String author = input.nextLine();
		System.out.print("Enter name of the book    : ");
		String name = input.nextLine();
		System.out.print("Enter price of the book   : ");
		double price = in.nextDouble();
		System.out.print("Enter rack Number of the book  : ");
		int rackNo = i.nextInt();
		System.out.print("Enter status of the book  : ");
		String status = input.nextLine();
		System.out.print("Enter edition of the book  : ");
		String edition = input.nextLine();
		this.lib = new BookLibrary();
		lib.addBook(bookId , author , name , price , rackNo , status , edition);
	}//addBook
	public String display(){
		this.lib = new BookLibrary();
		return lib.toString();
	}
	public void issueBook(){
		
	}//aaddBook
	public void createBill()
	{
	}





}//class