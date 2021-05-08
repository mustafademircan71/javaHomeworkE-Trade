package eTrade.core.abstracts;

import eTrade.entities.concretes.User;

public interface GoogleAuthService {
		void googleSignUp(User user);
		void googleSignIn(User user);
}
