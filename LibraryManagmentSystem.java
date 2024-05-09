public class LibraryManagmentSystem{
	private String userType;
	private String userName;
	private String password;
	private String[] UserType = {"librian" , "member"};
	private String[] UserName = new String[3];
	private String[] Password = new String[3];
	public Choice(){
		System.out.println("Enter your choice : ");
		String choice = input.nextLine();
		if(choice == "login" || choice == "Login"){
			login();
		}else if(choice == "register" || choice == "Register"){
			int k = 0;
			register(k);
			k++;
		}else if(choice == "logout" || choice == "logout"){
			logout();
		}
	}
	public input(){
		System.out.println("Enter your Name : ");
		userName = input.nextLine();
		System.out.println("Enter your password : ");	
		password = input.nextLine(); 	
	}
	public void login(){
		input();
		boolean IsUserNameFound = false;
		boolean IsPasswordFound = false; 
			for(int i = 0; i < userName.length; i++){
				if(UserName[i].compareTo(userName) && Password[i].compareTo(password) ){
					IsUserNameFound = true;
				}else{
					System.out.println("Invalid input. Enter again....");
					input();
				}
			}//for		
	}//login

	public void register(int i){
			System.out.println("Enter your Name for registration : ");
			UserName[i] = input.nextLine();
			System.out.println("Enter password for registration : ");	
			Password[i] = input.nextLine(); 		
	}//register
}//class