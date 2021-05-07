package BesinciGunOdev1.business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import BesinciGunOdev1.business.abstracts.CheckService;

public class CheckManager implements CheckService{

	@Override
	public boolean checkFirstName(String firstName) {
		if (firstName.length() >= 2) {
			return true;
		} else {
			throw new ArithmeticException("Adýnýz en az 2 karakter olmalýdýr.");
		}
	}

	@Override
	public boolean checkLastname(String lastName) {
		if (lastName.length() >= 2) {
			return true;
		} else {
			throw new ArithmeticException("Soyadýnýz en az 2 karakter olmalýdýr.");
		}
	}

	@Override
	public boolean checkEmail(String email) {
		Pattern pattern = Pattern.compile("^([\\w-\\.]+){1,64}@([\\w&&[^_]]+){2,255}.[a-z]{2,}$");
		Matcher matcher = pattern.matcher(email);
		boolean matchFound = matcher.find();
		if (!email.isEmpty() && matchFound) {
			return true;
		} else {
			throw new ArithmeticException("Geçerli bir e-mail adresi girmediniz.");
		}
	}

	@Override
	public boolean checkPassword(String password) {
		if (password.length() >= 6) {
			return true;
		} else {
			throw new ArithmeticException("Þifreniz en az 6 karakter olmalýdýr.");
		}
	}

	
}
