package eTrade.business.abstracts;

import eTrade.entities.concretes.User;

public interface EmailSenderService {
		void MailSender(User user);
}
