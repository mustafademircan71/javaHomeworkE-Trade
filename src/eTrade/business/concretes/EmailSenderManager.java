package eTrade.business.concretes;

import eTrade.business.abstracts.EmailSenderService;
import eTrade.entities.concretes.User;

public class EmailSenderManager implements EmailSenderService {

	@Override
	public void MailSender(User user) {
		System.out.println("Kullan�c�y� aktif etmek i�in "+user.getEmail()+" adresindeki linke t�klay�n�z");
		
	}
		
}
