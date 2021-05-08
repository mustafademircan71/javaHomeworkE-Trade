package eTrade.entities.concretes;

import eTrade.entities.abstracts.Entity;

public class User implements Entity {
		private int id;
		private String email;
		private String password;
		private String FirstName;
		private String LastName;
		
		public User() {
			
		}

		public User(int id, String email, String password, String firstName, String lastName) {
			super();
			this.id = id;
			this.email = email;
			this.password = password;
			FirstName = firstName;
			LastName = lastName;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getFirstName() {
			return FirstName;
		}

		public void setFirstName(String firstName) {
			FirstName = firstName;
		}

		public String getLastName() {
			return LastName;
		}

		public void setLastName(String lastName) {
			LastName = lastName;
		}
		
		
}
