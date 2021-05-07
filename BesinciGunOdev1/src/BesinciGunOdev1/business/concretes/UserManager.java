package BesinciGunOdev1.business.concretes;


import BesinciGunOdev1.business.abstracts.CheckService;
import BesinciGunOdev1.business.abstracts.UserService;
import BesinciGunOdev1.core.abstracts.OutSourceServices;
import BesinciGunOdev1.dataAccess.abstracts.UserDao;
import BesinciGunOdev1.entities.concretes.User;

public class UserManager implements UserService {

	private UserDao userDao;
	private CheckService checkService;
	private OutSourceServices outSourceServices;
	
	public UserManager(UserDao userDao ,CheckService checkService,OutSourceServices outSourceServices) {
		super();
		this.userDao = userDao;
		
		this.checkService = checkService;
		this.outSourceServices = outSourceServices;
		
	}

	
	
	@Override
	public void add(User user) {
	if(this.checkService.checkFirstName(user.getFirstName())) 
	{
		if(this.checkService.checkLastname(user.getLastName()))
		{
			if(this.checkService.checkEmail(user.getEmail()))
			{
				if(this.checkService.checkPassword(user.getPassword()))
				{
					this.userDao.add(user);
				}
			}
		}
	}
	}



	@Override
	public void existEmail(String email) {
		for (User user : userDao.getAll()) {
			if (user.getEmail() == email) {
				throw new ArithmeticException("E-Posta adresi zaten mevcut.");
			}
		}
		
	}



	@Override
	public void login(String email, String password) {
		
		for (User user : userDao.getAll()) {
			if (email == user.getEmail() && password == user.getPassword()) {
				System.out.println(user.getFirstName() + " " + user.getLastName() + " Baþarýyla giriþ yaptýnýz.");
				return;
			}
		}
		throw new ArithmeticException("Hatalý eposta adresi veya parola girdiniz. Lütfen tekrar deneyin.");

		
	}



	 @Override
	    public void registerWithService() {
		 outSourceServices.registerWith();
	    }
	 
	    @Override
	    public void loginWithService() {
	    	outSourceServices.loginWith();
	    }
	}




