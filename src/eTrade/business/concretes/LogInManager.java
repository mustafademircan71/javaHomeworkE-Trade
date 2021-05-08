package eTrade.business.concretes;

import eTrade.business.abstracts.LogInService;
import eTrade.entities.concretes.User;

public class LogInManager implements LogInService {

	@Override
	public void UserLogIn(User user) {
		if(user.getEmail()==null&&user.getPassword()==null) {
			System.out.println("Mail ya da Þifre Hatalý");
		}else{
			System.out.println("Giriþ Baþarýlý");
		}
		
	}
		
}
