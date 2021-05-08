package eTrade;

import eTrade.business.abstracts.LogInService;
import eTrade.business.abstracts.UserService;
import eTrade.business.concretes.EmailSenderManager;
import eTrade.business.concretes.LogInManager;
import eTrade.business.concretes.UserManager;
import eTrade.business.concretes.UserValidationManager;
import eTrade.core.abstracts.GoogleAuthService;
import eTrade.core.concretes.GoogleAuthManager;
import eTrade.dataAccess.concretes.DatabaseUserDao;
import eTrade.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		User user=new User(1,"mustafademircan71@gmail.com","123456","Mustafa","Demircan");

		UserService userService=new UserManager(new DatabaseUserDao(),new UserValidationManager(),
				new EmailSenderManager());
		userService.addUser(user);
		
		LogInService logInService=new LogInManager();
		logInService.UserLogIn(user);
		
		GoogleAuthService googleAuthService=new GoogleAuthManager();
		googleAuthService.googleSignUp(user);
		googleAuthService.googleSignIn(user);
		
		
	}

}
