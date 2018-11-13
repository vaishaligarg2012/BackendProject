package com.backend.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.backend.ConfigHiber.SessionFactoryProvider;
import com.backend.Model.Users;

public class UserDaoImpl implements UserDAO {
	SessionFactory sf=SessionFactoryProvider.getSessionFactory();

	public boolean addUsers(Users user) {
		// TODO Auto-generated method stub
		try {

			Session session=sf.openSession();
			Transaction tx=session.beginTransaction();
			session.save(user);
			tx.commit();
			session.close();
			return true;
		}
		catch(Exception e){
			e.printStackTrace();
			return false;
		}

	}


	public Users validateUser(String  email,String pass) {
		// TODO Auto-generated method stub
		try {
			Session session=sf.openSession();
			Users users = (Users)session.get(Users.class,email);
			System.out.println(users.getFName());
			if(users!=null){
				if(users.getPassword().equals(pass)){
					return users;
				}
			}


		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
