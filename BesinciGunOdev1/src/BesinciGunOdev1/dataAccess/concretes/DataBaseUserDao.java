package BesinciGunOdev1.dataAccess.concretes;

import java.util.ArrayList;


import BesinciGunOdev1.dataAccess.abstracts.UserDao;
import BesinciGunOdev1.entities.concretes.User;

public class DataBaseUserDao implements UserDao{

public ArrayList<User> users;
	
	public DataBaseUserDao() {
		this.users = new ArrayList<User>();
	}

	@Override
	public void add(User user) {
		this.users.add(user);
		System.out.println(user.getFirstName() + " " + user.getLastName() + " isimli kullanýcý database'e eklendi.");
	}


	@Override
	public ArrayList<User> getAll() {
		return this.users;
	}

	@Override
	public User getUser(int id) {
	
		
			User returnUser = null;

			for (User user : users) {
			if(user.getId() == id) {
			returnUser = user;
			}
			}

			return returnUser;
			}

	
	
	
	
	
}
