
public class UserManager {
	
	public void UserName(User user, String newUserName) {
		
		
			user.setUserName(newUserName);
			System.out.println(newUserName);
		
		
	}
	 public void Password(User user, String nowPassword, String newPassword)
	 	 {
		 if(nowPassword== user.getPassword())
		 {
			 user.setPassword(newPassword);
			 System.out.println("�ifreniz de�i�tirildi");
		 }
		 else if(nowPassword!= user.getPassword())
		 {
			 System.out.println("�ifreniz hatal�");
		 }
		 
	 }
	

}
