package BesinciGunOdev1.dataAccess.abstracts;

import java.util.ArrayList;


import BesinciGunOdev1.entities.concretes.User;

public interface UserDao {

	void add(User user);
	User getUser(int id);
    ArrayList<User> getAll();
	
}
