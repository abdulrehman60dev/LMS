import java.util.ArrayList;
public class BookLibrary{
	private Book book;
	private ArrayList<Book> bookList; 
	public BookLibrary(){
		bookList = new ArrayList<Book>();
	}
	public void addBook(int bookId, String author , String name,double price,int rackNo,String status,String edition){
		bookList.add(new Book(bookId , author , name , price , rackNo , status , edition));
	}
	public void removeBook(int bookId,String author,String name,double price,int rackNo,String status,String edition){
		bookList.remove(new Book(bookId , author , name , price , rackNo , status , edition));
	}
	public void numberOfBooks(){
		bookList.size();
	}
	public void updateDetails(Book book , int indexNumber){
		bookList.set(indexNumber , book);
	}
	public boolean search(String key){
	boolean isFound = false;
			for(int i = 0; i < bookList.size(); i++){
				if(bookList.contains(key)){
					isFound  = true;
				}
			}//loop
		return isFound;
	}
	public String toString(){
		String total = "\n";
		for(int i = 0; i < bookList.size(); i++){
			Book b = bookList.get(i);
			total = total + b.toString() + "\n";
		}
		return total;
	}//toString
}//class
