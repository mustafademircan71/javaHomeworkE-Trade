package eTrade.dataAccess.concretes;

import java.util.List;

import eTrade.dataAccess.abstracts.UserDao;
import eTrade.entities.concretes.User;

public class DatabaseUserDao implements UserDao {

	@Override
	public void add(User user) {
		System.out.println("Kullanýcý kaydý yapýldý: "+user.getEmail());
		
	}

	@Override
	public void delete(User user) {
		System.out.println("Kullanýcý silindi: "+user.getEmail());
		
	}

	@Override
	public void update(User user) {
		System.out.println("Kullanýcý bilgileri güncellendi: "+user.getEmail());
		
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
