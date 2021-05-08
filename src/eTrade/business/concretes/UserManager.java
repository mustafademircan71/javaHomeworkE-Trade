package eTrade.business.concretes;

import eTrade.business.abstracts.EmailSenderService;
import eTrade.business.abstracts.UserService;
import eTrade.business.abstracts.UserValidationService;
import eTrade.dataAccess.abstracts.UserDao;
import eTrade.entities.concretes.User;

public class UserManager implements UserService {

	private UserDao userDao;
	private UserValidationService userValidationService;
	private EmailSenderService emailSenderService;

	public UserManager(UserDao userDao, UserValidationService userValidationService,
			EmailSenderService emailSenderService) {
		super();
		this.userDao = userDao;
		this.userValidationService = userValidationService;
		this.emailSenderService=emailSenderService;
	}

	@Override
	public void addUser(User user) {
		if(userValidationService.verify(user)) {
			userDao.add(user);
			emailSenderService.MailSender(user);
		}
		
	}

}
