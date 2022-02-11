package mx.spring.service;

import java.util.*;
import mx.spring.dao.*;
import mx.spring.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements IUserService{
	
	@Autowired
	private IUserDAO userDAO;
	
	@Override
	@Transactional(readOnly = true) 
	public List<User> listUser(){
		return (List<User>) userDAO.findAll();
	}
	
		@Override
		@Transactional
		public void save(User user) { 
			userDAO.save(user);		
		}

		@Override
		public void delete(User user) {
			userDAO.delete(user);
		}
		
		@Override
		@Transactional(readOnly = true) //Only query DB information
		public User findUser(User user) {
			return userDAO.findById(user.getUSER_ID()).orElse(null);
		}

	}


