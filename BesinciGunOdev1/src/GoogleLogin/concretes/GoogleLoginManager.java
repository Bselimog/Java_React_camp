package GoogleLogin.concretes;

import GoogleLogin.abstracts.GoogleLoginService;

public class GoogleLoginManager implements GoogleLoginService {

	@Override
	public void register() {
		System.out.println("Google hesabýnýz ile kayýt oldunuz.");
	}

	@Override
	public void login() {
		System.out.println("Google hesabýnýz ile giriþ yaptýnýz. ");
	}
}