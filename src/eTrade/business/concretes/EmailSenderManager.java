package eTrade.business.concretes;

import eTrade.business.abstracts.EmailSenderService;
import eTrade.entities.concretes.User;

public class EmailSenderManager implements EmailSenderService {

	@Override
	public void MailSender(User user) {
		System.out.println("Kullanıcıyı aktif etmek için "+user.getEmail()+" adresindeki linke tıklayınız");
		
	}
		
}
