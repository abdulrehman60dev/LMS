public class Book{
	private int bookId;
	private String author;
	private String name;
	private double price;
	private int rackNo;
	private String status;
	private String edition;
	public Book() {
		this.setBookId(0);
		this.setAuthor("N/A");
		this.setName("N/A");
		this.setPrice(1.0);
		this.setRackNo(0);
		this.setStatus("N/A");
		this.setEdition("N/A");
	}//default_cons
	public Book(int bookId,String author,String name,double price,int rackNo,String status,String edition){
		this.setBookId(bookId);
		this.setAuthor(author);
		this.setName(name);
		this.setPrice(price);
		this.setRackNo(rackNo);
		this.setStatus(status);
		this.setEdition(edition);
	}//overloaded cons
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}//setAccountNumber
	public void setAuthor(String author) {
		this.author = author;
	}//setTitle
	public void setName(String name) {
		this.name = name;
	}//setTitle
	public void setPrice(double price){
		this.price = price;
	}//setAccountNumber
	public void setRackNo(int rackNo){
		this.rackNo = rackNo;
	}//setAccountNumber
	public void setStatus(String status){
		this.status = status;
	}//setAccountNumber
	public void setEdition(String edition){
		this.edition = edition;
	}//setAccountNumber
	public int getBookId(){
		return this.bookId;
	}//getAccountNumber
	public String getAuthor() {
		return this.author;
	}//getTitle
	public String getName() {
		return this.name;
	}//getTitle
	public double getPrice() {
		return this.price;
	}//getTitle
	public int getRackNo() {
		return this.rackNo;
	}//getTitle
	public String getStatus() {
		return this.status;
	}//getTitle
	public String getEdition() {
		return this.edition;
	}//getTitle
	public void displayBookDetails(){
		System.out.println("The Id of book is             : " + this.getBookId());
		System.out.println("The author of book is         : " + this.getAuthor());
		System.out.println("The name of book is           : " + this.getName());
		System.out.println("The rack number of book is    : " + this.getRackNo());
		System.out.println("The status of book is         : " + this.getStatus());
		System.out.println("The edition of book is        : " + this.getEdition());
	}//printStatement
	public void updateStatus(){
		if(status == "Available"){
			status = "Not Available";
		}else if(status == "Not Available"){
			status = "Available";
		}
	}
	public String toString(){
		return getBookId() + " " + getAuthor() + " " + getName() + " " +  getRackNo() + " " +  getStatus() + " " +  getEdition();
	}
	public boolean equals(Book b) {
		if(this.getBookId() == b.getBookId() && this.getAuthor().equals(b.getAuthor()) && this.getName().equals(b.getName()) && this.getRackNo() == b.getRackNo() && this.getStatus().equals(b.getStatus()) && this.getEdition().equals(b.getEdition())){
			return true;
		}else{
			return false;
		}
	}//equals
}//class