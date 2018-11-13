package com.backend.DAO;

import com.backend.Model.Users;

public interface UserDAO {
	  public boolean addUsers(Users user);
      public Users validateUser(String email,String pass);

}
