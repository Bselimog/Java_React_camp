package GoogleLogin.concretes;

import GoogleLogin.abstracts.GoogleLoginService;

public class GoogleLoginManager implements GoogleLoginService {

	@Override
	public void register() {
		System.out.println("Google hesab�n�z ile kay�t oldunuz.");
	}

	@Override
	public void login() {
		System.out.println("Google hesab�n�z ile giri� yapt�n�z. ");
	}
}