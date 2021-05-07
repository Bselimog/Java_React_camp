package BesinciGunOdev1;

import BesinciGunOdev1.business.abstracts.UserService;
import BesinciGunOdev1.business.concretes.CheckManager;
import BesinciGunOdev1.business.concretes.UserManager;
import BesinciGunOdev1.core.abstracts.OutSourceServices;
import BesinciGunOdev1.core.adapters.GoogleManagerLoginAdapters;
import BesinciGunOdev1.dataAccess.concretes.DataBaseUserDao;
import BesinciGunOdev1.entities.concretes.User;
import GoogleLogin.concretes.GoogleLoginManager;

public class Main {

	public static void main(String[] args) {
		UserService userService = new UserManager(new DataBaseUserDao(),new CheckManager(),new GoogleManagerLoginAdapters());
User newUser = new User();
newUser.setId(0);
newUser.setFirstName("Beyza");
newUser.setLastName("Selimoðlu");
newUser.setEmail("selimoglubeyza68@gmail.com");
newUser.setPassword("123987");
userService.add(newUser);
System.out.println("-----------------------------------------------------------------------------------");
userService.login("selimoglubeyza68@gmail.com","123987");

	
User newUser2 = new User();
newUser2.setId(1);
newUser2.setFirstName("Melike");
newUser2.setLastName("Selimoðlu");
newUser2.setEmail("melikeselimoglu@hotmail.com");
newUser2.setPassword("987123");
userService.add(newUser2);
System.out.println("-----------------------------------------------------------------------------------");
User newUser3 = new User();
newUser3.setId(2);
newUser3.setFirstName("Gökçe");
newUser3.setLastName("Selimoðlu");
newUser3.setEmail("gokceselimoglu@gmail.com");
newUser3.setPassword("456789123");
userService.add(newUser3);
System.out.println("-----------------------------------------------------------------------------------");
userService.login("selimoglubeyza68@gmail.com", "123987");
userService.login("gokceselimoglu@gmail.com", "456789123");
System.out.println("-----------------------------------------------------------------------------------");
userService.registerWithService();
userService.loginWithService();
	}

	
}
