package eTrade.core.concretes;

import eTrade.core.abstracts.GoogleAuthService;
import eTrade.entities.concretes.User;
import eTrade.googleAuth.GoogleAuth;

public class GoogleAuthManager implements GoogleAuthService{

	@Override
	public void googleSignUp(User user) {
		GoogleAuth googleAuth=new GoogleAuth();
		googleAuth.signUp(user.getEmail(), user.getPassword());
		
	}

	@Override
	public void googleSignIn(User user) {
		GoogleAuth googleAuth=new GoogleAuth();
		googleAuth.signIn(user.getEmail(), user.getPassword());
		
	}
		
}
