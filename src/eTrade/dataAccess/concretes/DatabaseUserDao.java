package eTrade.dataAccess.concretes;

import java.util.List;

import eTrade.dataAccess.abstracts.UserDao;
import eTrade.entities.concretes.User;

public class DatabaseUserDao implements UserDao {

	@Override
	public void add(User user) {
		System.out.println("Kullan�c� kayd� yap�ld�: "+user.getEmail());
		
	}

	@Override
	public void delete(User user) {
		System.out.println("Kullan�c� silindi: "+user.getEmail());
		
	}

	@Override
	public void update(User user) {
		System.out.println("Kullan�c� bilgileri g�ncellendi: "+user.getEmail());
		
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
