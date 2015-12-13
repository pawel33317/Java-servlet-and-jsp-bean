package pl.haks.loginserv.service;

import java.util.HashMap;

import pl.haks.loginserv.dto.User;

public class LoginService {

	HashMap<String, String> users = new HashMap<String, String>();
	public LoginService() {
		users.put("pawel", "Pawe³ Czubak");
		users.put("karola", "Karolina Dygas");
	}
	public boolean authenticate(String userId, String password) {
		
		if (password == null || password.trim() == "") {
			return false;
		}
		return true;
	}
	
	public User getUserDetails(String userId) {
		User user = new User();
		user.setUserName(users.get(userId));
		user.setUserId(userId);
		return user;
	}
}
