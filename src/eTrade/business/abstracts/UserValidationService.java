package eTrade.business.abstracts;

import eTrade.entities.concretes.User;

public interface UserValidationService {
		boolean firstNameAndLastNameValid(User user);
		boolean passwordValid(User user);
		boolean mailValid(User user,String mail);
		boolean verify(User user);
}
