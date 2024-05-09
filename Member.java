public class Member{
	private int memberId;
	private String type;
	private int dateOfMembership;
	private int noOfBookIssued;
	private int maxBookLimit;
	private String name;
	private String address;
	private int phoneNo;
	public Book(int ID, String name) {
		this.setMemberId(0);
		this.setType("N/A");
		this.setdateOfMembership(0);
		this.setNoOfBookIssued(0);
		this.setMaxBookLimit(0);
		this.setName("N/A");
		this.setAddress("N/A");
		this.setPhoneNo(0);
	}//default_cons
	public Book(int memberId,String type,int dateOfMembership,int noOfBookIssued,int maxBookLimit,String name,String address,int phoneNo) {
		this.setMemberId(memberId);
		this.setType(type);
		this.setdateOfMembership(dateOfMembership);
		this.setNoOfBookIssued(noOfBookIssued);
		this.setMaxBookLimit(maxBookLimit);
		this.setName(name);
		this.setAddress(address);
		this.setPhoneNo(phoneNo);
	}//overloaded cons
	public void setMemberId(int memberId) {
		this.bookId = bookId;
	}//setAccountNumber
	public void setType(String type) {
		this.type = type;
	}//setTitle
	public void setDateOfMembership(int dateOfMembership){
		this.dateOfMembership = dateOfMembership;
	}//setAccountNumber
	public void setnNoOfBookIssued(int noOfBookIssued){
		this.noOfBookIssued = noOfBookIssued;
	}//setAccountNumber
	public void setMaxBookLimit(int maxBookLimit){
		this.maxBookLimit = maxBookLimit;
	}//setAccountNumber
	public void setAddress(String address) {
		this.address = address;
	}//setTitle
	public void setPhoneNo(int phoneNo){
		this.phoneNo = phoneNo;
	}//setdateofPurchase

	public int getMemberId(){
		return this.memberId;
	}//getAccountNumber
	public String getType() {
		return this.type;
	}//getTitle
	public String getDateOfMembership() {
		return this.dateOfMembership;
	}//getTitle
	public double getNoOfBookIssued() {
		return this.price;
	}//getTitle
	public int getMaxBookLimit() {
		return this.status;
	}//getTitle
	public int getName() {
		return this.name;
	}//getTitle
	public String getAddress() {
		return this.address;
	}//getTitle
	public int getPhoneNo(){
		return this.PhoneNo;
	}//getTitle
	public void displayBookDetails(){
		System.out.println("The Id of member is              : " + this.getMemberId());
		System.out.println("The type of memeber is           : " + this.getType());
		System.out.println("The NoOfBookIssued of member is  : " + this.getNoOfBookIssued());
		System.out.println("The getMaxBookLimit of member is : " + this.getMaxBookLimit());
		System.out.println("The name of book is              : " + this.getName());
		System.out.println("The Address of member is         : " + this.getAddress());
		System.out.println("The DateOfPurchase of book is    : " + this.getPhoneNo());
	}//printStatement
	public void retrieveMember(){

	}
	public void increaseNoOfBookIssued(){
		this.getNoOfBookIssued() = this.getNoOfBookIssued() + 1;
	}
	public void decreaseNoOfBookIssued(){
		this.getNoOfBookIssued() = this.getNoOfBookIssued() - 1;
	}
	public void PayBill(){

	}
	public String toString(){
		return getBookId() + " " + getType() + " " +  getNoOfBookIssued() + " " +  getMaxBookLimit() + " " + getName() + " " +  getAddress()  + " " +getPhoneNo();
	}
	public boolean equals(Book b) {
		if(this.getBookId() == b.getBookId() && this.getgetType().equals(b.getType()) && this.getNoOfBookIssued() == b.getNoOfBookIssued() && this.getNoOfBookIssued() == b.getNoOfBookIssued() && this.getName().equals(b.getName()) && this.getAddress().equals(b.getAddress()) && this.getPhoneNo() == b.getPhoneNo()){
			return true;
		}else{
			return false;
		}
	}//equals
}//class