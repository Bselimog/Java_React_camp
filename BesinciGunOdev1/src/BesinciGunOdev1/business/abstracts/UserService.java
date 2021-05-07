package BesinciGunOdev1.business.abstracts;




import BesinciGunOdev1.entities.concretes.User;



public interface UserService {

	void add(User user);
	void existEmail(String email);
	void login(String email, String password);
    void registerWithService();
    void loginWithService();
	
}
