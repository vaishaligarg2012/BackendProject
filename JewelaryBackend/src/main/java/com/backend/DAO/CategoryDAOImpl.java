package com.backend.DAO;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.backend.ConfigHiber.SessionFactoryProvider;
import com.backend.Model.Category;
import com.backend.Model.Users;

public class CategoryDAOImpl implements CategoryDAO{
	SessionFactory sf=SessionFactoryProvider.getSessionFactory();

	public boolean addCategory(Category cad) {
		// TODO Auto-generated method stub
		
		try {

			Session session=sf.openSession();
			Transaction tx=session.beginTransaction();
			session.save(cad);
			tx.commit();
			session.close();
			return true;
		}
		catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}

	public List<Category> viewAllCategory() {
		// TODO Auto-generated method stub
		Session session=sf.openSession();
	    Criteria c=session.createCriteria(Category.class);
	    List<Category> cList= c.list();
	   // System.out.println(cList);
        return cList;
	}

}
