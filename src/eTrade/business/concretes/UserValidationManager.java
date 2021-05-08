package eTrade.business.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eTrade.business.abstracts.UserValidationService;
import eTrade.entities.concretes.User;

public class UserValidationManager implements UserValidationService {

	private List<User> users= new ArrayList<User>();
	
	@Override
	public boolean firstNameAndLastNameValid(User user) {
		if(user.getFirstName().length()<2&&user.getLastName().length()<2) {
			System.out.println("Ad soyad en az iki karakterden oluþmalýdýr.");
			return false;
		}
		return true;
	}

	@Override
	public boolean passwordValid(User user) {
		if(user.getPassword().length()<6) {
			System.out.println("Parola en az 6 karakterden oluþmalýdýr.");
			return false;
		}
		return true;
	}

	@Override
	public boolean mailValid(User user, String mail) {
		String regex="^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
		
		Pattern p=Pattern.compile(regex);
		Matcher m=p.matcher(user.getEmail());
		
		if(!m.matches()) {
			System.out.println("Mail adresi formatýnda giriniz");
			return false;
		}
		
		for (User emailCheck : users) {
			if(mail==emailCheck.getEmail()) {
				System.out.println("Bu Email ile kayýtlý kullanýcý zaten var");
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean verify(User user) {
		if(firstNameAndLastNameValid(user)&&passwordValid(user)&&mailValid(user, user.getEmail())) {
			users.add(user);
			return true;
		}
		return false;
	}

}
