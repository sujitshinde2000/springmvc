package springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springmvc.dao.UserDao;
import springmvc.model.User;

@Service
public class UserService {
	
	@Autowired
	private UserDao userDao;
	
	public int createUser(User user) {
		
		return this.userDao.saveUser(user);
		
	}

	public UserService(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	public UserService() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	

}
