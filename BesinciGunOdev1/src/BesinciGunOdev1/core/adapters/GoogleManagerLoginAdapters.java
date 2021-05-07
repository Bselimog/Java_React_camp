package BesinciGunOdev1.core.adapters;

import BesinciGunOdev1.core.abstracts.OutSourceServices;
import GoogleLogin.concretes.GoogleLoginManager;

public class GoogleManagerLoginAdapters implements OutSourceServices {

	@Override
	public void registerWith() {
		GoogleLoginManager googleManager = new GoogleLoginManager();
		googleManager.register();
	}

	@Override
	public void loginWith() {
		GoogleLoginManager googleManager = new GoogleLoginManager();
		googleManager.login();
	}
}


