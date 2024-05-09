public class Bill{
	private int billNo;
	private int date;
	private int memberId;
	private double amount;
	public Bill() {
		this.setBillNo(0);
		this.setDate(0);
		this.setMemberId(0);
		this.setAmount(0);
	}//default_cons
	public Bill(int billNo,int date,int memberId,int amount) {
		this.setBillNo(billNo);
		this.setDate(date);
		this.setMemberId(memberId);
		this.setAmount(amount);
	}//overloaded cons
	public void setBillNo(int billNo) {
		this.billNo = billNo;
	}//setAccountNumber
	public void setDate(int date) {
		this.date = date;
	}//setTitle
	public void setMemberId(int memberId){
		this.memberId = memberId;
	}//setAccountNumber
	public void setAmount(double amount){
		this.amount = amount;
	}//setAccountNumber
	

	public int getBillNo(){
		return this.billNo;
	}//getAccountNumber
	public int getDate() {
		return this.date;
	}//getTitle
	public int getMemberId() {
		return this.memberId;
	}//getTitle
	public double getAmount() {
		return this.amount;
	}//getTitle
	public void displayBookDetails(){
		System.out.println("The Id of member is              : " + this.getBillNo());
		System.out.println("The type of memeber is           : " + this.getDate());
		System.out.println("The NoOfBookIssued of member is  : " + this.getMemberId());
		System.out.println("The getMaxBookLimit of member is : " + this.getAmount());
	}//printStatement
	public void billCreate(){
		
	}
	public void billUpdate(){
		
	}
	
	public String toString(){
		return getBillNo() + " " + getDate() + " " +  getMemberId() + " " +  getAmount();
	}
	public boolean equals(Bill b) {
		if(this.getBillNo() == b.getBillNo() && this.getDate() == b.getDate() && this.getMemberId() == b.getMemberId() && this.getAmount() == b.getAmount() ){
			return true;
		}else{
			return false;
		}
	}//equals
}//class