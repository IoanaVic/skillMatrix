package com.yonder.matrix.dao;

import java.util.HashMap;
import java.util.Map;

import javax.ejb.Stateless;

import com.yonder.matrix.model.User;

@Stateless
public class UserDAOImpl extends GenericDAO<User> implements UserDAO {

	public UserDAOImpl() {
		super(User.class);
	}

	@Override
	public User getById(int id) {
		// TODO Auto-generated method stub
		return null;
		
	}
	
	public User findUserByEmail(String email){
        Map<String, Object> parameters = new HashMap<String, Object>();
        parameters.put("email", email);     
 
        return super.findOneResult(User.FIND_BY_EMAIL, parameters);
    }

}
